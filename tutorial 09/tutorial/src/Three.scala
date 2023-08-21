class Accounts(initialBalance: Double) {
  private var balance: Double = initialBalance
  def getBalance: Double = balance
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }
  def transfer(amount: Double, targetAccount: Accounts): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    require(balance >= amount, "Insufficient balance for transfer")
    withdraw(amount)
    targetAccount.deposit(amount)
  }
}
object Three extends App {
  val account1 = new Accounts(1000.0)
  val account2 = new Accounts(500.0)
  println("Initial balances:")
  println(s"Account 1: ${account1.getBalance}")
  println(s"Account 2: ${account2.getBalance}")
  account1.deposit(200.0)
  account2.withdraw(100.0)
  println("\nAfter transactions:")
  println(s"Account 1: ${account1.getBalance}")
  println(s"Account 2: ${account2.getBalance}")
  account1.transfer(300.0, account2)
  println("\nAfter transfer:")
  println(s"Account 1: ${account1.getBalance}")
  println(s"Account 2: ${account2.getBalance}")
}
