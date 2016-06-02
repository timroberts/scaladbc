import org.scalatest.FunSpec

class StackWithInvariantsTest extends FunSpec {

  describe("Scala invariants") {

    it("should not throw on satisfied invariants") {
      val stack = new StackWithInvariant[Double]()
      stack.push(1.0)
      assert(stack.pop === 1.0)
    }

    it("should throw on broken invariant based post-condition 1") {
      val stack = new StackWithInvariant[Double]()
      stack.push(1.0)
      intercept[AssertionError](stack.badpop() === 1.0)
    }

    it("should throw on broken invariant based post-condition 2") {
      val stack = new StackWithInvariant[Double]()
      intercept[AssertionError](stack.badpush(1.0))
    }

    it("should throw on broken invariant based pre-condition") {
      intercept[IllegalArgumentException](new StackWithInvariant[Double](initialSize = 1))
    }

  }

}
