

object Q7 {
      var result: Int = 1;

  def main(args: Array[String]): Unit={
            println(fastPower(3,2))    
  }
  
  
    def fastPower(x: Int, n: Int): Int={
     var a = n
     var b = x
      if(a%2!=0)
        return b*fastPower(b,a-1)
      if(a==0) 
        return 1
      else
        {result=fastPower(b,a/2)
        return result*result}
      
      }
}
    
    
//2^4
 
    
  
  


// if n is 10, 
