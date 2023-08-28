object TemperatureConverter {
  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5.0) + 32)
    val totalFahrenheit = fahrenheitTemperatures.reduce((a, b) => a + b)
    val averageFahrenheit = totalFahrenheit / temperatures.length.toDouble
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val inputTemperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
