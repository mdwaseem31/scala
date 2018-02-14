//package Akka
//
//object SimpleActorExample extends App {
//  class SimpleActor extends Actor {
//    def receive = {
//      case s: String => println("String: "+s)
//      case i: Int => println("Number: "+i)
//    }
//    
//    def foo = println("Normal method")
//  }
//  
//  val system = ActorSystem("SimpleSystem")
//  val actor = system.actorOf(Props[SimpleActor],"SimpleActor")
//  
//  println("Before messages")
//  actor ! "Hi there."
//  println("After string")
//  actor ! 42
//  println("After int")
//  actor ! 'a'
//  println("After char")
//  
//  system.shutdown()
//}