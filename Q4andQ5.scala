object Q4andQ5 {
  def main(Args:Array[String]){
    IsOdd(3)
    IsOdd(6)
    SumEven(10)
  }
  def IsOdd(x:Int): Any = {
    if(x%2!=0){
      println(x+" is Odd number")
    }
    else{
      println(x+" is Even number")
    }
  }
  def IsEven(x:Int): Boolean = {
    if(x%2==0){
      return true
    }
    else{
      return false
    }
  }
  def SumEven(n:Int,i:Int=2,result:Int=0):Any = {
    if(n<1){
      println("Please enter positive integer")
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