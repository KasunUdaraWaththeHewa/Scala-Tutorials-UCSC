object Mean{
	
	def average(num1:Int,num2:Int):Float = (num1.toFloat + num2.toFloat)/2
	
	def main(args:Array[String]) = {
		printf("Average: %.2f \n", average(46, 81))
		}
}
