package oobasics3

class Student(
    val firstName: String,
    val lastName: String,      
    private var _quizzes: List[Int] = Nil,  //"private var" allows its value to be modified only from within this class and prevents its value from getting modified outside of this class.
    private var _assignments: List[Int] = Nil,
    private var _tests: List[Int] = Nil) {
  
  private def validGrade(grade: Int): Boolean = grade >= -20 && grade <= 120
  
  //since quizzes is declared as var, I can modify its value. Because it is private, its value can be modified only within this class.
  def addQuiz(grade: Int): Boolean = if(validGrade(grade)) {
    _quizzes ::= grade
    true
  } else false
  
  def addAssignments(grade: Int): Boolean = if(validGrade(grade)) { 
    _assignments ::= grade
    true
  } else false

  def addTests(grade: Int): Boolean = if(validGrade(grade)) {
    _tests ::= grade
    true
  } else false
  
  
  def quizAverage: Double = if (_quizzes.isEmpty) 0.0
    else if(_quizzes.length == 1) _quizzes.head 
    else (_quizzes.sum - _quizzes.min).toDouble/(_quizzes.length - 1)
  def assignmentAverage: Double = if(_assignments.isEmpty) 0.0
    else _assignments.sum.toDouble/_assignments.length
  def testAverage: Double = if(_tests.isEmpty) 0.0
    else _tests.sum.toDouble/_tests.length
  def average: Double = quizAverage*0.1 + assignmentAverage*.5 + testAverage*0.4

  
  //To have outside code to allow access, create a function that returns the entire list
  //In below function, we didn't mention return types. We can do so if the function is not recursive.
  //But it is always adviced to use return types in functions.
  def quizzes = _quizzes
  
  def assignments = _assignments
  
  def tests = _tests
  
}