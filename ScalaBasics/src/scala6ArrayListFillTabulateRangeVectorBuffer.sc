object scala6ArrayListFillTabulateRange {
	Array(1,2,3)                              //> res0: Array[Int] = Array(1, 2, 3)
	List(7.2,8,9)                             //> res1: List[Double] = List(7.2, 8.0, 9.0)
	//Char gets converted to some double value so never do this
	List(7.2,'a',9)                           //> res2: List[Double] = List(7.2, 97.0, 9.0)
	//type is AnyVal
	List(7.2,true,9)                          //> res3: List[AnyVal] = List(7.2, true, 9)
	//type is AnyVal
	List(7.2,"hi",9)                          //> res4: List[Any] = List(7.2, hi, 9)
	
	
	val arr = Array(1,2,3)                    //> arr  : Array[Int] = Array(1, 2, 3)
	val lst = List(7.2,4,9)                   //> lst  : List[Double] = List(7.2, 4.0, 9.0)
	arr(0)                                    //> res5: Int = 1
	lst(2)                                    //> res6: Double = 9.0
	
	//Arrays are mutable so I can change their values
	arr(0) = 99
	arr                                       //> res7: Array[Int] = Array(99, 2, 3)
	
	//Lists are immutable so their values cannot be changed. Below statement will give error
	//lst(0) = 99

	//Since lists are singly linked, I can add things at the start
	1::lst                                    //> res8: List[AnyVal] = List(1, 7.2, 4.0, 9.0)
	val lst2 = 1::lst                         //> lst2  : List[AnyVal] = List(1, 7.2, 4.0, 9.0)
	lst                                       //> res9: List[Double] = List(7.2, 4.0, 9.0)
	lst2                                      //> res10: List[AnyVal] = List(1, 7.2, 4.0, 9.0)
	
	//Nil operator returns a nill list
	Nil                                       //> res11: scala.collection.immutable.Nil.type = List()
	//Below is how to add elements to a nill list
	1::2::3::4::Nil                           //> res12: List[Int] = List(1, 2, 3, 4)

	
	def inputList(n:Int):List[Int] = {
		if(n<1) Nil else n::inputList(n-1)
	}                                         //> inputList: (n: Int)List[Int]
	inputList(5)                              //> res13: List[Int] = List(5, 4, 3, 2, 1)
	
	
//*****************************************	FILL FUNCTION	*****************************************
	//It doesn't make sense to create an int array with all 0s. That's why we use fill and tabulate
	new Array[Int](5)                         //> res14: Array[Int] = Array(0, 0, 0, 0, 0)
	
	//The reason why below fill function is returning 10 different values but not one same value 10 times is because the second argument to fill function is using a different symantic called passby name
	val arr1 = Array.fill(5)(0)               //> arr1  : Array[Int] = Array(0, 0, 0, 0, 0)
	val arr2 = Array.fill(10)(math.random)    //> arr2  : Array[Double] = Array(0.5283589730215162, 0.1837916178778375, 0.233
                                                  //| 92588224312127, 0.5229311478974812, 0.4557259414764553, 0.46904188104899447
                                                  //| , 0.794043314982458, 0.5566856027258315, 0.5382485013661477, 0.730288854065
                                                  //| 3818)
	//It works exactly same for a list
	val lst_2 = List.fill(10)(math.random)    //> lst_2  : List[Double] = List(0.6277982744133479, 0.7267777922007749, 0.8021
                                                  //| 808093477152, 0.5918452981754243, 0.22410089671212396, 0.4743376891783051, 
                                                  //| 0.1354107418262166, 0.2814545625129534, 0.9235333132419924, 0.3900380816380
                                                  //| 8074)

	//Understand what is passby name symantic
	def littleArray(i:Int):Array[Int] = Array(i,i,i)
                                                  //> littleArray: (i: Int)Array[Int]
	littleArray(5)                            //> res15: Array[Int] = Array(5, 5, 5)
	//util.Random.nextInt(10) will return a value between 0 and 9 inclusive
	littleArray(util.Random.nextInt(10))      //> res16: Array[Int] = Array(6, 6, 6)
	
	//Notice => is returning a different number
	def littleArray2(i: => Int):Array[Int] = Array(i,i,i)
                                                  //> littleArray2: (i: => Int)Array[Int]
	littleArray2(util.Random.nextInt(10))     //> res17: Array[Int] = Array(5, 0, 0)
	//passby name symantics gives us the ability to have this behavior that we see in fill
	
//**************************************************************************************************************


//*****************************************	TABULATE FUNCTION	*****************************************
	// 1st argument takes a list (here Int List). Second argument is a function and we pass lambda expression.
	//Meaning of below: 1st argument says it has 10 elements whose indexes are from 0 to 9. The first "i" in 2nd argument is index and second "i" is its value. It iterates from 0 to 9. At first when index=0 then value=0 then index=1 and value=1,.....
	val arr3 = Array.tabulate(10)(i => i)     //> arr3  : Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
	val lst3 = List.tabulate(10)(i => i*i)    //> lst3  : List[Int] = List(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
	lst3(3)                                   //> res18: Int = 9
//**************************************************************************************************************


  //Vector
  Vector(1,2,3)                                   //> res19: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  
  //Buffer
  import collection.mutable
  mutable.Buffer(5,6,7)                           //> res20: scala.collection.mutable.Buffer[Int] = ArrayBuffer(5, 6, 7)
  mutable.ListBuffer(7,8,9)                       //> res21: scala.collection.mutable.ListBuffer[Int] = ListBuffer(7, 8, 9)

//*****************************************	RANGE	*********************************************************
	//Below returns all values from 1 to 10 both inclusive
	1 to 10                                   //> res22: scala.collection.immutable.Range.Inclusive = Range 1 to 10
	//Above is same as calling a function as shown below
	(1).to(10)                                //> res23: scala.collection.immutable.Range.Inclusive = Range 1 to 10
	//Expected outcome for below function: 1,3,5,7,9
	1 to 10 by 2                              //> res24: scala.collection.immutable.Range = inexact Range 1 to 10 by 2
	(1 to 10 by 2).toArray                    //> res25: Array[Int] = Array(1, 3, 5, 7, 9)
	//It is mandatory to specify step interval for floats
	0.1 to 1.0 by 0.1                         //> res26: scala.collection.immutable.NumericRange[Double] = NumericRange 0.1 t
                                                  //| o 1.0 by 0.1
	//Below will not give any result
	10 to 1                                   //> res27: scala.collection.immutable.Range.Inclusive = empty Range 10 to 1
	//Specify step interval for backward range
	10 to 1 by -1                             //> res28: scala.collection.immutable.Range = Range 10 to 1 by -1

	(1).+(2)                                  //> res29: Int(3) = 3
	'a' to 'z'                                //> res30: scala.collection.immutable.NumericRange.Inclusive[Char] = NumericRan
                                                  //| ge a to z
	1 until 10                                //> res31: scala.collection.immutable.Range = Range 1 until 10
	'1' to 'z' by 3                           //> res32: scala.collection.immutable.NumericRange[Char] = NumericRange 1 to z 
                                                  //| by 
	
//**************************************************************************************************************

}