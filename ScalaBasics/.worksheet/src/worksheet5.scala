object worksheet5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 

	//Recursive Function Example 1
	def factorial(n:Int):Int = if(n<2) 1 else n*factorial(n-1);System.out.println("""factorial: (n: Int)Int""");$skip(14); val res$0 = 
	factorial(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(190); 


	//Example 2
	//Memory in call stack
	//Youtube video link - https://www.youtube.com/watch?v=Wus60c4Ilek

	def countDown(n:Int):Unit = {
		if(n>0) {
			println(n)
			countDown(n-1)
		}
	};System.out.println("""countDown: (n: Int)Unit""");$skip(14); 
	countDown(5);$skip(81); 
	

	def countUp(n:Int):Unit = {
		if(n>0) {
			countUp(n-1)
			println(n)
		}
	};System.out.println("""countUp: (n: Int)Unit""");$skip(12); 
	countUp(5);$skip(909); 
	//Below explains why the function countUp has printed in ascending not in descending order.
	//First n=5 -> check if n>0 -> calls itself with n=4.
	//This goes on until n=0
	//Nothing has printed until now but there is memory in the call stack which remembers where we are.
	//Now when 0 is not >0, condition fails and 1 is printed. Then it prints 2 (this value is just sitting and waiting in the stack) and so on
	



//Example 3 - We are encountering StackOverflowError at 10000 (because lot of things held in memory)
//Consider a unit circle. Consider a unit square on the top quadrant of this circle. Area of circle is pie. Area of circle inside the top quadrant is pie/4. And the area of square is 1.
	def estimatePi(n:Int):Double = {
		def helper(n:Int):Double = {
			if(n<1) 0 else {
				val x = math.random
				val y = math.random
				(if(x*x+y*y<1) 1 else 0)+helper(n-1)
			}
		}
		helper(n)/n*4
	};System.out.println("""estimatePi: (n: Int)Double""");$skip(77); val res$1 = 
	//If I set estimatePi(10000) then I get StackOverflowError
	estimatePi(100)




	//Example 4 - Tail Recursive
	//We can do deep recursive calls if the function is tail recursive
	//A tail recursive function is a function where the last thing it has to do is just call itself and there are no operations waiting to happen on the call stack.
	//Above helper function is not tail recursive. Because after it calls itself, its value has to be added to its left part so there is something still happening after it calls itself
	//Logic is not changed in this function when compared to above
	//@tailrec will tell whether StackOverflow would occur for this function (Ex:add +1 at the end and it will give error during compilation and we then have to modify accordingly)
	import scala.annotation._;System.out.println("""res1: Double = """ + $show(res$1));$skip(945); 
	def estimatePi2(n:Int):Double = {
		@tailrec
		def helper(n:Int,sum:Int):Double = {
			if(n<1) sum else {
				val x = math.random
				val y = math.random
				helper(n-1,sum+(if(x*x+y*y<1) 1 else 0))
			}
		}
		helper(n,0)/n*4
	};System.out.println("""estimatePi2: (n: Int)Double""");$skip(21); val res$2 = 
	estimatePi2(100000);System.out.println("""res2: Double = """ + $show(res$2))}





}
