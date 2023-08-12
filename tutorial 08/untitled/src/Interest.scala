object Interest {
  val calculateInterest: Double => Double = {
    case amount if amount <= 20000 => 0.02 * amount
    case amount if amount <= 200000 => 0.04 * amount
    case amount if amount <= 2000000 => 0.035 * amount
    case amount => 0.065 * amount
  }

  def main(args: Array[String]): Unit = {
    val deposit1 = 15000
    val deposit2 = 100000
    val deposit3 = 500000
    val deposit4 = 2500000

    val interest1 = calculateInterest(deposit1)
    val interest2 = calculateInterest(deposit2)
    val interest3 = calculateInterest(deposit3)
    val interest4 = calculateInterest(deposit4)

    println(s"Deposit: Rs. $deposit1, Interest: Rs. $interest1")
    println(s"Deposit: Rs. $deposit2, Interest: Rs. $interest2")
    println(s"Deposit: Rs. $deposit3, Interest: Rs. $interest3")
    println(s"Deposit: Rs. $deposit4, Interest: Rs. $interest4")
  }
}