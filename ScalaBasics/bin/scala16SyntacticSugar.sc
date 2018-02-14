object scala16SyntacticSugar {


	val a = Array(1,2,3,4)                    //> a  : Array[Int] = Array(1, 2, 3, 4)
	a foreach println                         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
	//Because of below code snippet, the entire code is not compiling so commented out.
	//def foo(i:Int):Unit = 8
	//foo(8)
	//foo{9}
	//foo{
		//println("hi")
		//7
	//}
	
	//fill function can be written in 2 ways. 1st one is preferred
	Array.fill(5)()                           //> res0: Array[Unit] = Array((), (), (), (), ())
	Array.fill(5)({})                         //> res1: Array[Unit] = Array((), (), (), (), ())
	
	//Passby name
	//This is evaluated everytime I use it
	def myWhile(cond: => Boolean)(body: => Unit):Unit ={
		if(cond) {
			body
			myWhile(cond)(body)
		}
	}                                         //> myWhile: (cond: => Boolean)(body: => Unit)Unit
	
	//Above is same as below.
	var i=0                                   //> i  : Int = 0
	myWhile(i<5) {
		println(i)
		i += 1
	}                                         //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4

}