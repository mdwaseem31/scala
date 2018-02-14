object scala3IfStatementAndMatchExpression {

  val a = 5                                       //> a  : Int = 5
  val b = 15                                      //> b  : Int = 15
  var i = 5;                                      //> i  : Int = 5
  
	//*********************************************		IF STATEMENT	*********************************************
  if(a<9) println("less")                         //> less
  if(a>9) println("less") else println("more")    //> more
  
  //The outcome of if else can be captured in a variable. Notice the type of variable "next" is Int.
  val next = if (a%2==0) a/2 else 3*a+1           //> next  : Int = 16
  
  //Below is not returning anything
  if(a>9) println("less")
  
	//Types: AnyVal and Any (refer type hierarchy png file). A string is "Any" and int is "AnyVal"
  if(a>9) 4                                       //> res0: AnyVal = ()
  if(a>9) 4 else ()                               //> res1: AnyVal = ()
  if(a<9) "hi" else ()                            //> res2: Any = hi
  
  
  if(a>9) 4                                       //> res3: AnyVal = ()
  
	//************************************************************************************************************
 


 //*********************************************		MATCH EXPRESSION	*********************************************
  //MATCH EXPRESSION - 1
  //value of variable is matched
	val result1 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case 15 => "fifteen"
	}                                         //> result1  : String = fifteen

  //MATCH EXPRESSION - 2
  //Pattern _ is used and value of variable a is printed
	val result2 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case 3 => "three"
		case _ => "Something bigger, "+a
	}                                         //> result2  : String = Something bigger, 5

  //MATCH EXPRESSION - 3
  //Result = final case because i is creating a variable and it bounds to anything.
	val result3 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case i => "Something bigger, "+i
	}                                         //> result3  : String = Something bigger, 15
	
  //MATCH EXPRESSION - 4
  //Tuple usage in match Expression
	val result4 = (a*3,b) match {
		case (0,_) => "zero"
		case (_,0) => "one"
		case i => "Something bigger, "+i
	}                                         //> result4  : String = Something bigger, (15,15)
	
  //MATCH EXPRESSION - 5
  //Result = "Same as b" because b is creating a new variable and it binds to anything.
	val result5 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case b => "Same as b"
	}                                         //> result5  : String = Same as b
 
 
  //MATCH EXPRESSION - 6
  //To use variable b, it should be of type val and its value can be accessed as `b`
	val result6 = a*3 match {
		case 0 => "zero"
		case 1 => "one"
		case `b` => "Same as b"
		case i => "Something else, "+i
	}                                         //> result6  : String = Same as b
	
	//************************************************************************************************************

}