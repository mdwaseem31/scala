object worksheet8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(312); 
  //def map[B] (f: (A) => B): Seq[B]
  //Above map method takes a function of type A (a Sequence) and returns some type B which can be whatever type we want
  //[Use case] Builds a new collection by applying a function to all elements of this immutable sequence.
  
  val a = Array(1,2,3,4,5);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(26); 
  val b = List(5,2,8,1,9);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(40); 
  val c = Vector.tabulate(10)(i => i*i);System.out.println("""c  : scala.collection.immutable.Vector[Int] = """ + $show(c ));$skip(21); 
  a.foreach(println);$skip(28); 
	a.foreach(i => println(i));$skip(177); val res$0 = 

//***********************************************	map	***********************************************

  //Long syntax for creating a map
	Map(("one",1),("two",2),("three",3));System.out.println("""res0: scala.collection.immutable.Map[String,Int] = """ + $show(res$0));$skip(49); 
  val map = Map(("one",1),("two",2),("three",3));System.out.println("""map  : scala.collection.immutable.Map[String,Int] = """ + $show(map ));$skip(13); val res$1 = 
  map("one");System.out.println("""res1: Int = """ + $show(res$1));$skip(121); val res$2 = 
  
  //Above is not a good way of writing. Below gives good readability.
  Map(("one" -> 1),("two" -> 2),("three" -> 3));System.out.println("""res2: scala.collection.immutable.Map[String,Int] = """ + $show(res$2));$skip(108); 
  //key and value can be anything
  val map1 = Map((1 -> "one"),('a' -> 2),("three" -> '3'), ('x' -> true));System.out.println("""map1  : scala.collection.immutable.Map[Any,Any] = """ + $show(map1 ));$skip(12); val res$3 = 
  map1('x');System.out.println("""res3: Any = """ + $show(res$3));$skip(45); val res$4 = 
  //modify map value
  map1 + ("three" -> 5);System.out.println("""res4: scala.collection.immutable.Map[Any,Any] = """ + $show(res$4));$skip(67); 
  val map2 = Map(1 -> 0, 10 -> 1, 100 -> 2, 1000 -> 3, 10000 -> 4);System.out.println("""map2  : scala.collection.immutable.Map[Int,Int] = """ + $show(map2 ));$skip(11); val res$5 = 
	map2(100);System.out.println("""res5: Int = """ + $show(res$5));$skip(133); val res$6 = 
	
	

	//i => i*2 is a simple lambda expression.
	//type of i is Int. Since a is an array of Int and i has to be Int
	a.map(i => i*2);System.out.println("""res6: Array[Int] = """ + $show(res$6));$skip(44); val res$7 = 
	//Above can also be written as
	a.map(_*2);System.out.println("""res7: Array[Int] = """ + $show(res$7));$skip(14); val res$8 = 
	a.map(_*2.0);System.out.println("""res8: Array[Double] = """ + $show(res$8));$skip(25); val res$9 = 
	a.map(_+" is a number");System.out.println("""res9: Array[String] = """ + $show(res$9));$skip(230); val res$10 = 
//***************************************************************************************************



//***********************************************	filter	***********************************************
	a.filter(i => i<5);System.out.println("""res10: Array[Int] = """ + $show(res$10));$skip(47); val res$11 = 
	//Above can also be written as
	a.filter(_<5);System.out.println("""res11: Array[Int] = """ + $show(res$11));$skip(15); val res$12 = 
	b.filter(_<5);System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(344); val res$13 = 
//***************************************************************************************************



//***********************************************	flatmap	***********************************************

	//Below is going to look up a value in array a and is going to give us back the first i elements of array b
	a.map(i => b.take(i));System.out.println("""res13: Array[List[Int]] = """ + $show(res$13));$skip(132); val res$14 = 

	//If I want above to return an array of single list rather than an array of lists then use flatMap
	a.map(i => b.take(i)).flatten;System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(59); val res$15 = 
	//Above can also be written as
	a.flatMap(i => b.take(i));System.out.println("""res15: Array[Int] = """ + $show(res$15));$skip(121); val res$16 = 

//***************************************************************************************************

	c.exists(_>100);System.out.println("""res16: Boolean = """ + $show(res$16));$skip(16); val res$17 = 
	c.exists(_>50);System.out.println("""res17: Boolean = """ + $show(res$17));$skip(17); val res$18 = 
	c.forall(_<100);System.out.println("""res18: Boolean = """ + $show(res$18));$skip(16); val res$19 = 
	c.forall(_<50);System.out.println("""res19: Boolean = """ + $show(res$19))}
	
	
}
