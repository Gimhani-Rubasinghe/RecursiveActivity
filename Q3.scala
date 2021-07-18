object Q3 {
  def main(Args:Array[String]){
    Sum(5)//display 15(1+2+3+4+5)
  }
  def Sum(n:Int,i:Int=1,result:Int=0):Any ={//function to return the addition of numbers from1 to n
    if(n<1){
      println("Please enter positive integer")
    }
    else if(i<=n){
      return Sum(n,i+1,result+i)
    }
    else{
      println(result)
    }
  }
}