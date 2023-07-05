object Deposite {
  def interest(num :Double):Double={
    if(num<=20000){
        num*0.02
    }else if(num<=200000){
        num*0.04
    }else if(num<=2000000){
        num*0.035
    }else{
        num*0.065
    }
  }
  def main(args: Array[String]): Unit = {
    println("Interest is : "+interest(23000));
  }
}