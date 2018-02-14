package oobasics2

class Student(
    val firstName: String,
    val lastName: String,      
    private var _quizzes: List[Int] = Nil,  //"private var" allows its value to be modified only from within this class and prevents its value from getting modified outside of this class.
    private var _assignments: List[Int] = Nil,
    private var _tests: List[Int] = Nil) {
  
  //since quizzes is declared as var, I can modify its value
  def addQuiz(grade: Int): Unit = _quizzes ::= grade
  
  def addAssignments(grade: Int): Unit = _assignments ::= grade

  def addTests(grade: Int): Unit = _tests ::= grade
  
  
  def quizAverage: Double = if (_quizzes.isEmpty) 0.0
    else if(_quizzes.length == 1) _quizzes.head 
    else (_quizzes.sum - _quizzes.min).toDouble/(_quizzes.length - 1)
  def assignmentAverage: Double = if(_assignments.isEmpty) 0.0
    else _assignments.sum.toDouble/_assignments.length
  def testAverage: Double = if(_tests.isEmpty) 0.0
    else _tests.sum.toDouble/_tests.length
  def average: Double = quizAverage*0.1 + assignmentAverage*.5 + testAverage*0.4
}