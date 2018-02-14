package polymorphism

//import scalafx.scene.canvas.GraphicsContext
//import scalafx.scene.paint.Color

class Rectangle(val width: Double, val height: Double, val color: Color) extends Shape with HasColor {
  //As soon as the Rectangle class extends Shape class, it gets a copy of all of them (everything in class Shape {})
//  val shp = new Shape
//  shp.area
  
  //we can override the method in super class
  override def area: Double = width*height
  override def perimeter: Double = 2*(width+height)
//  override def draw(gc: GraphicsContext): Unit = {
//    super.draw(gc)
//    gc.fillRect(0, 0, width, height)
//  }
  
}