object worksheet6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(33); val res$0 = 
	Array(1,2,3);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(15); val res$1 = 
	List(7.2,8,9);System.out.println("""res1: List[Double] = """ + $show(res$1));$skip(78); val res$2 = 
	//Char gets converted to some double value so never do this
	List(7.2,'a',9);System.out.println("""res2: List[Double] = """ + $show(res$2));$skip(36); val res$3 = 
	//type is AnyVal
	List(7.2,true,9);System.out.println("""res3: List[AnyVal] = """ + $show(res$3));$skip(36); val res$4 = 
	//type is AnyVal
	List(7.2,"hi",9);System.out.println("""res4: List[Any] = """ + $show(res$4));$skip(28); 
	
	
	val arr = Array(1,2,3);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(25); 
	val lst = List(7.2,4,9);System.out.println("""lst  : List[Double] = """ + $show(lst ));$skip(8); val res$5 = 
	arr(0);System.out.println("""res5: Int = """ + $show(res$5));$skip(8); val res$6 = 
	lst(2);System.out.println("""res6: Double = """ + $show(res$6));$skip(66); 
	
	//Arrays are mutable so I can change their values
	arr(0) = 99;$skip(5); val res$7 = 
	arr;System.out.println("""res7: Array[Int] = """ + $show(res$7));$skip(180); val res$8 = 
	
	//Lists are immutable so their values cannot be changed. Below statement will give error
	//lst(0) = 99

	//Since lists are singly linked, I can add things at the start
	1::lst;System.out.println("""res8: List[AnyVal] = """ + $show(res$8));$skip(19); 
	val lst2 = 1::lst;System.out.println("""lst2  : List[AnyVal] = """ + $show(lst2 ));$skip(5); val res$9 = 
	lst;System.out.println("""res9: List[Double] = """ + $show(res$9));$skip(6); val res$10 = 
	lst2;System.out.println("""res10: List[AnyVal] = """ + $show(res$10));$skip(43); val res$11 = 
	
	//Nil operator returns a nill list
	Nil;System.out.println("""res11: scala.collection.immutable.Nil.type = """ + $show(res$11));$skip(64); val res$12 = 
	//Below is how to add elements to a nill list
	1::2::3::4::Nil;System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(79); 

	
	def inputList(n:Int):List[Int] = {
		if(n<1) Nil else n::inputList(n-1)
	};System.out.println("""inputList: (n: Int)List[Int]""");$skip(14); val res$13 = 
	inputList(5);System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(218); val res$14 = 
	
//*****************************************	FILL FUNCTION	*****************************************
	//It doesn't make sense to create an int array with all 0s. That's why we use fill and tabulate
	new Array[Int](5);System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(231); 
	
	//The reason why below fill function is returning 10 different values but not one same value 10 times is because the second argument to fill function is using a different symantic called passby name
	val arr1 = Array.fill(5)(0);System.out.println("""arr1  : Array[Int] = """ + $show(arr1 ));$skip(40); 
	val arr2 = Array.fill(10)(math.random);System.out.println("""arr2  : Array[Double] = """ + $show(arr2 ));$skip(76); 
	//It works exactly same for a list
	val lst_2 = List.fill(10)(math.random);System.out.println("""lst_2  : List[Double] = """ + $show(lst_2 ));$skip(94); 

	//Understand what is passby name symantic
	def littleArray(i:Int):Array[Int] = Array(i,i,i);System.out.println("""littleArray: (i: Int)Array[Int]""");$skip(16); val res$15 = 
	littleArray(5);System.out.println("""res15: Array[Int] = """ + $show(res$15));$skip(111); val res$16 = 
	//util.Random.nextInt(10) will return a value between 0 and 9 inclusive
	littleArray(util.Random.nextInt(10));System.out.println("""res16: Array[Int] = """ + $show(res$16));$skip(102); 
	
	//Notice => is returning a different number
	def littleArray2(i: => Int):Array[Int] = Array(i,i,i);System.out.println("""littleArray2: (i: => Int)Array[Int]""");$skip(39); val res$17 = 
	littleArray2(util.Random.nextInt(10));System.out.println("""res17: Array[Int] = """ + $show(res$17));$skip(704); 
	//passby name symantics gives us the ability to have this behavior that we see in fill
	
//**************************************************************************************************************


//*****************************************	TABULATE FUNCTION	*****************************************
	// 1st argument takes a list (here Int List). Second argument is a function and we pass lambda expression.
	//Meaning of below: 1st argument says it has 10 elements whose indexes are from 0 to 9. The first "i" in 2nd argument is index and second "i" is its value. It iterates from 0 to 9. At first when index=0 then value=0 then index=1 and value=1,.....
	val arr3 = Array.tabulate(10)(i => i);System.out.println("""arr3  : Array[Int] = """ + $show(arr3 ));$skip(40); 
	val lst3 = List.tabulate(10)(i => i*i);System.out.println("""lst3  : List[Int] = """ + $show(lst3 ));$skip(9); val res$18 = 
	lst3(3);System.out.println("""res18: Int = """ + $show(res$18));$skip(142); val res$19 = 
//**************************************************************************************************************


  //Vector
  Vector(1,2,3)
  
  //Buffer
  import collection.mutable;System.out.println("""res19: scala.collection.immutable.Vector[Int] = """ + $show(res$19));$skip(66); val res$20 = 
  mutable.Buffer(5,6,7);System.out.println("""res20: scala.collection.mutable.Buffer[Int] = """ + $show(res$20));$skip(28); val res$21 = 
  mutable.ListBuffer(7,8,9);System.out.println("""res21: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$21));$skip(174); val res$22 = 

//*****************************************	RANGE	*********************************************************
	//Below returns all values from 1 to 10 both inclusive
	1 to 10;System.out.println("""res22: scala.collection.immutable.Range.Inclusive = """ + $show(res$22));$skip(66); val res$23 = 
	//Above is same as calling a function as shown below
	(1).to(10);System.out.println("""res23: scala.collection.immutable.Range.Inclusive = """ + $show(res$23));$skip(64); val res$24 = 
	//Expected outcome for below function: 1,3,5,7,9
	1 to 10 by 2;System.out.println("""res24: scala.collection.immutable.Range = """ + $show(res$24));$skip(24); val res$25 = 
	(1 to 10 by 2).toArray;System.out.println("""res25: Array[Int] = """ + $show(res$25));$skip(74); val res$26 = 
	//It is mandatory to specify step interval for floats
	0.1 to 1.0 by 0.1;System.out.println("""res26: scala.collection.immutable.NumericRange[Double] = """ + $show(res$26));$skip(43); val res$27 = 
	//Below will not give any result
	10 to 1;System.out.println("""res27: scala.collection.immutable.Range.Inclusive = """ + $show(res$27));$skip(59); val res$28 = 
	//Specify step interval for backward range
	10 to 1 by -1;System.out.println("""res28: scala.collection.immutable.Range = """ + $show(res$28));$skip(11); val res$29 = 

	(1).+(2);System.out.println("""res29: Int(3) = """ + $show(res$29));$skip(12); val res$30 = 
	'a' to 'z';System.out.println("""res30: scala.collection.immutable.NumericRange.Inclusive[Char] = """ + $show(res$30));$skip(12); val res$31 = 
	1 until 10;System.out.println("""res31: scala.collection.immutable.Range = """ + $show(res$31));$skip(17); val res$32 = 
	'1' to 'z' by 3;System.out.println("""res32: scala.collection.immutable.NumericRange[Char] = """ + $show(res$32))}
	
//**************************************************************************************************************

}
