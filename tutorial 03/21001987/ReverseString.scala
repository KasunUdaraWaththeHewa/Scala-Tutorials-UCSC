object ReverseString{
	def reverseString(input:String):String = {
		if(input.isEmpty) {
			""
		} else {
			reverseString(input.tail) + input.head
		}
	}

	def main(args:Array[String])={
		var str:String = args(0)
		println("Reversed String: " + reverseString(str))
	}
}
