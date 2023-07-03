object programTwo {
  var a :Int =2
  var b :Int =3
  var c :Int =4
  var d :Int =5
  var k: Double = 4.3

  def main(args:Array[String]): Unit = {
    //postfix and prefixes are not in scala so we need to do that calculations manually

    //a) println( - -b * a + c *d - -);
    b-=1
    println( b * a + c *d);
    d-=1

    //b) println(a++);
    println(a);
    a+=1

    //c) println (–2 * ( g – k ) +c);
    var result: Double = -2 * (a - k) + c
    println(result)

    //d) println (c=c++);
    println(c)
    c+=1

    //e) println (c=++c*a++);

    c+=1
    println(c*a)
    c=c*a
    a+=1
  }

}
