object PatternMatching {
  def find(num: Int): Unit = {
    if (num <= 0) {
      println("Negative/Zero");
    } else if ((num%2)!=0) {
      println("Odd");
    } else if ((num%2)==0) {
      println("Even");
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter Integer Input : ");
    val num = scala.io.StdIn.readInt()
    find(num);
  }
}
