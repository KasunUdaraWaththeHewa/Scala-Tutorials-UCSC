object EvenOdd {
  def isEvenOrOdd(n: Int): String = {
    if (n == 0)
      return "Even"
    else if (n == 1)
      return "Odd"
    else if (n < 0)
      return isEvenOrOdd(-n)
    else
      return isEvenOrOdd(n - 2)
  }


  def main(args: Array[String]): Unit = {
    println("Even or Odd : "+isEvenOrOdd(11))
  }
}
