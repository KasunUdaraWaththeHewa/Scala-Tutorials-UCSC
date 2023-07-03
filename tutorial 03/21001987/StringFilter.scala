object StringFilter{

	def filterString(list:List[String]):List[String] = {
		list.filter(_.length > 5)
		}
	def main(args:Array[String])={
		val list:List[String] = List("xyz","tot","women","hobbit","meat","elephant")
		println("Strings: "+ filterString(list).mkString(" "))
	}
}
	
				
