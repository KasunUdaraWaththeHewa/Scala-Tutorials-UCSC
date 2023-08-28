object LetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length)
    val totalLetterOccurrences = letterCounts.reduce((a, b) => a + b)
    totalLetterOccurrences
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalLetterOccurrences = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalLetterOccurrences")
  }
}
