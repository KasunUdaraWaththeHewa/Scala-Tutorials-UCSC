class Account(var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def applyInterest(): Unit = {
    val interestRate = if (balance >= 0) 0.05 else 0.1
    balance *= (1 + interestRate)
  }

  override def toString: String = s"Balance: $balance"
}

object Bank {
  def negativeBalances(accounts: List[Account]): List[Account] =
    accounts.filter(_.balance < 0)

  def sumOfBalances(accounts: List[Account]): Double =
    accounts.map(_.balance).sum

  def applyInterestToAll(accounts: List[Account]): Unit =
    accounts.foreach(_.applyInterest())
}

object Four extends App {
  val accounts = List(
    new Account(1000.0),
    new Account(-500.0),
    new Account(200.0),
    new Account(-300.0)
  )

  println("Negative balance accounts:")
  val negativeBalances = Bank.negativeBalances(accounts)
  negativeBalances.foreach(println)

  val totalBalance = Bank.sumOfBalances(accounts)
  println(s"\nTotal balance of all accounts: $totalBalance")

  Bank.applyInterestToAll(accounts)
  println("\nFinal balances after applying interest:")
  accounts.foreach(println)
}
