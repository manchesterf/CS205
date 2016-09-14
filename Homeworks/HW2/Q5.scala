
object Q5 {
  
  def pivotSort(lst:List[Int], n: Int): List[Int]={
     
    if(lst == Nil)
      lst:+n
    else if(lst.head<=n)
      lst.head::pivotSort(lst.tail, n)
    else {
       
      pivotSort(lst.tail, n):+lst.head
      
    }
  
}
  def main(args: Array[String]): Unit = {
    var list = List(1,4,9,6,3,10)
    println(pivotSort(list,5))
  }
}