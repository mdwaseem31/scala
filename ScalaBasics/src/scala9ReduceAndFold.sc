object scala9ReduceAndFold {
//***********************************************	reduce	***********************************************
	val a = Array(5,2,9,3,1,8,6)              //> a  : Array[Int] = Array(5, 2, 9, 3, 1, 8, 6)
	//Add up all the elements
	//Take 5 and add it to 2 which becomes 7. Then it took 7 and added it to 9 and so on.....
	a.reduceLeft((x,y) => x+y)                //> res0: Int = 34
	
	
	//Above can also be written in simple way as shown below
	a.reduceLeft(_+_)                         //> res1: Int = 34
	
	//we could have got the same value by calling sum
	a.sum                                     //> res2: Int = 34
	
	//It takes first 2 values from left (5,2) then prints (5, 2) then substract 5 and 2 then it sends 3 as the first argument to the reduceLeft function next time. So next time, the arguments are (3,9).....this continues until it reaches the end of array
	a.reduceLeft((a,b) => {println(a+", "+b); a-b})
                                                  //> 5, 2
                                                  //| 3, 9
                                                  //| -6, 3
                                                  //| -9, 1
                                                  //| -10, 8
                                                  //| -18, 6
                                                  //| res3: Int = -24
 	//reduceRight works from the back end of the list and the accumulator winds up being the 2nd argument so we had our 6 and 8
 	a.reduceRight((a,b) => {println(a+", "+b); a-b})
                                                  //> 8, 6
                                                  //| 1, 2
                                                  //| 3, -1
                                                  //| 9, 4
                                                  //| 2, 5
                                                  //| 5, -3
                                                  //| res4: Int = 8
                                                  
	                                          
	
 //Note: Both arguments (a,b) has to be of the same type as the type of our collection. In this case, the arguments and array is of type Int. And the output has to be of the same type.
 //So reduce doesn't give us much flexibility as far as the types go. We can get around that if we do a fold operation.
//***************************************************************************************************************

//***********************************************	fold	*********************************************************
	//Below is working same as reduce. All elements are of type Int
	//Initial value of sum is 0. It took 0 and then added it to 5. Then it took 5 and added it to 2 which becomes 7. Then it took 7 and added it to 9 and so on....
	a.foldLeft(0)(_+_)                        //> res5: Int = 34
	
	//In below example, it takes Int array and converts it into a string. This cannot be done by reduce.
	//The first value is null string which was concatenated with 5 (""+5) and it gave"5". Then "5" was concatenated with 2 ("5"+2) which produced "52",......
	a.foldLeft("")(_+_)                       //> res6: String = 5293186
	
	//To improve readability of above, do below
	a.foldLeft("")(_+_+",")                   //> res7: String = 5,2,9,3,1,8,6,

	//reduceRight example
	a.foldRight("")(_+_)                      //> res8: String = 5293186

//***************************************************************************************************************


}