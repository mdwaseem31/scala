object scala14ForComprehensions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 

	val ar = Array.fill(5)(math.random());System.out.println("""ar  : Array[Double] = """ + $show(ar ));$skip(25); 
	for(x <- ar) println(x);$skip(29); val res$0 = 
	 
	 for(x <- ar) yield x*x;System.out.println("""res0: Array[Double] = """ + $show(res$0));$skip(38); val res$1 = 
	//Above is same as
	ar.map(x => x*x);System.out.println("""res1: Array[Double] = """ + $show(res$1));$skip(74); val res$2 = 
	
	//Doubly nested loop
	for (i <- 0 until 5; j <-5 until 10) yield (i,j);System.out.println("""res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$2));$skip(70); val res$3 = 
	
	for (i <- 0 until 5; if i%2==0; a=2*i; j <-5 until 10) yield (i,j);System.out.println("""res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$3));$skip(73); val res$4 = 
	
	for {i <- 0 until 5
		if i%2==0
		a=2*i
		j <-5 until 10} yield (i,j);System.out.println("""res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$4));$skip(83); val res$5 = 
		
		
	for {i <- (0 until 5).par
		if i%2==0
		a=2*i
		j <-5 until 10} yield (i,j);System.out.println("""res5: scala.collection.parallel.immutable.ParSeq[(Int, Int)] = """ + $show(res$5))}

}
