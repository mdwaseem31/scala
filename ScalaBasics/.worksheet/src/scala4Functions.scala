object scala4Functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(37); 

  val a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(188); 

	//First "Double" is the type of argument and is required whereas second "Double" is the return type and is optional but it is a good practice to use.
	def square1(x:Double):Double = x*x;System.out.println("""square1: (x: Double)Double""");$skip(12); val res$0 = 
	square1(5);System.out.println("""res0: Double = """ + $show(res$0));$skip(96); 

	//Return Type is optional. Below doesn't specify the return type
	def square2(x:Double) = x*x;System.out.println("""square2: (x: Double)Double""");$skip(12); val res$1 = 
	square1(5);System.out.println("""res1: Double = """ + $show(res$1));$skip(171); 
	
	//Above can also be written in below 2 ways but below are not preferred. 1st method is preferred
	//without return statement
	def square3(x:Double):Double = {
		x*x
	};System.out.println("""square3: (x: Double)Double""");$skip(77); 
	
	//with return statement
	def square4(x:Double):Double = {
		return x*x
	};System.out.println("""square4: (x: Double)Double""");$skip(233); 
	
	
	
	//Unit - For functions that do not return anything (actually it does), its return type is Unit. The 1st function is the best practice.
	def greet1(name:String):Unit = {
		//println("Hello "+name)
		println(s"Hello, $name")
	};System.out.println("""greet1: (name: String)Unit""");$skip(18); 
	greet1("Waseem");$skip(153); 
	
	//When the function is not returning anything, we can skip return type and = as shown below
	def greet2(name:String) {
		println(s"Hello, $name")
	};System.out.println("""greet2: (name: String)Unit""");$skip(19); 
	greet2("Mahenaz");$skip(147); 
	
	//We get the same response if we just skip the return type but still keep the = sign
	def greet3(name:String) = {
		println(s"Hello, $name")
	};System.out.println("""greet3: (name: String)Unit""");$skip(16); 
	greet2("Ifza")}
	
}
