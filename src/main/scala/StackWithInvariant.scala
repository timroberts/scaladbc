//constructor argument illustrates breaking invariant
class StackWithInvariant[T](initialSize:Int=0) extends Invariants {

  private var length = initialSize
  private var elems = List[T]()

  invariant(length == elems.length)
  preCheck()

  def push(elem: T): Unit = step {
    elems = elem :: elems
    length += 1
  }

  def pop(): T = step {
    require(length > 0)
    val first :: rest = elems
    elems = rest
    length -= 1
    first
  }

  def badpush(elem: T): Unit = step {
    elems = elem :: elems
    //length += 1
  }

  def badpop(): T = step {
    require(length > 0)
    val first :: rest = elems
    elems = rest
    //length -= 1
    first
  }

}
