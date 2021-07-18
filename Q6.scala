object Q6 {
  def main(Args:Array[String]){
    FibonacciSeq(10)//display 20(2+4+6+8)
  }
  def FibonacciSeq(n:Int,i:Int=1,j:Int=0,k:Int=1):Any ={//function to return the fibonacci numbers for given n
    if(n<1){
      println("n should be greater than 0")//If user enter zero or negative number
    }
    else if(i>n){        
       println()
     }
    else if(i==1){
       print("Fist "+ n+" fibonacci numbers : "+j+" ")
       FibonacciSeq(n,i+1,k,j+k)
     }
    else{
       print(j+" ")
       FibonacciSeq(n,i+1,k,j+k)
     }
  }
}