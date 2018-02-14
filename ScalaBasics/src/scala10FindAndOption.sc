object scala10FindAndOption {
  val b = List(5,2,8,1,9)                         //> b  : List[Int] = List(5, 2, 8, 1, 9)
  
  //we pass the predict and it will tell whether it is the thing that we're looking for
  //Below is read as "something equal to 8)
  b.find(_ ==8)                                   //> res0: Option[Int] = Some(8)
  b.find(_%3 == 0)                                //> res1: Option[Int] = Some(9)
  b.find(_%7 == 0)                                //> res2: Option[Int] = None
  
  
  val lst = List(1,2,3,4,5)                       //> lst  : List[Int] = List(1, 2, 3, 4, 5)
  //In below, Option Type is None
  lst.find(_ > 6)                                 //> res3: Option[Int] = None
  //In below, Option Type is Some and it has returned the 1st matching value of the given predicate
  lst.find(_ > 3)                                 //> res4: Option[Int] = Some(4)
  //Below is how you can get the value
  lst.find(_ > 3).get                             //> res5: Int = 4
  //Below will return error because there is no matching value
  //lst.find(_ > 6).get
  //To avoid error, we can return some default using getOrElse
  lst.find(_ > 6).getOrElse(0)                    //> res6: Int = 0
  
  //map can be used on the result of find just like it is used on array. "None" will have 0 element and "Some" will have one element in it.
  lst.find(_ > 6).map(_*2)                        //> res7: Option[Int] = None
  
  lst.find(_ > 3).map(_*2)                        //> res8: Option[Int] = Some(8)
  
  //I can also use match
  lst.find(_ > 3) match {
  	case Some(n) => n*5
  	case None => 0
  }                                               //> res9: Int = 20
  
  val result = lst.find(_ > 3)                    //> result  : Option[Int] = Some(4)
  if (result.nonEmpty) result.get*5 else 0        //> res10: Int = 20
  
	lst.find(_%3 == 0).map(_/3).getOrElse(0)  //> res11: Int = 1
  
}