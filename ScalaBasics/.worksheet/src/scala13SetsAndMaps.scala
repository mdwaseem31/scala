object scala13SetsAndMaps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(186); val res$0 = 


//****************************************************	Set	****************************************************
  //Set by default is immutable
  Set(1,2,3);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(56); 
  //A Set contains unique values
  val s = Set(1,2,3,3);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(25); val res$1 = 
  //Append a value
  s+4;System.out.println("""res1: scala.collection.immutable.Set[Int] = """ + $show(res$1));$skip(59); val res$2 = 
  //Appending a value to a Set will not change the Set
  s;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(15); 
  val s2 = s+4
  
  //To make Sets mutable, import collection.module
	import collection.mutable;System.out.println("""s2  : scala.collection.immutable.Set[Int] = """ + $show(s2 ));$skip(115); 
  val mutSet = mutable.Set(3,4,5);System.out.println("""mutSet  : scala.collection.mutable.Set[Int] = """ + $show(mutSet ));$skip(71); val res$3 = 
	//Appending a value to a mutable Set will change the Set
	mutSet += 6;System.out.println("""res3: scala13SetsAndMaps.mutSet.type = """ + $show(res$3));$skip(413); 
	
//**************************************************************************************************************


//****************************************************	Map	****************************************************
	//Map gives you ability to associate values of one type with key values of another type
	//The argument here needs to be tuples
	val m = Map(("Texas","Austin"),("Colorado","Denver"));System.out.println("""m  : scala.collection.immutable.Map[String,String] = """ + $show(m ));$skip(94); 
	//Above can also be written as
	val m1 = Map(("Texas" -> "Austin"),("Colorado" -> "Denver"));System.out.println("""m1  : scala.collection.immutable.Map[String,String] = """ + $show(m1 ));$skip(12); val res$4 = 
	m("Texas");System.out.println("""res4: String = """ + $show(res$4));$skip(32); val res$5 = 
	//1 -> 2 makes a tuple
	1 -> 2;System.out.println("""res5: (Int, Int) = """ + $show(res$5));$skip(44); val res$6 = 
	//It always makes a two tuple
	1 -> 2 -> 3;System.out.println("""res6: ((Int, Int), Int) = """ + $show(res$6));$skip(30); 
	
	val mutMap = mutable.Map();System.out.println("""mutMap  : scala.collection.mutable.Map[Nothing,Nothing] = """ + $show(mutMap ))}


//**************************************************************************************************************
	
	
}
