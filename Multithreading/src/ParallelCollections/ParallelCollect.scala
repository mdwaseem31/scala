package ParallelCollections

object ParallelCollect extends App{
    //To see parallel processing is happening, lets first write an inefficient recursive Fibonacci function.
    def fib(n: Int): Int = if (n < 2) 1 else fib(n - 1)+fib(n - 2)
    
    //Run this and notice that the numbers in the output appear sequentially in ascending order (because of only one thread)
    for(i <- 30 to 15 by -1) {
      println(fib(i))
    }
    
    //Do a par on a range and it will give back the parallel equivalent of it. Results are not in random order which proves it is using par.
    //This is because the parallel collection takes each of these numbers and assigns it to different threads.
    //Thread getting smaller number will finish faster and then they can go on and do the next number.
    for(i <- (30 to 15 by -1).par) {
      println(fib(i))
    }
    
    //One of the problems of parallelism is race condition
    var i = 0
    //Result of below is 1000000 - without par
    for(j <- 1 to 1000000) i += 1
    println(i)
    
    
    //With par - result produced is not 1000000. This is because of race condition
    var k = 0
    for(j <- (1 to 1000000).par) {
      //load i from memory
      //add 1 to register where i is stored
      //store i back to memory
      k += 1
    }
    println(k)
    
}