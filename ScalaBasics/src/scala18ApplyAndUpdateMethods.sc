object scala18ApplyAndUpdateMethods {

//*****************************************	APPLY METHOD	*****************************************

	//This apply method is present inside the companion object of the class
	//In scala, we sometimes don't use "new" on the object because that is present in the apply method
	val lst4 = List(1,2,3)                    //> lst4  : List[Int] = List(1, 2, 3)
	//So List is calling Apply method as shown below
	val lst5 = List.apply(1,2,3)              //> lst5  : List[Int] = List(1, 2, 3)
	lst4(0)                                   //> res0: Int = 1
	lst4.apply(0)                             //> res1: Int = 1
	
//**************************************************************************************************************

//*****************************************	UPDATE METHOD	*****************************************
	val arr = Array(1,2,3)                    //> arr  : Array[Int] = Array(1, 2, 3)
	arr(1)                                    //> res2: Int = 2
	arr(1) = 99
	arr                                       //> res3: Array[Int] = Array(1, 99, 3)
	
	//arr(1) = 99 is calling Update method as shown below
	arr.update(1, 99)
	arr                                       //> res4: Array[Int] = Array(1, 99, 3)
	
//**************************************************************************************************************
}