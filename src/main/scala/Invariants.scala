import scala.collection.mutable.ListBuffer

trait Invariants {

  private val invariants = new ListBuffer[() => Boolean]

  protected def invariant(cond: => Boolean) =  invariants += (() => cond)

  protected def step[T](body: => T): T = {
    preCheck()
    val result = body
    postCheck()
    result
  }

  // notice require
  // protected to allow checking after construction
  protected def preCheck() = for (inv <- invariants) require(inv())

  private def postCheck() = for (inv <- invariants) assert(inv()) // notice assert, same as ensures

}
