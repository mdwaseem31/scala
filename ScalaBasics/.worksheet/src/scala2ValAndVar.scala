object scala2ValAndVar {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Welcome to the Scala worksheet");$skip(15); 
  
  val a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
  var b = 5;System.out.println("""b  : Int = """ + $show(b ));$skip(18); 
  var x, y, z = 0;System.out.println("""x  : Int = """ + $show(x ));System.out.println("""y  : Int = """ + $show(y ));System.out.println("""z  : Int = """ + $show(z ));$skip(29); 
  
  b = 7;$skip(4); val res$0 = 		//can change var
  b;System.out.println("""res0: Int = """ + $show(res$0));$skip(163); 
  //a = 7		Cannot change val
  // val c		Cannot just declare. It has to be initialized. This applies to both val and var

	//Below are tuples
	val (c,d) = (3,'h');System.out.println("""c  : Int = """ + $show(c ));System.out.println("""d  : Char = """ + $show(d ));$skip(8); val res$1 = 
  (6,7);System.out.println("""res1: (Int, Int) = """ + $show(res$1));$skip(13); val res$2 = 
 	(2.5, 'a');System.out.println("""res2: (Double, Char) = """ + $show(res$2));$skip(15); val res$3 = 
 	(3,4.2,"hi");System.out.println("""res3: (Int, Double, String) = """ + $show(res$3))}

}
