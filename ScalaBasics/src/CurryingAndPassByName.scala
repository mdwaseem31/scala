

object CurryingAndPassByName {
  
  def main(args: Array[String]):Unit = {
    
    //Currying is the ability to apply arguments one at a time
//    val plus3 = add(3)_
//    val eight = plus3(5)
//    def add(x:Int)(y:Int):Int = x+y
    
//    //In below code snippet, value of a is always same
//    println(threeTuple(math.random))
//    def threeTuple(a:Double):(Double, Double, Double) = {
//      (a,a,a)
    
    // "a: => Double" is a call by name
    // Value of a is evaluated everytime
    println(threeTuple(math.random))
    def threeTuple(a: => Double):(Double, Double, Double) = {
      (a,a,a)
      

      
    }
    
  }
  
}