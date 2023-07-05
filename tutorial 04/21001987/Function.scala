object Function {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }
  def toLower(input: String): String = {
    input.toLowerCase()
  }
  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper));
    println(formatNames("Ni", toUpper)+formatNames("roshan", toLower));
    println(formatNames("Saman", toLower));
    println(formatNames("K", toUpper)+formatNames("umar",toLower)+formatNames("a",toUpper));
  }
}
