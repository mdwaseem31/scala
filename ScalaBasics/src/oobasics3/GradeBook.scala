package oobasics3

import oobasics3.Student

object GradeBook {
  
  def main(args: Array[String]):Unit = {
    val students = List(new Student("Jane","Doe"), new Student("John","Doe"))
    for(s <- students) printStudent(s)
  }
  
  def printStudent(s: Student): Unit = {
    //In order to access student objects, the objects of class Student should be declared as val
    println(s.firstName+" "+s.lastName)
    println("Grade = "+s.average)
    //Below line will give error because the list "tests" is private in Student class
    //println("Tests = "+s.tests.mkString(", "))
    
    //To overcome above, we can have Student class send the list "tests" but only thing is that we should not expose variables of Student class to other classes.
    //After I created functions in Student class, I don't get any error on below statement
    //Now we get back the list "tests" and can perform operations on it in this class but we cannot change its value in Student class.
    //For modifying values in list "tests", we have to call "addTests" method
    println("Tests = "+s.tests.mkString(", "))
  }
  
}