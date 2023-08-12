object Format {
  val toUpper: String => String = input => input.toUpperCase()
  val toLower: String => String = input => input.toLowerCase()
  val formatNames: (String, String => String) => String = (name, formatter) => formatter(name)

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper))
  }
}
