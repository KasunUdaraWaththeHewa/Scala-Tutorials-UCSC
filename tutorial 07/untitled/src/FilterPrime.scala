object FilterPrime {
  def isPrime(n: Int, div: Int = 2): Boolean = {
      if (n <= 1) {
        false
      }else if (n == div) {
        true
      }else if (n % div == 0) {
        false
      }else {
        isPrime(n, div + 1)
      }
  }
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => isPrime(number))
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val output = filterPrime(input);
    println(output);
  }

}
