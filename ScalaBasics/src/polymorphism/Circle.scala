package polymorphism

//import scalafx.scene.canvas.GraphicsContext

class Circle(radius: Double, val color: Color) extends Shape(c) with HasColor {
  override def area: Double = math.Pi*radius*radius
  override def perimeter: Double = 2*math.Pi*radius  
//  override def (gc: GraphicsContext): Unit = {}
//    super.draw(gc)
//    gc.fillOval(0, 0, radius, radius)
    
}