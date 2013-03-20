package nl.nbic.bioassist

object Factorial extends App {
  def factorial(n: BigInt): BigInt =
    if (n <= 0) 1 else n * factorial(n - 1)

  val n = 42
  println(n + "! = " + factorial(n))
}
