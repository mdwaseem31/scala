object scala17AssocitivityAndUnaryOperators {
  //Associtivity deals with whether things bind left to right or right to left.
  //Left Associative:
  2-3-4                                           //> res0: Int = -5
  //Above is left associative and is same as below
	(2.-(3)).-(4)                             //> res1: Int = -5
	//Right Associative:
	//You can also make things right associative. Any operator that ends in a : is right associative.
	//Ex:
	1 :: 2 :: 3 :: Nil                        //> res2: List[Int] = List(1, 2, 3)
	//Above is right associative and is same as below
	//Ex:
	(1 :: (2 :: (3 :: Nil)))                  //> res3: List[Int] = List(1, 2, 3)
	//Above is same as below
	Nil.::(3).::(2).::(1)                     //> res4: List[Int] = List(1, 2, 3)
	
	//The unary operators that can be used are: - ! ~
}