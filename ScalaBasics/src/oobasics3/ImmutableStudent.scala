package oobasics3

class ImmutableStudent(
    val firstName: String,
    val lastName: String,      
    val quizzes: List[Int] = Nil,
    val assignments: List[Int] = Nil,
    val tests: List[Int] = Nil) {
  
  private def validGrade(grade: Int): Boolean = grade >= -20 && grade <= 120
  
  //Below will give error because all the variables are declared as val and are not modifiable
  //def addQuiz(grade: Int): Unit = quizzes ::= grade
  
  //To overcome above, use below function
  //{} is not required in function
  def addQuiz(grade: Int): ImmutableStudent = if(validGrade(grade))
    new ImmutableStudent(
      firstName,
      lastName,
      grade :: quizzes,
      assignments,
      tests)
  else this  //Return type of this function is ImmutableStudent has to return an ImmutableStudent. So if the grade is not valid then I want to return the current object that we are inside of (ImmutableStudent object) which is represented by keyword "this". So in short, if the grade is not valid then this function will return the same ImmutableStudent object.

  def addAssignments(grade: Int): ImmutableStudent = if(validGrade(grade))
    new ImmutableStudent(
      firstName,
      lastName,
      quizzes,
      grade :: assignments,
      tests)
  else this
  
  def addTests(grade: Int): ImmutableStudent = if(validGrade(grade))
    new ImmutableStudent(
      firstName,
      lastName,
      quizzes,
      assignments,
      grade :: tests)
  else this
  
  def quizAverage: Double = if (quizzes.isEmpty) 0.0
    else if(quizzes.length == 1) quizzes.head 
    else (quizzes.sum - quizzes.min).toDouble/(quizzes.length - 1)
  def assignmentAverage: Double = if(assignments.isEmpty) 0.0
    else assignments.sum.toDouble/assignments.length
  def testAverage: Double = if(tests.isEmpty) 0.0
    else tests.sum.toDouble/tests.length
  def average: Double = quizAverage*0.1 + assignmentAverage*.5 + testAverage*0.4
}