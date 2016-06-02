
trait MathSig {
  def sqrt(x: Double): Double
}

trait MathSpec extends MathSig {

  val epsilon = 0.00001

  abstract override def sqrt(x: Double): Double = {
    require(x >= 0)
    super.sqrt(x)
  } ensuring (r => Math.abs(r * r - x) < epsilon)

}

trait MathImpl extends MathSig {
  def sqrt(x: Double): Double = Math.sqrt(x)
}

object MyMath extends MathImpl with MathSpec

