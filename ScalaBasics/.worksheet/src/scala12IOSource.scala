object scala12IOSource {

//**************************************************	MARK LEWIS - YOUTUBE	***************************************
	//There is a type called "Source" which is present inside package "scala.io"
	import scala.io.Source;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(320); 
	val source = Source.fromFile("C:/Spring/workspace/InfiniteSkills/matrix.txt");System.out.println("""source  : scala.io.BufferedSource = """ + $show(source ));$skip(326); val res$0 = 
	//An Iterator is much like a list or an array. You can think of it as a Sequence.
	//The difference between a Sequence and an Iterator is a Sequence that is consumed when you use it so we can call the methods that we're used to using on lists and array
	//Below will return complete file content as a String
	source.mkString;System.out.println("""res0: String = """ + $show(res$0));$skip(98); val res$1 = 
	
	//Now when I look at the source, it is empty. They are no longer there for me to read.
	source;System.out.println("""res1: scala.io.BufferedSource = """ + $show(res$1));$skip(105); 
	
	//Open the file again
	val source1 = Source.fromFile("C:/Spring/workspace/InfiniteSkills/matrix.txt");System.out.println("""source1  : scala.io.BufferedSource = """ + $show(source1 ));$skip(222); val res$2 = 
	
	//Iterators themselves are really based upon two methods. One called "hasNext" and the other called "next"
	//Now the "source" has file data in it. Below returns true which means there is stuff to read
	source1.hasNext;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(40); val res$3 = 
	//get the next character
	source1.next;System.out.println("""res3: Char = """ + $show(res$3));$skip(14); val res$4 = 
	source1.next;System.out.println("""res4: Char = """ + $show(res$4));$skip(14); val res$5 = 
	source1.next;System.out.println("""res5: Char = """ + $show(res$5));$skip(106); 
	//Meaning of above: source1 itself is an Iterator of Char.
	
	//Read Lines
	val lines = source1.getLines;System.out.println("""lines  : Iterator[String] = """ + $show(lines ));$skip(12); val res$6 = 
	lines.next;System.out.println("""res6: String = """ + $show(res$6));$skip(12); val res$7 = 
	lines.next;System.out.println("""res7: String = """ + $show(res$7));$skip(15); val res$8 = 
	lines.hasNext;System.out.println("""res8: Boolean = """ + $show(res$8));$skip(12); val res$9 = 
	lines.next;System.out.println("""res9: String = """ + $show(res$9));$skip(15); val res$10 = 
	lines.hasNext;System.out.println("""res10: Boolean = """ + $show(res$10));$skip(7); val res$11 = 
	lines;System.out.println("""res11: Iterator[String] = """ + $show(res$11));$skip(15); 
	source1.close;$skip(549); 
	

	
	//We can use source to read out the contents of a file. Because source is like a sequence, we can use all the other methods that we are used to using on sequences.
	//For a 2D representation of matrix.txt file, I need an Array of Array of Double.
	//For this, I want to take each line, split it apart, convert each value into Doubles and then convert that whole thing to an Array (otherwise I will get back an Iterator)
	//Above can be done easily using map
	val matrixSource = Source.fromFile("C:/Spring/workspace/InfiniteSkills/matrix.txt");System.out.println("""matrixSource  : scala.io.BufferedSource = """ + $show(matrixSource ));$skip(41); 
	val matrixLines = matrixSource.getLines;System.out.println("""matrixLines  : Iterator[String] = """ + $show(matrixLines ));$skip(80); 
	val matrix = matrixLines.map(line => line.split(", ").map(_.toDouble)).toArray;System.out.println("""matrix  : Array[Array[Double]] = """ + $show(matrix ));$skip(20); 
	matrixSource.close;$skip(47); 
	matrix.foreach(r => println(r.mkString(" ")))



//******************************************************************************************************************












//**************************************************	UDEMY	**************************************************

	//Refer the chapter-2 csv file (TX417945_1263.csv)
	
	case class TempData(day:Int,year:Int,precip:Double,aveTemp:Int,maxTemp:Int,minTemp:Int);$skip(551); 
	
	def parseLine(line:String):TempData = {
		val p = line.split(",").map(_.trim)
		TempData(p(1).toInt,p(4).toInt,p(5).toDouble,p(6).toInt,p(7).toInt,p(8).toInt)
	};System.out.println("""parseLine: (line: String)scala12IOSource.TempData""");$skip(41); val res$12 = 
	
	new java.io.File(".").getAbsolutePath;System.out.println("""res12: String = """ + $show(res$12));$skip(112); 
	val source2 = io.Source.fromFile("C:/Spring/workspace/InfiniteSkills/WorkingFiles/Chapter2/TX417945_1263.csv");System.out.println("""source2  : scala.io.BufferedSource = """ + $show(source2 ));$skip(187); 
                                                  
                                                 
	//Below returns Iterator of String. It gets all lines
	val lines2 = source2.getLines;System.out.println("""lines2  : Iterator[String] = """ + $show(lines2 ));$skip(104); val res$13 = 
	//The first two lines in the csv file are header lines so we can skip them by doing below
	lines2.next;System.out.println("""res13: String = """ + $show(res$13));$skip(13); val res$14 = 
	lines2.next;System.out.println("""res14: String = """ + $show(res$14));$skip(374); 
  //map every line (except the two skipped above) to parseLine. This gives back an Iterator of TempData. This is the kind of data we want (desired data types for each value)
  //val data = lines2.map(parseLine)
  
  //Now get the data out of Iterator and store it in memory. This can be done by converting it to an Array or a List
 	val data = lines2.map(parseLine).toArray;System.out.println("""data  : Array[scala12IOSource.TempData] = """ + $show(data ));$skip(70); val res$15 = 
 	
 	//pull out only max values from above data
 	data.map(_.maxTemp);System.out.println("""res15: Array[Int] = """ + $show(res$15));$skip(69); val res$16 = 
 	
 	//pull out highest of the high values
 	data.map(_.maxTemp).max;System.out.println("""res16: Int = """ + $show(res$16));$skip(36); 
 	
 	//close the file
	source.close}
	
//******************************************************************************************************************
}
