object Q6 {
  def main(Args:Array[String]){
    FibonacciSeq(10)//display 15(1+2+3+4+5)
  }
  def FibonacciSeq(n:Int,i:Int=1,j:Int=0,k:Int=1):Any ={//function to return the addition of numbers from1 to n
    if(n<1){
      println("Please enter positive integer")
    }
    else if(i>n){
       println()
     }
    else if(i==1){
       print("Fist "+ n+" fibonacci numbers : "+j+" ")
       FibonacciSeq(n,i+1,k,j+k)
     }
    /*else if(i==2){
       print(j+" ")
       FibonacciSeq(n,i+1,k,j+k)
     }*/
    
    else{
       print(j+" ")
       FibonacciSeq(n,i+1,k,j+k)
     }
  }
}