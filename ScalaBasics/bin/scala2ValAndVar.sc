object scala2ValAndVar {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val a = 5                                       //> a  : Int = 5
  var b = 5                                       //> b  : Int = 5
  var x, y, z = 0                                 //> x  : Int = 0
                                                  //| y  : Int = 0
                                                  //| z  : Int = 0
  
  b = 7		//can change var
  b                                               //> res0: Int = 7
  //a = 7		Cannot change val
  // val c		Cannot just declare. It has to be initialized. This applies to both val and var

	//Below are tuples
	val (c,d) = (3,'h')                       //> c  : Int = 3
                                                  //| d  : Char = h
  (6,7)                                           //> res1: (Int, Int) = (6,7)
 	(2.5, 'a')                                //> res2: (Double, Char) = (2.5,a)
 	(3,4.2,"hi")                              //> res3: (Int, Double, String) = (3,4.2,hi)

}