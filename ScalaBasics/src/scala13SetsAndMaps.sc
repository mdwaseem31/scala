object scala13SetsAndMaps {


//****************************************************	Set	****************************************************
  //Set by default is immutable
  Set(1,2,3)                                      //> res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  //A Set contains unique values
  val s = Set(1,2,3,3)                            //> s  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  //Append a value
  s+4                                             //> res1: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
  //Appending a value to a Set will not change the Set
  s                                               //> res2: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  val s2 = s+4                                    //> s2  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
  
  //To make Sets mutable, import collection.module
	import collection.mutable
  val mutSet = mutable.Set(3,4,5)                 //> mutSet  : scala.collection.mutable.Set[Int] = Set(5, 3, 4)
	//Appending a value to a mutable Set will change the Set
	mutSet += 6                               //> res3: scala13SetsAndMaps.mutSet.type = Set(5, 6, 3, 4)
	
//**************************************************************************************************************


//****************************************************	Map	****************************************************
	//Map gives you ability to associate values of one type with key values of another type
	//The argument here needs to be tuples
	val m = Map(("Texas","Austin"),("Colorado","Denver"))
                                                  //> m  : scala.collection.immutable.Map[String,String] = Map(Texas -> Austin, Co
                                                  //| lorado -> Denver)
	//Above can also be written as
	val m1 = Map(("Texas" -> "Austin"),("Colorado" -> "Denver"))
                                                  //> m1  : scala.collection.immutable.Map[String,String] = Map(Texas -> Austin, 
                                                  //| Colorado -> Denver)
	m("Texas")                                //> res4: String = Austin
	//1 -> 2 makes a tuple
	1 -> 2                                    //> res5: (Int, Int) = (1,2)
	//It always makes a two tuple
	1 -> 2 -> 3                               //> res6: ((Int, Int), Int) = ((1,2),3)
	
	val mutMap = mutable.Map()                //> mutMap  : scala.collection.mutable.Map[Nothing,Nothing] = Map()


//**************************************************************************************************************
	
	
}