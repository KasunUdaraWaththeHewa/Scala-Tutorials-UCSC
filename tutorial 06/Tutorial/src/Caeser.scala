import scala.io.StdIn

object Caeser {
  def encryption(text: String, key: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val encryptedChar = (base + (char - base + key) % 26).toChar
        encryptedChar
      } else {
        char
      }
    }
  }

  def decryption(text: String, key: Int): String = {
    encryption(text, 26 - key)
  }
  def main(args: Array[String]): Unit = {
    print("Enter your text : ");
    val text = StdIn.readLine();
    print("Enter your key : ");
    val key = StdIn.readLine().toInt;
    val encryptedText= encryption(text,key);
    println("Encrypted text is : "+encryptedText);
    val decryptedText=decryption(encryptedText,key);
    println("Decrypted text is : "+decryptedText);
  }
}