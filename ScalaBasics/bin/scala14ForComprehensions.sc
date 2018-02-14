object scala14ForComprehensions {

	val ar = Array.fill(5)(math.random())     //> ar  : Array[Double] = Array(0.6338744513378952, 0.684927810583342, 0.85137815
                                                  //| 77327402, 0.08841909459703667, 0.5798558043126318)
	for(x <- ar) println(x)                   //> 0.6338744513378952
                                                  //| 0.684927810583342
                                                  //| 0.8513781577327402
                                                  //| 0.08841909459703667
                                                  //| 0.5798558043126318
	 
	 for(x <- ar) yield x*x                   //> res0: Array[Double] = Array(0.4017968200589177, 0.46912610571049035, 0.72484
                                                  //| 47674643946, 0.00781793628935972, 0.3362327537950492)
	//Above is same as
	ar.map(x => x*x)                          //> res1: Array[Double] = Array(0.4017968200589177, 0.46912610571049035, 0.72484
                                                  //| 47674643946, 0.00781793628935972, 0.3362327537950492)
	
	//Doubly nested loop
	for (i <- 0 until 5; j <-5 until 10) yield (i,j)
                                                  //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((0,5), (0,6
                                                  //| ), (0,7), (0,8), (0,9), (1,5), (1,6), (1,7), (1,8), (1,9), (2,5), (2,6), (2,
                                                  //| 7), (2,8), (2,9), (3,5), (3,6), (3,7), (3,8), (3,9), (4,5), (4,6), (4,7), (4
                                                  //| ,8), (4,9))
	
	for (i <- 0 until 5; if i%2==0; a=2*i; j <-5 until 10) yield (i,j)
                                                  //> res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((0,5), (0,6
                                                  //| ), (0,7), (0,8), (0,9), (2,5), (2,6), (2,7), (2,8), (2,9), (4,5), (4,6), (4,
                                                  //| 7), (4,8), (4,9))
	
	for {i <- 0 until 5
		if i%2==0
		a=2*i
		j <-5 until 10} yield (i,j)       //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((0,5), (0,6
                                                  //| ), (0,7), (0,8), (0,9), (2,5), (2,6), (2,7), (2,8), (2,9), (4,5), (4,6), (4,
                                                  //| 7), (4,8), (4,9))
		
		
	for {i <- (0 until 5).par
		if i%2==0
		a=2*i
		j <-5 until 10} yield (i,j)       //> res5: scala.collection.parallel.immutable.ParSeq[(Int, Int)] = ParVector((0,
                                                  //| 5), (0,6), (0,7), (0,8), (0,9), (2,5), (2,6), (2,7), (2,8), (2,9), (4,5), (4
                                                  //| ,6), (4,7), (4,8), (4,9))

}