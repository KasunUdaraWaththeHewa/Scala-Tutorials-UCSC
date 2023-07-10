object Addition {
  def sum(n: Int): Int = {
    if (n <= 0)
      return 0

    return n + sum(n - 1)
  }
  def main(args: Array[String]): Unit = {
    println("Sum is : "+sum(5))
  }
}
