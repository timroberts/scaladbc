package scaladbc

import org.scalatest.FunSpec

class MathWithSpecTests extends FunSpec {

  describe("Trait based specs") {

    it("should throw on broken pre-condition") {
      intercept[IllegalArgumentException](MathWithSpec.sqrt(-1))
    }

    it("should throw on broken post condition") {
      val x = Double.MaxValue
      val sqrtx = Math.sqrt(x)
      val diff = Math.abs(sqrtx*sqrtx-x)
      //println(diff<MyMath.epsilon)
      intercept[AssertionError](MathWithSpec.sqrt(x))
    }

  }

}
