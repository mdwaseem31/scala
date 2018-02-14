object scala11IOSource {
	//Refer the chapter-2 csv file (TX417945_1263.csv)
	
	case class TempData(day:Int,year:Int,precip:Double,aveTemp:Int,maxTemp:Int,minTemp:Int);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(332); 
	
	def parseLine(line:String):TempData = {
		val p = line.split(",").map(_.trim)
		TempData(p(1).toInt,p(4).toInt,p(5).toDouble,p(6).toInt,p(7).toInt,p(8).toInt)
	};System.out.println("""parseLine: (line: String)scala11IOSource.TempData""");$skip(41); val res$0 = 
	
	new java.io.File(".").getAbsolutePath;System.out.println("""res0: String = """ + $show(res$0));$skip(111); 
	val source = io.Source.fromFile("C:/Spring/workspace/InfiniteSkills/WorkingFiles/Chapter2/TX417945_1263.csv");System.out.println("""source  : scala.io.BufferedSource = """ + $show(source ));$skip(185); 
                                                  
                                                 
	//Below returns Iterator of String. It gets all lines
	val lines = source.getLines;System.out.println("""lines  : Iterator[String] = """ + $show(lines ));$skip(103); val res$1 = 
	//The first two lines in the csv file are header lines so we can skip them by doing below
	lines.next;System.out.println("""res1: String = """ + $show(res$1));$skip(12); val res$2 = 
	lines.next;System.out.println("""res2: String = """ + $show(res$2));$skip(372); 
  //map every line (except the two skipped above) to parseLine. This gives back an Iterator of TempData. This is the kind of data we want (desired data types for each value)
  //val data = lines.map(parseLine)
  
  //Now get the data out of Iterator and store it in memory. This can be done by converting it to an Array or a List
 	val data = lines.map(parseLine).toArray;System.out.println("""data  : Array[scala11IOSource.TempData] = """ + $show(data ));$skip(70); val res$3 = 
 	
 	//pull out only max values from above data
 	data.map(_.maxTemp);System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(69); val res$4 = 
 	
 	//pull out highest of the high values
 	data.map(_.maxTemp).max;System.out.println("""res4: Int = """ + $show(res$4));$skip(36); 
 	
 	//close the file
	source.close}
}
