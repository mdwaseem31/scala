object scala8MapFilterAndFlatMap {
  //def map[B] (f: (A) => B): Seq[B]
  //Above map method takes a function of type A (a Sequence) and returns some type B which can be whatever type we want
  //[Use case] Builds a new collection by applying a function to all elements of this immutable sequence.
  
  val a = Array(1,2,3,4,5)                        //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
  val b = List(5,2,8,1,9)                         //> b  : List[Int] = List(5, 2, 8, 1, 9)
  val c = Vector.tabulate(10)(i => i*i)           //> c  : scala.collection.immutable.Vector[Int] = Vector(0, 1, 4, 9, 16, 25, 36,
                                                  //|  49, 64, 81)
  a.foreach(println)                              //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
	a.foreach(i => println(i))                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5

//***********************************************	map	***********************************************

  //Long syntax for creating a map
	Map(("one",1),("two",2),("three",3))      //> res0: scala.collection.immutable.Map[String,Int] = Map(one -> 1, two -> 2, t
                                                  //| hree -> 3)
  val map = Map(("one",1),("two",2),("three",3))  //> map  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, two -> 2, 
                                                  //| three -> 3)
  map("one")                                      //> res1: Int = 1
  
  //Above is not a good way of writing. Below gives good readability.
  Map(("one" -> 1),("two" -> 2),("three" -> 3))   //> res2: scala.collection.immutable.Map[String,Int] = Map(one -> 1, two -> 2, t
                                                  //| hree -> 3)
  //key and value can be anything
  val map1 = Map((1 -> "one"),('a' -> 2),("three" -> '3'), ('x' -> true))
                                                  //> map1  : scala.collection.immutable.Map[Any,Any] = Map(1 -> one, a -> 2, thre
                                                  //| e -> 3, x -> true)
  map1('x')                                       //> res3: Any = true
  //modify map value
  map1 + ("three" -> 5)                           //> res4: scala.collection.immutable.Map[Any,Any] = Map(1 -> one, a -> 2, three 
                                                  //| -> 5, x -> true)
  val map2 = Map(1 -> 0, 10 -> 1, 100 -> 2, 1000 -> 3, 10000 -> 4)
                                                  //> map2  : scala.collection.immutable.Map[Int,Int] = Map(10 -> 1, 1 -> 0, 1000
                                                  //| 0 -> 4, 1000 -> 3, 100 -> 2)
	map2(100)                                 //> res5: Int = 2
	
	

	//i => i*2 is a simple lambda expression.
	//type of i is Int. Since a is an array of Int and i has to be Int
	a.map(i => i*2)                           //> res6: Array[Int] = Array(2, 4, 6, 8, 10)
	//Above can also be written as
	a.map(_*2)                                //> res7: Array[Int] = Array(2, 4, 6, 8, 10)
	a.map(_*2.0)                              //> res8: Array[Double] = Array(2.0, 4.0, 6.0, 8.0, 10.0)
	a.map(_+" is a number")                   //> res9: Array[String] = Array(1 is a number, 2 is a number, 3 is a number, 4 
                                                  //| is a number, 5 is a number)
//***************************************************************************************************



//***********************************************	filter	***********************************************
	a.filter(i => i<5)                        //> res10: Array[Int] = Array(1, 2, 3, 4)
	//Above can also be written as
	a.filter(_<5)                             //> res11: Array[Int] = Array(1, 2, 3, 4)
	b.filter(_<5)                             //> res12: List[Int] = List(2, 1)
//***************************************************************************************************



//***********************************************	flatmap	***********************************************

	//Below is going to look up a value in array a and is going to give us back the first i elements of array b
	a.map(i => b.take(i))                     //> res13: Array[List[Int]] = Array(List(5), List(5, 2), List(5, 2, 8), List(5,
                                                  //|  2, 8, 1), List(5, 2, 8, 1, 9))

	//If I want above to return an array of single list rather than an array of lists then use flatMap
	a.map(i => b.take(i)).flatten             //> res14: Array[Int] = Array(5, 5, 2, 5, 2, 8, 5, 2, 8, 1, 5, 2, 8, 1, 9)
	//Above can also be written as
	a.flatMap(i => b.take(i))                 //> res15: Array[Int] = Array(5, 5, 2, 5, 2, 8, 5, 2, 8, 1, 5, 2, 8, 1, 9)

//***************************************************************************************************

	c.exists(_>100)                           //> res16: Boolean = false
	c.exists(_>50)                            //> res17: Boolean = true
	c.forall(_<100)                           //> res18: Boolean = true
	c.forall(_<50)                            //> res19: Boolean = false
	
	
}