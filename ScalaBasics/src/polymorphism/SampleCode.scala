package polymorphism

import io.StdIn._

object SampleCode {
  def square(x: Double) = x*x
  
  def sumValues(n: Int): Double = {
    if (n < 1) 0.0 else readDouble() + sumValues(n - 1)
  }
  
  def productValues(n: Int): Double = {
    if (n < 1) 1.0 else readDouble() * productValues(n - 1)
  }
  
  //Combine above two functions into one.
  //We did abstraction here.
  //Here the op variable takes only one type of operator (Double)
  def combineValues(n: Int, base: Double, op: (Double, Double) => Double): Double = {
    if (n < 1) base else op(readDouble(), combineValues(n - 1, base, op))
  }
  
  //Polymorphism means handling multiple types. But below code accepts only Double. We have to make it more generic so that it works for any type.
  def bubbleSort(arr: Array[Double]): Unit = {
    for (i <- 0 until arr.length; j <- 0 until arr.length-1-i) {
      if(arr(j+1) > arr(j)) {
        val tmp = arr(j)
        arr(j) = arr(j + 1)
        arr(j + 1) = tmp
      }
    }
  }
  
}