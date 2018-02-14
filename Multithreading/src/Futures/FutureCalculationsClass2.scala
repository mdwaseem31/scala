package Futures

import io.StdIn._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success
import scala.util.Failure
import scala.concurrent.Await
import scala.concurrent.duration._

object AwaitingFuturesClass3 extends App {
  println("FIRST")
  val f = Future {  //It takes a Future type and returns Unit type. Hover over f to see this. 
    println("FUTURE")
  }
  Thread.sleep(1000)  //time is in millisecond
  println("LAST")
  
  val f2 = Future {
    for(i <- 1 to 30) yield ParallelCollections.ParallelCollect.fib(i)
  }

  //I want to print the result in the main thread and I want main thread to pause for it.
  //Below will block the main thread. It will wait for up to 5 seconds.
  //This means that we have a thread just sitting and waiting there doing nothing for 5 seconds.
  println(Await.result(f2, 5.seconds))
  
}