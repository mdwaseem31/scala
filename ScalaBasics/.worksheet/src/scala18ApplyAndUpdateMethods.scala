object scala18ApplyAndUpdateMethods {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(335); 

//*****************************************	APPLY METHOD	*****************************************

	//This apply method is present inside the companion object of the class
	//In scala, we sometimes don't use "new" on the object because that is present in the apply method
	val lst4 = List(1,2,3);System.out.println("""lst4  : List[Int] = """ + $show(lst4 ));$skip(80); 
	//So List is calling Apply method as shown below
	val lst5 = List.apply(1,2,3);System.out.println("""lst5  : List[Int] = """ + $show(lst5 ));$skip(9); val res$0 = 
	lst4(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
	lst4.apply(0);System.out.println("""res1: Int = """ + $show(res$1));$skip(240); 
	
//**************************************************************************************************************

//*****************************************	UPDATE METHOD	*****************************************
	val arr = Array(1,2,3);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(8); val res$2 = 
	arr(1);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); 
	arr(1) = 99;$skip(5); val res$3 = 
	arr;System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(76); 
	
	//arr(1) = 99 is calling Update method as shown below
	arr.update(1, 99);$skip(5); val res$4 = 
	arr;System.out.println("""res4: Array[Int] = """ + $show(res$4))}
	
//**************************************************************************************************************
}
