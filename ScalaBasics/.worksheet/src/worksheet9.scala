object worksheet9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(154); 
//***********************************************	reduce	***********************************************
	val a = Array(5,2,9,3,1,8,6);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(146); val res$0 = 
	//Add up all the elements
	//Take 5 and add it to 2 which becomes 7. Then it took 7 and added it to 9 and so on.....
	a.reduceLeft((x,y) => x+y);System.out.println("""res0: Int = """ + $show(res$0));$skip(82); val res$1 = 
	
	
	//Above can also be written in simple way as shown below
	a.reduceLeft(_+_);System.out.println("""res1: Int = """ + $show(res$1));$skip(61); val res$2 = 
	
	//we could have got the same value by calling sum
	a.sum;System.out.println("""res2: Int = """ + $show(res$2));$skip(303); val res$3 = 
	
	//It takes first 2 values from left (5,2) then prints (5, 2) then substract 5 and 2 then it sends 3 as the first argument to the reduceLeft function next time. So next time, the arguments are (3,9).....this continues until it reaches the end of array
	a.reduceLeft((a,b) => {println(a+", "+b); a-b});System.out.println("""res3: Int = """ + $show(res$3));$skip(177); val res$4 = 
 	//reduceRight works from the back end of the list and the accumulator winds up being the 2nd argument so we had our 6 and 8
 	a.reduceRight((a,b) => {println(a+", "+b); a-b});System.out.println("""res4: Int = """ + $show(res$4));$skip(878); val res$5 = 
                                                  
	                                          
	
 //Note: Both arguments (a,b) has to be of the same type as the type of our collection. In this case, the arguments and array is of type Int. And the output has to be of the same type.
 //So reduce doesn't give us much flexibility as far as the types go. We can get around that if we do a fold operation.
//***************************************************************************************************************

//***********************************************	fold	*********************************************************
	//Below is working same as reduce. All elements are of type Int
	//Initial value of sum is 0. It took 0 and then added it to 5. Then it took 5 and added it to 2 which becomes 7. Then it took 7 and added it to 9 and so on....
	a.foldLeft(0)(_+_);System.out.println("""res5: Int = """ + $show(res$5));$skip(280); val res$6 = 
	
	//In below example, it takes Int array and converts it into a string. This cannot be done by reduce.
	//The first value is null string which was concatenated with 5 (""+5) and it gave"5". Then "5" was concatenated with 2 ("5"+2) which produced "52",......
	a.foldLeft("")(_+_);System.out.println("""res6: String = """ + $show(res$6));$skip(72); val res$7 = 
	
	//To improve readability of above, do below
	a.foldLeft("")(_+_+",");System.out.println("""res7: String = """ + $show(res$7));$skip(46); val res$8 = 

	//reduceRight example
	a.foldRight("")(_+_);System.out.println("""res8: String = """ + $show(res$8))}

//***************************************************************************************************************



}
