object AreaOfDisk {
  def area(radius:Double):Double={
    3.14*radius*radius
  }
  def main(args: Array[String]) : Unit = {
    println("Area of disk : "+area(5))
  }
}
