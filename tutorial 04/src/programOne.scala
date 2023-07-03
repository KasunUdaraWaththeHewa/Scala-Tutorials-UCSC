object programOne {
  var i,j,k: Int=2
  var m,n: Int=5
  var f: Float=12
  var g: Float=4
  var c : Char='X'

  def main(args:Array[String]): Unit = {
    // post fixes and prefixes are not avalible in scala so need to do operation manually
    println(k+12*m)
    println(m/j)
    println(n%j)
    println(m/j*j)
    println(f+10*5+g)
    //f) ++i * n
    i+=1
    println(i*n)
  }

}
