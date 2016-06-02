object PrePostConditionExample {

  def addNaturals(nats: List[Int]): Int = {
    require(nats forall (_ >= 0), "List contains negative numbers")
    nats.sum
  } ensuring (_ >= 0)

  def addNaturalsPostOnly(nats: List[Int]): Int = {
    nats.sum
  } ensuring (_ >= 0)

}
