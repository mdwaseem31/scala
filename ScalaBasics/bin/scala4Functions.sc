object scala4Functions {

  val a = 5                                       //> a  : Int = 5

	//First "Double" is the type of argument and is required whereas second "Double" is the return type and is optional but it is a good practice to use.
	def square1(x:Double):Double = x*x        //> square1: (x: Double)Double
	square1(5)                                //> res0: Double = 25.0

	//Return Type is optional. Below doesn't specify the return type
	def square2(x:Double) = x*x               //> square2: (x: Double)Double
	square1(5)                                //> res1: Double = 25.0
	
	//Above can also be written in below 2 ways but below are not preferred. 1st method is preferred
	//without return statement
	def square3(x:Double):Double = {
		x*x
	}                                         //> square3: (x: Double)Double
	
	//with return statement
	def square4(x:Double):Double = {
		return x*x
	}                                         //> square4: (x: Double)Double
	
	
	
	//Unit - For functions that do not return anything (actually it does), its return type is Unit. The 1st function is the best practice.
	def greet1(name:String):Unit = {
		//println("Hello "+name)
		println(s"Hello, $name")
	}                                         //> greet1: (name: String)Unit
	greet1("Waseem")                          //> Hello, Waseem
	
	//When the function is not returning anything, we can skip return type and = as shown below
	def greet2(name:String) {
		println(s"Hello, $name")
	}                                         //> greet2: (name: String)Unit
	greet2("Mahenaz")                         //> Hello, Mahenaz
	
	//We get the same response if we just skip the return type but still keep the = sign
	def greet3(name:String) = {
		println(s"Hello, $name")
	}                                         //> greet3: (name: String)Unit
	greet2("Ifza")                            //> Hello, Ifza
	
}