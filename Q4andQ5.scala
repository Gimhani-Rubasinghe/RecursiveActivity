object Q4andQ5 {
  def main(Args:Array[String]){
    //Check whether given number is odd or even(Q4)
    IsOdd(3)
    IsOdd(6)
    //get the addition of all even numbers less than given n(Q5)
    SumEven(10)
  }
  def IsEven(x:Int): Boolean = {//check whether given number is even or odd
    if(x%2==0){
      return true
    }
    else{
      return false
    }
  }
  def IsOdd(x:Int): Any = {
    if(!IsEven(x)){
      println(x+" is Odd number")
    }
    else{
      println(x+" is Even number")
    }
  }
  
  def SumEven(n:Int,i:Int=2,result:Int=0):Any = {//recursive function for get Sum of even numbers less than n
    if(n<1){
      println("Please enter positive integer")//If user enter  zero or negative number
    }
    else if(i<n){
      if(IsEven(i)){
        return SumEven(n,i+1,result+i)
      }
      else{
        return SumEven(n,i+1,result)
      }
    }
    else{
      println("Sum of Even numbers less than "+n+" : "+result)
    }
  }
}