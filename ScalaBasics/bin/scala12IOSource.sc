object scala12IOSource {

//**************************************************	MARK LEWIS - YOUTUBE	***************************************
	//There is a type called "Source" which is present inside package "scala.io"
	import scala.io.Source
	val source = Source.fromFile("C:/Spring/workspace/InfiniteSkills/matrix.txt")
                                                  //> source  : scala.io.BufferedSource = non-empty iterator
	//An Iterator is much like a list or an array. You can think of it as a Sequence.
	//The difference between a Sequence and an Iterator is a Sequence that is consumed when you use it so we can call the methods that we're used to using on lists and array
	//Below will return complete file content as a String
	source.mkString                           //> res0: String = 0.54098934859348008, 0.841798278762837223, -0.841858769869669
                                                  //| 
                                                  //| 0.54098934859348008, -1.443787876986868, 3.303778587856878
                                                  //| 0.0, 0.0, 0.0
	
	//Now when I look at the source, it is empty. They are no longer there for me to read.
	source                                    //> res1: scala.io.BufferedSource = empty iterator
	
	//Open the file again
	val source1 = Source.fromFile("C:/Spring/workspace/InfiniteSkills/matrix.txt")
                                                  //> source1  : scala.io.BufferedSource = non-empty iterator
	
	//Iterators themselves are really based upon two methods. One called "hasNext" and the other called "next"
	//Now the "source" has file data in it. Below returns true which means there is stuff to read
	source1.hasNext                           //> res2: Boolean = true
	//get the next character
	source1.next                              //> res3: Char = 0
	source1.next                              //> res4: Char = .
	source1.next                              //> res5: Char = 5
	//Meaning of above: source1 itself is an Iterator of Char.
	
	//Read Lines
	val lines = source1.getLines              //> lines  : Iterator[String] = non-empty iterator
	lines.next                                //> res6: String = 4098934859348008, 0.841798278762837223, -0.841858769869669
	lines.next                                //> res7: String = 0.54098934859348008, -1.443787876986868, 3.303778587856878
	lines.hasNext                             //> res8: Boolean = true
	lines.next                                //> res9: String = 0.0, 0.0, 0.0
	lines.hasNext                             //> res10: Boolean = false
	lines                                     //> res11: Iterator[String] = empty iterator
	source1.close
	

	
	//We can use source to read out the contents of a file. Because source is like a sequence, we can use all the other methods that we are used to using on sequences.
	//For a 2D representation of matrix.txt file, I need an Array of Array of Double.
	//For this, I want to take each line, split it apart, convert each value into Doubles and then convert that whole thing to an Array (otherwise I will get back an Iterator)
	//Above can be done easily using map
	val matrixSource = Source.fromFile("C:/Spring/workspace/InfiniteSkills/matrix.txt")
                                                  //> matrixSource  : scala.io.BufferedSource = non-empty iterator
	val matrixLines = matrixSource.getLines   //> matrixLines  : Iterator[String] = non-empty iterator
	val matrix = matrixLines.map(line => line.split(", ").map(_.toDouble)).toArray
                                                  //> matrix  : Array[Array[Double]] = Array(Array(0.5409893485934801, 0.84179827
                                                  //| 87628372, -0.841858769869669), Array(0.5409893485934801, -1.443787876986868
                                                  //| , 3.303778587856878), Array(0.0, 0.0, 0.0))
	matrixSource.close
	matrix.foreach(r => println(r.mkString(" ")))
                                                  //> 0.5409893485934801 0.8417982787628372 -0.841858769869669
                                                  //| 0.5409893485934801 -1.443787876986868 3.303778587856878
                                                  //| 0.0 0.0 0.0



//******************************************************************************************************************












//**************************************************	UDEMY	**************************************************

	//Refer the chapter-2 csv file (TX417945_1263.csv)
	
	case class TempData(day:Int,year:Int,precip:Double,aveTemp:Int,maxTemp:Int,minTemp:Int)
	
	def parseLine(line:String):TempData = {
		val p = line.split(",").map(_.trim)
		TempData(p(1).toInt,p(4).toInt,p(5).toDouble,p(6).toInt,p(7).toInt,p(8).toInt)
	}                                         //> parseLine: (line: String)scala12IOSource.TempData
	
	new java.io.File(".").getAbsolutePath     //> res12: String = C:\Spring\eclipse\.
	val source2 = io.Source.fromFile("C:/Spring/workspace/InfiniteSkills/WorkingFiles/Chapter2/TX417945_1263.csv")
                                                  //> source2  : scala.io.BufferedSource = non-empty iterator
                                                  
                                                 
	//Below returns Iterator of String. It gets all lines
	val lines2 = source2.getLines             //> lines2  : Iterator[String] = non-empty iterator
	//The first two lines in the csv file are header lines so we can skip them by doing below
	lines2.next                               //> res13: String = Source: MJ Menne CN Williams Jr. RS Vose NOAA National Clim
                                                  //| atic Data Center Asheville NC
	lines2.next                               //> res14: String = "Day  ,JD  ,Month  ,State_id  ,Year  ,PRCP (in),TAVE (F),TM
                                                  //| AX (F),TMIN (F) "
  //map every line (except the two skipped above) to parseLine. This gives back an Iterator of TempData. This is the kind of data we want (desired data types for each value)
  //val data = lines2.map(parseLine)
  
  //Now get the data out of Iterator and store it in memory. This can be done by converting it to an Array or a List
 	val data = lines2.map(parseLine).toArray  //> data  : Array[scala12IOSource.TempData] = Array(TempData(244,1946,0.02,81,9
                                                  //| 2,70), TempData(245,1946,0.01,82,90,74), TempData(246,1946,0.0,83,91,74), T
                                                  //| empData(247,1946,0.0,80,90,69), TempData(248,1946,0.0,80,90,70), TempData(2
                                                  //| 49,1946,0.0,81,91,70), TempData(250,1946,0.03,81,90,71), TempData(251,1946,
                                                  //| 0.23,79,86,72), TempData(252,1946,0.0,83,92,74), TempData(253,1946,0.0,83,9
                                                  //| 2,74), TempData(254,1946,0.0,81,93,69), TempData(255,1946,0.0,83,94,71), Te
                                                  //| mpData(256,1946,0.0,82,91,72), TempData(257,1946,0.37,74,80,67), TempData(2
                                                  //| 58,1946,4.71,69,73,64), TempData(259,1946,0.0,77,84,69), TempData(260,1946,
                                                  //| 0.15,77,81,72), TempData(261,1946,0.0,77,82,71), TempData(262,1946,0.0,77,8
                                                  //| 3,70), TempData(263,1946,0.0,75,83,67), TempData(264,1946,0.0,79,89,69), Te
                                                  //| mpData(265,1946,0.0,84,94,74), TempData(266,1946,0.0,72,77,66), TempData(26
                                                  //| 7,1946,0.0,75,80,69), TempData(268,1946,3.27,77,85,69), TempData(269,1946,3
                                                  //| .8,77,85,69), TempData(
                                                  //| Output exceeds cutoff limit.
 	
 	//pull out only max values from above data
 	data.map(_.maxTemp)                       //> res15: Array[Int] = Array(92, 90, 91, 90, 90, 91, 90, 86, 92, 92, 93, 94, 9
                                                  //| 1, 80, 73, 84, 81, 82, 83, 83, 89, 94, 77, 80, 85, 85, 86, 86, 78, 77, 77, 
                                                  //| 80, 83, 86, 84, 85, 82, 78, 77, 86, 68, 71, 76, 79, 73, 78, 84, 81, 84, 83,
                                                  //|  85, 86, 86, 86, 79, 82, 84, 83, 86, 86, 86, 84, 80, 82, 66, 58, 68, 78, 71
                                                  //| , 85, 65, 65, 58, 66, 72, 73, 68, 54, 54, 69, 74, 80, 66, 73, 77, 75, 61, 6
                                                  //| 3, 70, 73, 76, 62, 61, 70, 71, 72, 76, 76, 76, 77, 68, 67, 75, 73, 70, 68, 
                                                  //| 74, 60, 50, 46, 61, 69, 67, 73, 77, 73, 72, 80, 80, 66, 39, 33, 32, 44, 32,
                                                  //|  30, 45, 45, 55, 52, 45, 46, 56, 73, 63, 70, 68, 65, 42, 42, 56, 65, 56, 58
                                                  //| , 65, 73, 76, 79, 83, 72, 82, 66, 67, 59, 63, 71, 58, 56, 75, 71, 50, 49, 4
                                                  //| 7, 49, 62, 60, 72, 76, 79, 81, 72, 62, 54, 62, 71, 70, 53, 42, 46, 42, 69, 
                                                  //| 57, 55, 70, 76, 76, 54, 49, 62, 60, 66, 69, 81, 67, 72, 49, 63, 72, 63, 64,
                                                  //|  69, 76, 70, 84, 79, 75, 80, 90, 69, 77, 76, 71, 88, 85, 81, 81, 81, 87, 80
                                                  //| , 82, 89, 88, 87, 75, 6
                                                  //| Output exceeds cutoff limit.
 	
 	//pull out highest of the high values
 	data.map(_.maxTemp).max                   //> res16: Int = 111
 	
 	//close the file
	source.close
	
//******************************************************************************************************************
}