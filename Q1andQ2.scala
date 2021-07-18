object Q1andQ2{
  def main(Args:Array[String]){
    println(5+" - "+prime(5))//return true
    println(8+" - "+prime(8))//return false
    PrimeSeq(10)//return all prime numbers less than 10
    
  }
  def prime(x:Int,y:Int = 2): Boolean= {//Function to return true for a prime number and false for the other
    if(x==y){
      return true
    }
    else if(x<2 || x%y==0){
      return false
    }
    else
      return prime(x,y+1)
  }
  def PrimeSeq(n:Int,i:Int=2):Any={//Function to print all	prime number which less than n
    if(n<=2){
      println("There is no prime numbers less than "+ n)
    }
    else if(i!=n){
      if(prime(i)){
        print(i+" ")
      }
      return PrimeSeq(n,i+1)
    }
    else{
      print("are prime numbers less than "+ n)
    }
  }
}