
//Example1: This is an example where we can inherit from one class along with multiple traits
class Person {}
trait Parent {}
trait Female {}
class Mother extends Person with Parent with Female {}

//Example2: class inheriting from multiple traits
trait Person2 {}
trait Parent2 {}
trait Female2 {}
class Mother2 extends Person with Parent2 with Female2 {}

//Above can also be written as
trait Person3 {}
trait Parent3 extends Parent3 {}
trait Female3 extends Parent3 {}
class Mother3 extends Person with Parent3 {}