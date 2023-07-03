object Volume {
  def volume(radius:Double):Double={
    (4/3.0)*3.14*radius*radius*radius
  }
  def main(args: Array[String]) : Unit = {
    println("Volume of sphere : "+volume(5))
  }
}
