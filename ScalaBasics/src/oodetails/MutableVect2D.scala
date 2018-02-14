package oodetails

//private[oodetails] means that variable x can be seen by anyone inside oodetails package which means other classes in the same package can modify its value. This means it is public in this package.
//class MutableVect2D(private[oodetails] var _x: Double, private var _y: Double) {

// private will make this variable private to the class.
//class MutableVect2D(private var _x: Double, private var _y: Double) {

//private[this] will make this variable private not only to the current class but private to the current instance of the class.
class MutableVect2D(private[this] var _x: Double, private[this] var _y: Double) {
  
  //Below functions are used to return the x and y values so that the outside code should not directly access them.
  def x = _x
  def y = _y
  
  def setX(newX: Double): Unit = _x = newX
  def setY(newY: Double): Unit = _y = newY
  
  def +=(mv: MutableVect2D): MutableVect2D = {
    _x += mv.x
    _y += mv.y
    this  //give back the current vector
  }
  def -=(mv: MutableVect2D): MutableVect2D = {
    _x -= mv.x
    _y -= mv.y
    this
  }
  def *=(c: Double): MutableVect2D = {
    _x *= c
    _y *= c
    this
  }
  def magnitude = math.sqrt(x * x + y * y)
  
  
  //Added below function after learning apply method.
  def apply(index: Int): Double = index match {
    case 0 => _x
    case 1 => _y
    case _ => throw new IndexOutOfBoundsException(s"2D vector indexed at $index.")
  }

  //Added below function after learning update method. This update keyword is suitable only for mutable classes.
  def update(index: Int, newValue: Double): Unit = index match {
    case 0 => _x = newValue
    case 1 => _y = newValue
    case _ => throw new IndexOutOfBoundsException(s"2D vector updated at $index.")
  }
  
}


object MutableVect2D {
  def main(Args: Array[String]): Unit = {
    val v1 = MutableVect2D(1,2)
    val v2 = MutableVect2D(2,2)
    v1 += v2
    println(v1.magnitude)
  }
  
  //By writing this apply method, we don't have to specify "new" which creating object
  def apply(x: Double, y: Double) = new MutableVect2D(x, y)
}