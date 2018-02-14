object scala15PartialFunctions {
  
  //Below is a full function which defines that it takes any integer and return any int
  def foo(i:Int):Int = 2                          //> foo: (i: Int)Int
  
  //A partial function does not provide an answer for every possible input value it can be given.
  //It provides an answer only for a subset of possible data, and defines the data it can handle.
  val pf:PartialFunction[Any,String] = {
  	case i:Int => "Number"
  	case s:String => "The string "+s
  }                                               //> pf  : PartialFunction[Any,String] = <function1>
  pf(5)                                           //> res0: String = Number
  pf("Hello")                                     //> res1: String = The string Hello
	
	//I can only pass either an Int or a String to the above partial function. Below will give error
	//pf('a')

}