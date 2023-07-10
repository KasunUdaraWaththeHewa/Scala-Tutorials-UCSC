object Prime {
  def isPrime(n: Int, divisor: Int = 2): Boolean = {
    if (n <= 2)
      return n == 2

    if (n % divisor == 0)
      return false

    if (divisor * divisor > n)
      return true

    isPrime(n, divisor + 1)
  }

  def main(args: Array[String]): Unit = {
    println("Number is Prime : "+isPrime(2));
  }
}