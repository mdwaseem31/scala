package polymorphism

//When we pass arguments from Subtype to the Supertype, do not declare it as a val or a var because they will be already defined in the Supertype.
class Square(length: Double) extends Rectangle(length, length) {
}