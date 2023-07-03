object programThree {
  val normalHour=250
  val otHour=85

  def calculate(n: Int, o: Int): Unit = {
    var total :Double=n*normalHour+o*otHour
    total=total*0.88
    println("Take home salary : "+total)
  }
  def main(args:Array[String]): Unit = {
    calculate(40,30);
  }
}
