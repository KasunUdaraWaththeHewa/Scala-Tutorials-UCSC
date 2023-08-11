object FilterPrime {
  def isPrime(n: Int, divisor: Int = 2): Boolean = {
      if (n <= 1) {
        false
      }else if (n == divisor) {
        true
      }else if (n % divisor == 0) {
        false
      }else {
        isPrime(n, divisor + 1)
      }
  }
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => isPrime(number) && number != 1)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val output = filterPrime(input);
    println(output);
  }

}
