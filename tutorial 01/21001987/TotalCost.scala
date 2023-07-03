object Cost {
  def cost(copies:Int):Double= {
    if (copies<=50) {
      (copies*24.95*0.6+copies*3)
    }else{
      ((copies*24.95*0.6)+(50*3)+(copies-50)*0.75)
    }
  }
  def main(args: Array[String]) : Unit = {
    println("Total Cost : "+cost(60))
  }
}
