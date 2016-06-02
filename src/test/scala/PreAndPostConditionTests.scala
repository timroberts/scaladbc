import org.scalatest.FunSpec

class PreAndPostConditionTests extends FunSpec {

  describe("Scala pre-conditions") {

    it("should throw on bad arguments") {
      intercept[IllegalArgumentException](PrePostConditionExample.addNaturals(List(1,2,3,-1)))
    }

    it("should not throw on good arguments") {
      PrePostConditionExample.addNaturals(List(1,2,3))
    }

  }

  describe("Scala post-conditions") {

    it("should throw on bad returns") {
      intercept[AssertionError](PrePostConditionExample.addNaturalsPostOnly(List(0,-1)))
    }

    it("should not throw on good returns") {
      PrePostConditionExample.addNaturalsPostOnly(List(0,1))
    }

  }

}
