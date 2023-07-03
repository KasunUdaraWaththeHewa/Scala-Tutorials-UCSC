object Convert {
  def convert(celsious:Double):Double={
    celsious*1.8+32
  }
  def main(args: Array[String]) : Unit = {
    println("Temperature in farenheit : "+convert(35))
  }
}
