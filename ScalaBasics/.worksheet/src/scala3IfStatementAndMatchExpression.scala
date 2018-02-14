object scala3IfStatementAndMatchExpression {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 

  val a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(13); 
  val b = 15;System.out.println("""b  : Int = """ + $show(b ));$skip(13); 
  var i = 5;System.out.println("""i  : Int = """ + $show(i ));$skip(138); ;
  
	//*********************************************		IF STATEMENT	*********************************************
  if(a<9) println("less");$skip(47); 
  if(a>9) println("less") else println("more");$skip(144); 
  
  //The outcome of if else can be captured in a variable. Notice the type of variable "next" is Int.
  val next = if (a%2==0) a/2 else 3*a+1;System.out.println("""next  : Int = """ + $show(next ));$skip(65); 
  
  //Below is not returning anything
  if(a>9) println("less");$skip(111); val res$0 = 
  
	//Types: AnyVal and Any (refer type hierarchy png file). A string is "Any" and int is "AnyVal"
  if(a>9) 4;System.out.println("""res0: AnyVal = """ + $show(res$0));$skip(20); val res$1 = 
  if(a>9) 4 else ();System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(23); val res$2 = 
  if(a<9) "hi" else ();System.out.println("""res2: Any = """ + $show(res$2));$skip(18); val res$3 = 
  
  
  if(a>9) 4;System.out.println("""res3: AnyVal = """ + $show(res$3));$skip(380); 
  
	//************************************************************************************************************
 


 //*********************************************		MATCH EXPRESSION	*********************************************
  //MATCH EXPRESSION - 1
  //value of variable is matched
	val result1 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case 15 => "fifteen"
	};System.out.println("""result1  : String = """ + $show(result1 ));$skip(205); 

  //MATCH EXPRESSION - 2
  //Pattern _ is used and value of variable a is printed
	val result2 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case 3 => "three"
		case _ => "Something bigger, "+a
	};System.out.println("""result2  : String = """ + $show(result2 ));$skip(212); 

  //MATCH EXPRESSION - 3
  //Result = final case because i is creating a variable and it bounds to anything.
	val result3 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case i => "Something bigger, "+i
	};System.out.println("""result3  : String = """ + $show(result3 ));$skip(177); 
	
  //MATCH EXPRESSION - 4
  //Tuple usage in match Expression
	val result4 = (a*3,b) match {
		case (0,_) => "zero"
		case (_,0) => "one"
		case i => "Something bigger, "+i
	};System.out.println("""result4  : String = """ + $show(result4 ));$skip(206); 
	
  //MATCH EXPRESSION - 5
  //Result = "Same as b" because b is creating a new variable and it binds to anything.
	val result5 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case b => "Same as b"
	};System.out.println("""result5  : String = """ + $show(result5 ));$skip(240); 
 
 
  //MATCH EXPRESSION - 6
  //To use variable b, it should be of type val and its value can be accessed as `b`
	val result6 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case `b` => "Same as b"
		case i => "Something else, "+i
	};System.out.println("""result6  : String = """ + $show(result6 ))}
	
	//************************************************************************************************************

}
