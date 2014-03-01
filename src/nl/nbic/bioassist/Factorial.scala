package nl.nbic.bioassist

/**
 * The classic factorial for big numbers, which looks a lot better in Scala than in Java.
 */
object Factorial extends App {
  /**
   * The classic factorial function.
   */
  def factorial(n: BigInt): BigInt =
    if (n <= 0) 1 else n * factorial(n - 1)

  val n = 42
  println(n + "! = " + factorial(n))
}
