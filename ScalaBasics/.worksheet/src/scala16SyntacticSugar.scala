object scala16SyntacticSugar {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 


	val a = Array(1,2,3,4);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(19); 
	a foreach println;$skip(252); val res$0 = 
	//Because of below code snippet, the entire code is not compiling so commented out.
	//def foo(i:Int):Unit = 8
	//foo(8)
	//foo{9}
	//foo{
		//println("hi")
		//7
	//}
	
	//fill function can be written in 2 ways. 1st one is preferred
	Array.fill(5)();System.out.println("""res0: Array[Unit] = """ + $show(res$0));$skip(19); val res$1 = 
	Array.fill(5)({});System.out.println("""res1: Array[Unit] = """ + $show(res$1));$skip(162); 
	
	//Passby name
	//This is evaluated everytime I use it
	def myWhile(cond: => Boolean)(body: => Unit):Unit ={
		if(cond) {
			body
			myWhile(cond)(body)
		}
	};System.out.println("""myWhile: (cond: => Boolean)(body: => Unit)Unit""");$skip(38); 
	
	//Above is same as below.
	var i=0;System.out.println("""i  : Int = """ + $show(i ));$skip(41); 
	myWhile(i<5) {
		println(i)
		i += 1
	}}

}
