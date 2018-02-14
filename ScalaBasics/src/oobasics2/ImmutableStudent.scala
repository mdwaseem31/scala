package oobasics2

class ImmutableStudent(
    val firstName: String,
    val lastName: String,      
    val quizzes: List[Int] = Nil,
    val assignments: List[Int] = Nil,
    val tests: List[Int] = Nil) {
  
  //Below will give error because all the variables are declared as val and are not modifiable
  //def addQuiz(grade: Int): Unit = quizzes ::= grade
  
  //To overcome above, use below function
  def addQuiz(grade: Int): ImmutableStudent = new ImmutableStudent(
      firstName,
      lastName,
      grade :: quizzes,
      assignments,
      tests)

  def addAssignments(grade: Int): ImmutableStudent = new ImmutableStudent(
      firstName,
      lastName,
      quizzes,
      grade :: assignments,
      tests)
  
  def addTests(grade: Int): ImmutableStudent = new ImmutableStudent(
      firstName,
      lastName,
      quizzes,
      assignments,
      grade :: tests)
  
  def quizAverage: Double = if (quizzes.isEmpty) 0.0
    else if(quizzes.length == 1) quizzes.head 
    else (quizzes.sum - quizzes.min).toDouble/(quizzes.length - 1)
  def assignmentAverage: Double = if(assignments.isEmpty) 0.0
    else assignments.sum.toDouble/assignments.length
  def testAverage: Double = if(tests.isEmpty) 0.0
    else tests.sum.toDouble/tests.length
  def average: Double = quizAverage*0.1 + assignmentAverage*.5 + testAverage*0.4
}