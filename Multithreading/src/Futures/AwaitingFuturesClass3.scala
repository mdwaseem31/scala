package Futures

import io.StdIn._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success
import scala.util.Failure

object FutureCalculationsClass2 extends App {
  println("FIRST")
  val f = Future {  //It takes a Future type and returns Unit type. Hover over f to see this. 
    println("FUTURE")
  }
  Thread.sleep(1000)  //time is in millisecond
  println("LAST")
  
  val f2 = Future {
    for(i <- 1 to 30) yield ParallelCollections.ParallelCollect.fib(i)
    throw new RuntimeException("Bad.")
  }
//  f2.foreach(println)
  
  //If f2 Future throws any exception, we can handle using onComplete function. It has Success and Failure methods
  f2.onComplete {
    case Success(n) => println(n)
    case Failure(ex) => println("Something went wrong. "+ex)
  }
  
  //The Future doesn't keep the program alive, let's pause the execution.
  Thread.sleep(5000)
  
}

//Output: Without hread.sleep, the order in which it printed result is: FIRST, LAST, FUTURE
//One of the challenges with multi-threading is that the order in which things happen can depend upon the thread scheduler. As shown in the code, if I use cause thread to sleep for 1 second then it prints the results in different order (FIRST, FUTURE, LAST). Try this by reducing the time to see when the order changes. 
//Anything that we're going to keep inside Future thread is going to be executed off in its own thread