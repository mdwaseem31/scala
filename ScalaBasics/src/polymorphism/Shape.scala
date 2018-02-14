package polymorphism

abstract class Shape {
  def area: Double
  def perimeter: Double
  //Adding scalafx.jar to Java Build Path is not making below line of code work
//  def draw(gc: GraphicsContext): Unit = {}
}

object Shape {
  def main(args: Array[String]): Unit = {
    val rect = new Rectangle(3,4, Color.Black)
    printShapeData(rect)
    val circle = new Circle(3, Color.Black)
    printShapeData(circle)
  }
  
  
  //This method works for infinite number of shapes. This is called Inclusion Polymorphism. This is provided by the sub types
  def printShapeData(s: Shape): Unit = {
    println(s"Area = ${s.area}")
    println(s"Perimeter = ${s.perimeter}")
  }
}
