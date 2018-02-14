package polymorphism

//I name the object as "Enumerations". It can be anything (Mark used the name "StreetLightColor")

object Enumerations extends Enumeration {
  val Red, Green, Yellow = Value
}

class StreetLight(private var _color: Enumerations.Value) {
  def color = _color
  
  import Enumerations._
  def cycle: Unit = _color = _color match {
    case Red => Green
    case Green => Yellow
    case Yellow => Red
    //Below cannot be done because the color type is now restricted to only Value
    //case _ => "Bad" 
  }
}