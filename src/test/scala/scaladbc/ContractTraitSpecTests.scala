package scaladbc

import org.scalatest.FunSpec

class ContractTraitSpecTests extends FunSpec {

  describe("Trait based specs") {

    it("should throw on broken pre-condition") {
      intercept[IllegalArgumentException](MyMath.sqrt(-1))
    }

    it("should throw on broken post condition") {
      val x = Double.MaxValue
      val sqrtx = Math.sqrt(x)
      val diff = Math.abs(sqrtx*sqrtx-x)
      //println(diff<MyMath.epsilon)
      intercept[AssertionError](MyMath.sqrt(x))
    }

  }

}
