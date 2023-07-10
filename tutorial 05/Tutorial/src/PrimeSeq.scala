object PrimeSeq {
  def isPrime(num: Int, divisor: Int = 2): Boolean = {
    if (num <= 2)
      return num == 2

    if (num % divisor == 0)
      return false

    if (divisor * divisor > num)
      return true

    isPrime(num, divisor + 1)
  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current < n) {
      if (isPrime(current))
        print(current + " ")

      primeSeq(n, current + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

}
