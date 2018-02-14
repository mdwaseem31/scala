object NamedAndDefaultArguments {
  
  def main(args: Array[String]):Unit = {
    
    
    //***************************************  NAMED AND DEFAULT ARGUMENTS  ***************************************
    def grade(quizzes: List[Int], assignments: List[Int], tests: List[Int] = Nil):Double = {
      ???
      
    }
    //This is the default arguments (List(45,98) maps to quizzes,....)
    def triggerAboveFunc() = {
      grade(assignments = List(45,98), tests = List(87,69), quizzes = List(83))
    }

    //This is the naming arguments
    def triggerAboveFunc2() = {
      grade(assignments = List(45,98), tests = List(87,69), quizzes = List(83))
      //Since tests is anyways nullified in grade function so let's not pass that
      grade(assignments = List(45,98), quizzes = List(83))
      
    }
    
    //*************************************************************************************************************
    
  }
}