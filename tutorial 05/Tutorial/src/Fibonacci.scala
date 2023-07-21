object Fibonacci {
  def fibonacci(n: Int): List[Int] = {
    if (n <= 0)
      return List()
    if (n == 1)
      return List(0)
    if (n == 2)
      return List(0, 1)
    val fibList = fibonacci(n - 1)
    val nextNumber = fibList(n - 2) + fibList(n - 3)
    return fibList :+ nextNumber
  }

  def fibonacciSequence(n: Int): Unit = {
    val fibList = fibonacci(n)
    println(fibList.mkString(", "))
  }

  def main(args: Array[String]): Unit = {
    fibonacciSequence(10)
  }
}
