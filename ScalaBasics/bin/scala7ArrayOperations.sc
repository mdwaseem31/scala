object scala7ArrayOperations {

//*****************************************	ARRAY FUNCTIONS	*****************************************
	val a = Array(1,5,7,9,8,2,3,6)            //> a  : Array[Int] = Array(1, 5, 7, 9, 8, 2, 3, 6)
	a.drop(2)                                 //> res0: Array[Int] = Array(7, 9, 8, 2, 3, 6)
	a.dropRight(2)                            //> res1: Array[Int] = Array(1, 5, 7, 9, 8, 2)
	a.head                                    //> res2: Int = 1
	a.tail                                    //> res3: Array[Int] = Array(5, 7, 9, 8, 2, 3, 6)
	a.last                                    //> res4: Int = 6
	a.length                                  //> res5: Int = 8
	a(a.length-1)                             //> res6: Int = 6
	//It will split given array into two arrays. It will split from index 3 and will return a tuple
	a.splitAt(3)                              //> res7: (Array[Int], Array[Int]) = (Array(1, 5, 7),Array(9, 8, 2, 3, 6))
	val (before,after) = a.splitAt(3)         //> before  : Array[Int] = Array(1, 5, 7)
                                                  //| after  : Array[Int] = Array(9, 8, 2, 3, 6)
	a.take(3)                                 //> res8: Array[Int] = Array(1, 5, 7)
	a.takeRight(3)                            //> res9: Array[Int] = Array(2, 3, 6)
	//It takes starting and ending indexes. 1st index is inclusive and last index is exclusive
	a.slice(2,5)                              //> res10: Array[Int] = Array(7, 9, 8)
	//Patch will replace some segment of given array. 1st argument is index where do we want to start patch from, 2nd one is the collection that you want to patch there and 3rd argument tells how many values it should replace
	a.patch(3, Array(98,99),3)                //> res11: Array[Int] = Array(1, 5, 7, 98, 99, 3, 6)
	//Below will remove the matching values from the array
	a.diff(Array(1,2,3,4))                    //> res12: Array[Int] = Array(5, 7, 9, 8, 6)
	Array(1,1,2,2,3,3).diff(Array(1,2,3))     //> res13: Array[Int] = Array(1, 2, 3)
	//distinct will remove duplicates. The first value (among duplicates) will remain at the same position and the others will be removed
	Array(1,2,7,7,4,3,7,1,1).distinct         //> res14: Array[Int] = Array(1, 2, 7, 4, 3)
	a.intersect(List(4,5,6,7))                //> res15: Array[Int] = Array(5, 7, 6)
	//we get the duplicates with union
	a.union(Array(10,11,1,2))                 //> res16: Array[Int] = Array(1, 5, 7, 9, 8, 2, 3, 6, 10, 11, 1, 2)
	a.min                                     //> res17: Int = 1
	a.max                                     //> res18: Int = 9
	a.sum                                     //> res19: Int = 41
	a.product                                 //> res20: Int = 90720
	a.sorted                                  //> res21: Array[Int] = Array(1, 2, 3, 5, 6, 7, 8, 9)
	a.mkString                                //> res22: String = 15798236
	//If you pass one argument then it becomes a delimiter between the values
	a.mkString(", ")                          //> res23: String = 1, 5, 7, 9, 8, 2, 3, 6
	//When you pass three argument: where 1st string "[" is a predecessor, 2nd one is the seperator and 3rd argument "]" is what you want at the end
	a.mkString("[",", ","]")                  //> res24: String = [1, 5, 7, 9, 8, 2, 3, 6]
	a map {_.toString}                        //> res25: Array[String] = Array(1, 5, 7, 9, 8, 2, 3, 6)
	a.reverse                                 //> res26: Array[Int] = Array(6, 3, 2, 8, 9, 7, 5, 1)
	



	val arr = Array(1,2,3)                    //> arr  : Array[Int] = Array(1, 2, 3)
	val lst = List(7.2,4,9)                   //> lst  : List[Double] = List(7.2, 4.0, 9.0)
	val arr2 = Array.fill(10)(math.random)    //> arr2  : Array[Double] = Array(0.6926064234267592, 0.8921192182005622, 0.428
                                                  //| 7652562539572, 0.044655977051485385, 0.11214742721273474, 0.920750830563717
                                                  //| 1, 0.09033060405346238, 0.6023094906396413, 0.0814042331463215, 0.919938764
                                                  //| 6668191)
	val arr3 = Array.tabulate(10)(i => i*i)   //> arr3  : Array[Int] = Array(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
	arr3(9)                                   //> res27: Int = 81
	
	//++ appends two sequences (lists and/or arrays)
	arr ++ arr2                               //> res28: Array[AnyVal] = Array(1, 2, 3, 0.6926064234267592, 0.892119218200562
                                                  //| 2, 0.4287652562539572, 0.044655977051485385, 0.11214742721273474, 0.9207508
                                                  //| 305637171, 0.09033060405346238, 0.6023094906396413, 0.0814042331463215, 0.9
                                                  //| 199387646668191)
  //When I use ":", result is same but it means that it is right associative
  arr ++: arr2                                    //> res29: Array[AnyVal] = Array(1, 2, 3, 0.6926064234267592, 0.892119218200562
                                                  //| 2, 0.4287652562539572, 0.044655977051485385, 0.11214742721273474, 0.9207508
                                                  //| 305637171, 0.09033060405346238, 0.6023094906396413, 0.0814042331463215, 0.9
                                                  //| 199387646668191)
  //prepend 2 on array arr2
  2 +: arr2                                       //> res30: Array[AnyVal] = Array(2, 0.6926064234267592, 0.8921192182005622, 0.4
                                                  //| 287652562539572, 0.044655977051485385, 0.11214742721273474, 0.9207508305637
                                                  //| 171, 0.09033060405346238, 0.6023094906396413, 0.0814042331463215, 0.9199387
                                                  //| 646668191)
	//prepend and append 2 on array arr2
	2 +: arr2 :+ 2                            //> res31: Array[AnyVal] = Array(2, 0.6926064234267592, 0.8921192182005622, 0.4
                                                  //| 287652562539572, 0.044655977051485385, 0.11214742721273474, 0.9207508305637
                                                  //| 171, 0.09033060405346238, 0.6023094906396413, 0.0814042331463215, 0.9199387
                                                  //| 646668191, 2)
	//To get the size of an array, use either size or length
	arr.size                                  //> res32: Int = 3
	arr.length                                //> res33: Int = 3
	arr.isEmpty                               //> res34: Boolean = false
	arr.nonEmpty                              //> res35: Boolean = true
	arr.startsWith(Array(1,2))                //> res36: Boolean = true
	arr.endsWith(Array(1,2))                  //> res37: Boolean = false
	arr.indexOf(2)                            //> res38: Int = 1
	//Returns a list of all indices on the given collection. It goes from 0 to end-1
	arr2.indices                              //> res39: scala.collection.immutable.Range = Range 0 until 10
	lst.toArray                               //> res40: Array[Double] = Array(7.2, 4.0, 9.0)
	lst.toVector                              //> res41: Vector[Double] = Vector(7.2, 4.0, 9.0)
	//we can convert sequential collection to a parallel one by calling the par method
	arr2.par                                  //> res42: scala.collection.parallel.mutable.ParArray[Double] = ParArray(0.6926
                                                  //| 064234267592, 0.8921192182005622, 0.4287652562539572, 0.044655977051485385,
                                                  //|  0.11214742721273474, 0.9207508305637171, 0.09033060405346238, 0.6023094906
                                                  //| 396413, 0.0814042331463215, 0.9199387646668191)
	//Update value in a list using index
	lst.updated(1,99)                         //> res43: List[AnyVal] = List(7.2, 99, 9.0)
	
	val arr4 = Array(1,3,5,7,9)               //> arr4  : Array[Int] = Array(1, 3, 5, 7, 9)
	arr4.intersect(arr)                       //> res44: Array[Int] = Array(1, 3)
	arr.union(arr4).distinct                  //> res45: Array[Int] = Array(1, 2, 3, 5, 7, 9)
	//A view creates a non-strict representation of your sequence so that the other operations don't have to go through and produce result. No result is produced until you hit something that forces it
	arr4.view                                 //> res46: scala.collection.mutable.IndexedSeqView[Int,Array[Int]] = SeqView(..
                                                  //| .)
	arr4.zip(arr2)                            //> res47: Array[(Int, Double)] = Array((1,0.6926064234267592), (3,0.8921192182
                                                  //| 005622), (5,0.4287652562539572), (7,0.044655977051485385), (9,0.11214742721
                                                  //| 273474))
	a.zip('a' to 'z')                         //> res48: Array[(Int, Char)] = Array((1,a), (5,b), (7,c), (9,d), (8,e), (2,f),
                                                  //|  (3,g), (6,h))
	a.zip('a' to 'c')                         //> res49: Array[(Int, Char)] = Array((1,a), (5,b), (7,c))
	a.zipWithIndex                            //> res50: Array[(Int, Int)] = Array((1,0), (5,1), (7,2), (9,3), (8,4), (2,5), 
                                                  //| (3,6), (6,7))
	//Below is same as above
	a.zip(a.indices)                          //> res51: Array[(Int, Int)] = Array((1,0), (5,1), (7,2), (9,3), (8,4), (2,5), 
                                                  //| (3,6), (6,7))
//***************************************************************************************************


}