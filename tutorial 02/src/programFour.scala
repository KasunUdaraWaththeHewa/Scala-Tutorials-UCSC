object programFour {
  var ticketPrice:Int=15
  var attendence :Int=120

  def findBetter(tp: Int, at: Int): Unit = {
    var methodOne = (tp - 5) * (at + 20) - 500 - (3 * (at + 20))
    var methodTwo = (tp + 5) * (at - 20) - 500 - (3 * (at - 20))
    if (methodOne > methodTwo) {
      printf("Decreasing ticket price by 5 will increase profit ");
    } else {
      printf("Increasing ticket price by 5 will increase profit ");
    }
  }

  def main(args:Array[String]): Unit = {
      findBetter(ticketPrice,attendence)
  }
}
