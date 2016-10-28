package scaladbc

import org.scalactic.Requirements
import org.scalatest.FunSpec

//Notice the import of the Scalatic Requirements Trait
class MacroContractTests extends FunSpec with Requirements {

  def negativeVersionOf(a:Double): Double = {
    require(a >= 0)
    -a
  }

  def nonNullFunction(a:String,b:String) = {
    // Can null check all the arguments in one go
    requireNonNull(a,b)
    a+b
  }

  describe("Macro pre-conditions (from Scalatic)") {

    it("should automatically provide helpful exception text from pre-conditions") {
      val exc = intercept[IllegalArgumentException] {
        negativeVersionOf(-1)
      }
      assert(exc.getMessage==="-1.0 was not greater than or equal to 0")
    }

    it("should allow easy non-null checking (first arg)") {
      assert(intercept[IllegalArgumentException] {
        nonNullFunction("foo",null)
      }.getMessage==="b was null")
    }

    it("should allow easy non-null checking (second arg)") {
      assert(intercept[IllegalArgumentException] {
        nonNullFunction(null,"foo")
      }.getMessage==="a was null")
    }

  }

}
