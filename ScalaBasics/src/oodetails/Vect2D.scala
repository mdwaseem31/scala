package oodetails

class Vect2D(val x: Double, val y: Double) {
  // + - * / % | & ^ ! < > = ? $ \ : ~
  
  //Precedence chart in scala. Below is the order of precedence
  // Other special characters
  // * / %
  // + -
  // :
  // = !
  // < >
  // &
  // |
  // all letters
  // assignment operators

  //Because of apply method in companion object, we don't have to specify "new" which creating object
  def +(v: Vect2D)= Vect2D(x + v.x, y + v.y)  //variable or function names can be special characters
  def -(v: Vect2D) = Vect2D(x - v.x, y - v.y)
  def *(c: Double) = Vect2D(x * c, y * c)
  def /(c: Double) = Vect2D(x / c, y / c)
  def unary_-() = Vect2D(-x, -y)  //unary operator
  def magnitude = math.sqrt(x * x + y * y)
  def apply(index: Int): Double = index match {
    case 0 => x
    case 1 => y
    case _ => throw new IndexOutOfBoundsException(s"2D Vector indexed at $index.")
  }
}

//When you create an object that has the same name as that of a class then it is called companion object
object Vect2D {
  def main(args: Array[String]): Unit = {
    val v1 = Vect2D(1,2)  //Since we have written below apply method, we don't need to specify "new" while creating a new object.
    val v2 = Vect2D(2,2)
    //val v3 = v1.plus(v2)
    //val v3 = v1 plus v2
    val v3 = v1 + v2
    val v4 = -v1
    println(v3.magnitude)
  }
  //By writing this apply method, we don't have to specify "new" which creating object
  def apply(x: Double, y: Double) = new Vect2D(x, y)
}