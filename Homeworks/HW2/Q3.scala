

object Q3 {
  
  def main(args: Array[String]): Unit={
    var mainlist = List(1,2,3,5,6);
    var list1: List[Int] =List()
    var list2: List[Int] =List()
    var list3: List[Int] =List()
    var count:Int =0
    
    
    
    def sortInsert(lst: List[Int],x:Int): List[Int]={
      //base case: if the element is smaller than head of the remaining list then break. 
      if (x>lst.last)
      {
        list3=lst:+x
                return lst

        
      }
      else if(x<lst.head)
      {
       list2=list2:::lst
       list2=x::list2
       list3=list1:::list2
        return lst
      }
      else
        list1=list1:+lst.head;
        //count = count + 1
        sortInsert(lst.tail,x)
      
    }
    println("HERE: "+ mainlist) 
  sortInsert(mainlist,7)
  println(list3)
 
}
}
//We will concatenate the list1, the element to be added and the last part which hasnt gone through recursion. 