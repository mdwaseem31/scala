package polymorphism

class MutableSquares(_length: Double) extends MutableRectangle(_length, _length) {
  override def width_=(w: Double) = {
    width = w
    height = w
  }
}