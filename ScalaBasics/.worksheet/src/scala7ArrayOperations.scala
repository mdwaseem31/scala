object scala7ArrayOperations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(165); 

//*****************************************	ARRAY FUNCTIONS	*****************************************
	val a = Array(1,5,7,9,8,2,3,6);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(11); val res$0 = 
	a.drop(2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(16); val res$1 = 
	a.dropRight(2);System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(8); val res$2 = 
	a.head;System.out.println("""res2: Int = """ + $show(res$2));$skip(8); val res$3 = 
	a.tail;System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(8); val res$4 = 
	a.last;System.out.println("""res4: Int = """ + $show(res$4));$skip(10); val res$5 = 
	a.length;System.out.println("""res5: Int = """ + $show(res$5));$skip(15); val res$6 = 
	a(a.length-1);System.out.println("""res6: Int = """ + $show(res$6));$skip(111); val res$7 = 
	//It will split given array into two arrays. It will split from index 3 and will return a tuple
	a.splitAt(3);System.out.println("""res7: (Array[Int], Array[Int]) = """ + $show(res$7));$skip(35); 
	val (before,after) = a.splitAt(3);System.out.println("""before  : Array[Int] = """ + $show(before ));System.out.println("""after  : Array[Int] = """ + $show(after ));$skip(11); val res$8 = 
	a.take(3);System.out.println("""res8: Array[Int] = """ + $show(res$8));$skip(16); val res$9 = 
	a.takeRight(3);System.out.println("""res9: Array[Int] = """ + $show(res$9));$skip(106); val res$10 = 
	//It takes starting and ending indexes. 1st index is inclusive and last index is exclusive
	a.slice(2,5);System.out.println("""res10: Array[Int] = """ + $show(res$10));$skip(251); val res$11 = 
	//Patch will replace some segment of given array. 1st argument is index where do we want to start patch from, 2nd one is the collection that you want to patch there and 3rd argument tells how many values it should replace
	a.patch(3, Array(98,99),3);System.out.println("""res11: Array[Int] = """ + $show(res$11));$skip(80); val res$12 = 
	//Below will remove the matching values from the array
	a.diff(Array(1,2,3,4));System.out.println("""res12: Array[Int] = """ + $show(res$12));$skip(39); val res$13 = 
	Array(1,1,2,2,3,3).diff(Array(1,2,3));System.out.println("""res13: Array[Int] = """ + $show(res$13));$skip(170); val res$14 = 
	//distinct will remove duplicates. The first value (among duplicates) will remain at the same position and the others will be removed
	Array(1,2,7,7,4,3,7,1,1).distinct;System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(28); val res$15 = 
	a.intersect(List(4,5,6,7));System.out.println("""res15: Array[Int] = """ + $show(res$15));$skip(63); val res$16 = 
	//we get the duplicates with union
	a.union(Array(10,11,1,2));System.out.println("""res16: Array[Int] = """ + $show(res$16));$skip(7); val res$17 = 
	a.min;System.out.println("""res17: Int = """ + $show(res$17));$skip(7); val res$18 = 
	a.max;System.out.println("""res18: Int = """ + $show(res$18));$skip(7); val res$19 = 
	a.sum;System.out.println("""res19: Int = """ + $show(res$19));$skip(11); val res$20 = 
	a.product;System.out.println("""res20: Int = """ + $show(res$20));$skip(10); val res$21 = 
	a.sorted;System.out.println("""res21: Array[Int] = """ + $show(res$21));$skip(12); val res$22 = 
	a.mkString;System.out.println("""res22: String = """ + $show(res$22));$skip(93); val res$23 = 
	//If you pass one argument then it becomes a delimiter between the values
	a.mkString(", ");System.out.println("""res23: String = """ + $show(res$23));$skip(172); val res$24 = 
	//When you pass three argument: where 1st string "[" is a predecessor, 2nd one is the seperator and 3rd argument "]" is what you want at the end
	a.mkString("[",", ","]");System.out.println("""res24: String = """ + $show(res$24));$skip(20); val res$25 = 
	a map {_.toString};System.out.println("""res25: Array[String] = """ + $show(res$25));$skip(11); val res$26 = 
	a.reverse;System.out.println("""res26: Array[Int] = """ + $show(res$26));$skip(29); 
	



	val arr = Array(1,2,3);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(25); 
	val lst = List(7.2,4,9);System.out.println("""lst  : List[Double] = """ + $show(lst ));$skip(40); 
	val arr2 = Array.fill(10)(math.random);System.out.println("""arr2  : Array[Double] = """ + $show(arr2 ));$skip(41); 
	val arr3 = Array.tabulate(10)(i => i*i);System.out.println("""arr3  : Array[Int] = """ + $show(arr3 ));$skip(9); val res$27 = 
	arr3(9);System.out.println("""res27: Int = """ + $show(res$27));$skip(65); val res$28 = 
	
	//++ appends two sequences (lists and/or arrays)
	arr ++ arr2;System.out.println("""res28: Array[AnyVal] = """ + $show(res$28));$skip(92); val res$29 = 
  //When I use ":", result is same but it means that it is right associative
  arr ++: arr2;System.out.println("""res29: Array[AnyVal] = """ + $show(res$29));$skip(40); val res$30 = 
  //prepend 2 on array arr2
  2 +: arr2;System.out.println("""res30: Array[AnyVal] = """ + $show(res$30));$skip(54); val res$31 = 
	//prepend and append 2 on array arr2
	2 +: arr2 :+ 2;System.out.println("""res31: Array[AnyVal] = """ + $show(res$31));$skip(68); val res$32 = 
	//To get the size of an array, use either size or length
	arr.size;System.out.println("""res32: Int = """ + $show(res$32));$skip(12); val res$33 = 
	arr.length;System.out.println("""res33: Int = """ + $show(res$33));$skip(13); val res$34 = 
	arr.isEmpty;System.out.println("""res34: Boolean = """ + $show(res$34));$skip(14); val res$35 = 
	arr.nonEmpty;System.out.println("""res35: Boolean = """ + $show(res$35));$skip(28); val res$36 = 
	arr.startsWith(Array(1,2));System.out.println("""res36: Boolean = """ + $show(res$36));$skip(26); val res$37 = 
	arr.endsWith(Array(1,2));System.out.println("""res37: Boolean = """ + $show(res$37));$skip(16); val res$38 = 
	arr.indexOf(2);System.out.println("""res38: Int = """ + $show(res$38));$skip(96); val res$39 = 
	//Returns a list of all indices on the given collection. It goes from 0 to end-1
	arr2.indices;System.out.println("""res39: scala.collection.immutable.Range = """ + $show(res$39));$skip(13); val res$40 = 
	lst.toArray;System.out.println("""res40: Array[Double] = """ + $show(res$40));$skip(14); val res$41 = 
	lst.toVector;System.out.println("""res41: Vector[Double] = """ + $show(res$41));$skip(94); val res$42 = 
	//we can convert sequential collection to a parallel one by calling the par method
	arr2.par;System.out.println("""res42: scala.collection.parallel.mutable.ParArray[Double] = """ + $show(res$42));$skip(57); val res$43 = 
	//Update value in a list using index
	lst.updated(1,99);System.out.println("""res43: List[AnyVal] = """ + $show(res$43));$skip(31); 
	
	val arr4 = Array(1,3,5,7,9);System.out.println("""arr4  : Array[Int] = """ + $show(arr4 ));$skip(21); val res$44 = 
	arr4.intersect(arr);System.out.println("""res44: Array[Int] = """ + $show(res$44));$skip(26); val res$45 = 
	arr.union(arr4).distinct;System.out.println("""res45: Array[Int] = """ + $show(res$45));$skip(209); val res$46 = 
	//A view creates a non-strict representation of your sequence so that the other operations don't have to go through and produce result. No result is produced until you hit something that forces it
	arr4.view;System.out.println("""res46: scala.collection.mutable.IndexedSeqView[Int,Array[Int]] = """ + $show(res$46));$skip(16); val res$47 = 
	arr4.zip(arr2);System.out.println("""res47: Array[(Int, Double)] = """ + $show(res$47));$skip(19); val res$48 = 
	a.zip('a' to 'z');System.out.println("""res48: Array[(Int, Char)] = """ + $show(res$48));$skip(19); val res$49 = 
	a.zip('a' to 'c');System.out.println("""res49: Array[(Int, Char)] = """ + $show(res$49));$skip(16); val res$50 = 
	a.zipWithIndex;System.out.println("""res50: Array[(Int, Int)] = """ + $show(res$50));$skip(44); val res$51 = 
	//Below is same as above
	a.zip(a.indices);System.out.println("""res51: Array[(Int, Int)] = """ + $show(res$51))}
//***************************************************************************************************


}
