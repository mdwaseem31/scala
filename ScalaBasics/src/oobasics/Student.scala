package oobasics

class Student(
    val firstName: String,
    val lastName: String,
    quizzes: List[Int] = Nil,
    assignments: List[Int] = Nil,
    tests: List[Int] = Nil) {
  
  //Below function do not have () in its signature. If anything changes(if it mutates) then it should defenitely have (). If it is immutable then () is not required.
  def quizAverage: Double = if (quizzes.isEmpty) 0.0
    else if(quizzes.length == 1) quizzes.head 
    else (quizzes.sum - quizzes.min).toDouble/(quizzes.length - 1)
  def assignmentAverage: Double = if(assignments.isEmpty) 0.0
    else assignments.sum.toDouble/assignments.length
  def testAverage: Double = if(tests.isEmpty) 0.0
    else tests.sum.toDouble/tests.length
  def average: Double = quizAverage*0.1 + assignmentAverage*.5 + testAverage*0.4
}