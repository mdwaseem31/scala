object scala10FindAndOption {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  val b = List(5,2,8,1,9);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(151); val res$0 = 
  
  //we pass the predict and it will tell whether it is the thing that we're looking for
  //Below is read as "something equal to 8)
  b.find(_ ==8);System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(19); val res$1 = 
  b.find(_%3 == 0);System.out.println("""res1: Option[Int] = """ + $show(res$1));$skip(19); val res$2 = 
  b.find(_%7 == 0);System.out.println("""res2: Option[Int] = """ + $show(res$2));$skip(34); 
  
  
  val lst = List(1,2,3,4,5);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(52); val res$3 = 
  //In below, Option Type is None
  lst.find(_ > 6);System.out.println("""res3: Option[Int] = """ + $show(res$3));$skip(118); val res$4 = 
  //In below, Option Type is Some and it has returned the 1st matching value of the given predicate
  lst.find(_ > 3);System.out.println("""res4: Option[Int] = """ + $show(res$4));$skip(61); val res$5 = 
  //Below is how you can get the value
  lst.find(_ > 3).get;System.out.println("""res5: Int = """ + $show(res$5));$skip(181); val res$6 = 
  //Below will return error because there is no matching value
  //lst.find(_ > 6).get
  //To avoid error, we can return some default using getOrElse
  lst.find(_ > 6).getOrElse(0);System.out.println("""res6: Int = """ + $show(res$6));$skip(171); val res$7 = 
  
  //map can be used on the result of find just like it is used on array. "None" will have 0 element and "Some" will have one element in it.
  lst.find(_ > 6).map(_*2);System.out.println("""res7: Option[Int] = """ + $show(res$7));$skip(30); val res$8 = 
  
  lst.find(_ > 3).map(_*2);System.out.println("""res8: Option[Int] = """ + $show(res$8));$skip(99); val res$9 = 
  
  //I can also use match
  lst.find(_ > 3) match {
  	case Some(n) => n*5
  	case None => 0
  };System.out.println("""res9: Int = """ + $show(res$9));$skip(34); 
  
  val result = lst.find(_ > 3);System.out.println("""result  : Option[Int] = """ + $show(result ));$skip(43); val res$10 = 
  if (result.nonEmpty) result.get*5 else 0;System.out.println("""res10: Int = """ + $show(res$10));$skip(45); val res$11 = 
  
	lst.find(_%3 == 0).map(_/3).getOrElse(0);System.out.println("""res11: Int = """ + $show(res$11))}
  
}
