object scala10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(221); 

//**************************************************	CASE CLASS	**************************************************
	//Till now we were using tuples to group data as shown below:
	val person = ("Mark",38);System.out.println("""person  : (String, Int) = """ + $show(person ));$skip(11); val res$0 = 
	person._1;System.out.println("""res0: String = """ + $show(res$0));$skip(11); val res$1 = 
	person._2;System.out.println("""res1: Int = """ + $show(res$1));$skip(48); 
	
	//Another way is to
	val (name,age) = person
	//Tuples are not good in reading and are not expressive
	//The other way to group data is to use classes
	//case classes are decorative
	//Below Person2 is a type (We have created our own type like Int, String,...). Since it is a type, it starts with upper case letter (Person). All types in scala starts with upper case letter (String, Int,...)
	case class Person(name:String,age:Int);System.out.println("""name  : String = """ + $show(name ));System.out.println("""age  : Int = """ + $show(age ));$skip(492); 
	//Below is the syntax for instantiating an instance of case class Person2
	val mark = Person("Mark",38);System.out.println("""mark  : scala10.Person = """ + $show(mark ));$skip(152); val res$2 = 
	//The use of case class is that we pull out the value using the name field as shown below. This is much more informative that than of tuple
	mark.name;System.out.println("""res2: String = """ + $show(res$2));$skip(10); val res$3 = 
	mark.age

	case class Vect(x:Double,y:Double,z:Double);System.out.println("""res3: Int = """ + $show(res$3));$skip(67); 
	val v = Vect(1,2,3);System.out.println("""v  : scala10.Vect = """ + $show(v ));$skip(5); val res$4 = 
	v.x;System.out.println("""res4: Double = """ + $show(res$4));$skip(69); 
	
	def magnitude(v:Vect):Double = math.sqrt(v.x*v.x+v.y*v.y+v.z*v.z);System.out.println("""magnitude: (v: scala10.Vect)Double""");$skip(14); val res$5 = 
	magnitude(v);System.out.println("""res5: Double = """ + $show(res$5));$skip(24); val res$6 = 
	magnitude(Vect(4,3,0));System.out.println("""res6: Double = """ + $show(res$6));$skip(287); 
//******************************************************************************************************************



//**************************************************	UDEMY	**************************************************
  val strs = "Welcome to the scala worksheet".split(" ");System.out.println("""strs  : Array[String] = """ + $show(strs ));$skip(28); 
  val lst = List(1,2,3,4,5);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(23); val res$7 = 
  "5:36:43".split(":");System.out.println("""res7: Array[String] = """ + $show(res$7));$skip(112); 
  //I can take it into separate variables as shown below
  val Array(hour,minute,second) = "5:36:43".split(":");System.out.println("""hour  : String = """ + $show(hour ));System.out.println("""minute  : String = """ + $show(minute ));System.out.println("""second  : String = """ + $show(second ));$skip(17); val res$8 = 
  
  List(1,2,3);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(86); val res$9 = 
  //Below is read as: 1 cons down to 2 cons down to 3 cons down to Nil
  1::2::3::Nil;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(308); 
  
  def listLength(lst:List[Int]):Int = lst match {
		case Nil => 0
		case h::t => 1+listLength(t)//if the array is not nil then it will have head and tail. This is a recursive function which keeps calling itself until it reaches the last element in the array and then breaks when the array becomes Nil
  };System.out.println("""listLength: (lst: List[Int])Int""");$skip(18); val res$10 = 
  listLength(lst);System.out.println("""res10: Int = """ + $show(res$10));$skip(89); val res$11 = 
  
  lst.find(_>2) match {
  	case None => "Not found"
  	case Some(i) => "Found "+i
  }
  
  //class is a keyword that we use for decoration
  case class Person2(name:String,age:Int);System.out.println("""res11: String = """ + $show(res$11));$skip(158); 
  
  val people = Array(Person2("Mark",40),Person("Amber",13));System.out.println("""people  : Array[Product with Serializable] = """ + $show(people ));$skip(34); 
  
  val Person2(n,a) = people(0);System.out.println("""n  : String = """ + $show(n ));System.out.println("""a  : Int = """ + $show(a ))}
 
 
//******************************************************************************************************************



}
