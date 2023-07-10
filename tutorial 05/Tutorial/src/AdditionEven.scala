object AdditionEven {
  def sumEvenNumbers(n: Int): Int = {
    if (n <= 0)
      return 0

    val currentNumber = if (n % 2 == 0) n else n - 1
    return currentNumber + sumEvenNumbers(currentNumber - 2)
  }


  def main(args: Array[String]): Unit = {
    println(sumEvenNumbers(10));
  }
}
