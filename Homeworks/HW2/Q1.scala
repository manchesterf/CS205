

object Q1 {
 def main(args: Array[String]): Unit={
    
   
    def fact(x: Int): Int ={
    if (x == 0) 
      return 1 
    else 
      return x * fact(x - 1)
}
    println(fact(4));
}
}
 
 
   
   
 