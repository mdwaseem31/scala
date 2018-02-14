object scala11PatternsAndCaseClasses {

//**************************************************	CASE CLASS	**************************************************
	//Till now we were using tuples to group data as shown below:
	val person = ("Waseem Mohammed",25)       //> person  : (String, Int) = (Waseem Mohammed,25)
	person._1                                 //> res0: String = Waseem Mohammed
	person._2                                 //> res1: Int = 25
	
	//Another way is to
	val (name,age) = person                   //> name  : String = Waseem Mohammed
                                                  //| age  : Int = 25
	//Tuples are not good in reading and are not expressive
	//The other way to group data is to use case classes
	//case classes are decorative
	//Below Person2 is a type (We have created our own type like Int, String,...). Since it is a type, it starts with upper case letter (Person). All types in scala starts with upper case letter (String, Int,...)
	case class Person(name:String,age:Int)
	//Below is the syntax for instantiating an instance of case class Person2
	val waseem = Person("Waseem Mohammed",25) //> waseem  : scala11PatternsAndCaseClasses.Person = Person(Waseem Mohammed,25)
                                                  //| 
	//The use of case class is that we pull out the value using the name field as shown below. This is much more informative that than of tuple
	waseem.name                               //> res2: String = Waseem Mohammed
	waseem.age                                //> res3: Int = 25

	case class Vect(x:Double,y:Double,z:Double)
	val v = Vect(1,2,3)                       //> v  : scala11PatternsAndCaseClasses.Vect = Vect(1.0,2.0,3.0)
	v.x                                       //> res4: Double = 1.0
	
	def magnitude(v:Vect):Double = math.sqrt(v.x*v.x+v.y*v.y+v.z*v.z)
                                                  //> magnitude: (v: scala11PatternsAndCaseClasses.Vect)Double
	magnitude(v)                              //> res5: Double = 3.7416573867739413
	magnitude(Vect(4,3,0))                    //> res6: Double = 5.0
//******************************************************************************************************************



//**************************************************	UDEMY	**************************************************
  val strs = "Welcome to the scala worksheet".split(" ")
                                                  //> strs  : Array[String] = Array(Welcome, to, the, scala, worksheet)
  val lst = List(1,2,3,4,5)                       //> lst  : List[Int] = List(1, 2, 3, 4, 5)
  "5:36:43".split(":")                            //> res7: Array[String] = Array(5, 36, 43)
  //I can take it into separate variables as shown below
  val Array(hour,minute,second) = "5:36:43".split(":")
                                                  //> hour  : String = 5
                                                  //| minute  : String = 36
                                                  //| second  : String = 43
  
  List(1,2,3)                                     //> res8: List[Int] = List(1, 2, 3)
  //Below is read as: 1 cons down to 2 cons down to 3 cons down to Nil
  1::2::3::Nil                                    //> res9: List[Int] = List(1, 2, 3)
  
  def listLength(lst:List[Int]):Int = lst match {
		case Nil => 0
		case h::t => 1+listLength(t)//if the array is not nil then it will have head and tail. This is a recursive function which keeps calling itself until it reaches the last element in the array and then breaks when the array becomes Nil
  }                                               //> listLength: (lst: List[Int])Int
  listLength(lst)                                 //> res10: Int = 5
  
  lst.find(_>2) match {
  	case None => "Not found"
  	case Some(i) => "Found "+i
  }                                               //> res11: String = Found 3
  
  //class is a keyword that we use for decoration
  case class Person2(name:String,age:Int)
  
  val people = Array(Person2("Mark",40),Person("Amber",13))
                                                  //> people  : Array[Product with Serializable] = Array(Person2(Mark,40), Person
                                                  //| (Amber,13))
  
  val Person2(n,a) = people(0)                    //> n  : String = Mark
                                                  //| a  : Int = 40
 
 
//******************************************************************************************************************



}