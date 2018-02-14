object scala15PartialFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(148); 
  
  //Below is a full function which defines that it takes any integer and return any int
  def foo(i:Int):Int = 2;System.out.println("""foo: (i: Int)Int""");$skip(306); 
  
  //A partial function does not provide an answer for every possible input value it can be given.
  //It provides an answer only for a subset of possible data, and defines the data it can handle.
  val pf:PartialFunction[Any,String] = {
  	case i:Int => "Number"
  	case s:String => "The string "+s
  };System.out.println("""pf  : PartialFunction[Any,String] = """ + $show(pf ));$skip(8); val res$0 = 
  pf(5);System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
  pf("Hello");System.out.println("""res1: String = """ + $show(res$1))}
	
	//I can only pass either an Int or a String to the above partial function. Below will give error
	//pf('a')

}
