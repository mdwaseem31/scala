object scala17AssocitivityAndUnaryOperators {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(155); val res$0 = 
  //Associtivity deals with whether things bind left to right or right to left.
  //Left Associative:
  2-3-4;System.out.println("""res0: Int = """ + $show(res$0));$skip(66); val res$1 = 
  //Above is left associative and is same as below
	(2.-(3)).-(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(148); val res$2 = 
	//Right Associative:
	//You can also make things right associative. Any operator that ends in a : is right associative.
	//Ex:
	1 :: 2 :: 3 :: Nil;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(84); val res$3 = 
	//Above is right associative and is same as below
	//Ex:
	(1 :: (2 :: (3 :: Nil)));System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(49); val res$4 = 
	//Above is same as below
	Nil.::(3).::(2).::(1);System.out.println("""res4: List[Int] = """ + $show(res$4))}
	
	//The unary operators that can be used are: - ! ~
}
