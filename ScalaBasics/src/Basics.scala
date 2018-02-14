

//object, val, var, def are all Decorations

object Basics {
  
  def main(args: Array[String]):Unit = {
    
  //Take input from user
  def getNameAge():Unit = {
    println("What is your name")
    //val name = readLine()
    //???
    println("How old are you")
    //val age = readInt()
    //???
    }
  getNameAge()
    
    //val
    //cannot change val
    val name = "Waseem"
    val age = 25
    val value = 20
    val char = 'a'
    val arr = Array(1,2,3,4,5)
    println('a'.toInt)
    println('a'+1)
    println('a'-1)
    println(('a'+1).toChar)
    println(('a'-1).toChar)
    println('b'-'a')
    
    //var
    //value of var variable can be reassigned so this variable is not preferred in scala
    var i = 5
    
    //tuple
    val t = (1, 2.7, "hi there")
    println(t._1)
    val (a,b,c) = t
    println(b)
    
    //String Interpolation
    val msg = name + " is " + age + " years old."
    val msg2 = s"$name is $age years old."
    println(msg2)
    val msg3 = s"The second element of tuple t is ${t._2}"
    println(msg3)
    println(value+age)
    println(value.+(age)) //this is same as above
    println(value + age)
    println(value.min(age)) //this will give smaller between value and age
    println(value min age) //this is same as above. This is the general rule that anything that takes 1 argument can take infix notation
    println(value min age + 5) //among the operators (+,-*...) least precedence is for the characters like min. So below is like value.min(age+5)
    value == age
    name == "Waseem"
    name == "Waseem" * 5 //name will be repeated 5 times.  
    
    
    //Anything that is not a Decoration is an Expression. Decoration is something that do not give back a value whereas an Expression gives back values
    //Everything in String Interpolation section is an Expression
    
    
    //AND operator
    true && true
    //OR operator
    true||true
    
    //Xor operator used as ^ (read as caret)
    
    //Not equal used as ! (read as bang)
    5 != 4

    
//***************************************************************************************************************   
    //Lambda Expressions - starting from Java 8
    // Lambda Expression is expressed as => and is read as rocket
    //It is a short little expression that defines a function
    val square = (x:Double) => x*x
    //  def square(x:Double):Double = x*x
    println(square(5))
    //Below is read as: Function square2 takes a Double value and return a Double value
    val square2:Double => Double = x => x*x
    println(square2(5))
    
    val twice:Double => Double = x => x*2
    println(twice(5))
    //Above can also be written as
    val twice2:Double => Double = _*2
    println(twice2(10))
    
    //Below function lt (less than) takes two double values and return a boolean
    val lt:(Double,Double) => Boolean = (x,y) => x<y
    println(lt(5,2))
    //Above can be written as below
    val lt2:(Double,Double) => Boolean = _<_
    println(lt2(5,2))
    
//***************************************************************************************************************

    //while loop
    //This is really not preferred in scala. Instead scala wants us to use Expressions because loop doesn't return anything. Loops are just statements. But scala still supports it.
    var j=0
    while (j<5) {
//       println(j)
       j += 1  //j=j+1
    }
    
    //do while
    do {
//      println(j)
      j+=1
    }
    while(j<5)
      
     //if statement
     val resp = if(age<30) {
       "No admittance"
     } else {
       "Come on in"
     }
    //Above can also be written as below
    val resp2 = if(age<30) "No admittance" else "Come on in"
    println(resp)
    
//***************************************************************************************************************
    
    //for loop
    // <- is read as "in"
    for(j <- 1 to 5) {
//      println(j)
    }
    
    //Above can also be writte as
    for(j <- 0 to 5) {
//      println(j)
    }
    
    for(j <- 0 until 10; if j%3==0 || j%j==5) {
//      println(j)
    }
    
    //Below is kind of nested for loop
    for(j <- 0 until 10; if j%3==0 || j%j==5; sqr = j*j; k <- 'a' to 'c') {
//      println(j + " " + k)
    }
    
    //Above can also be written as
    for {
      j <- 0 until 10
      if j%3==0 || j%j==5
      sqr = j*j
      k <- 'a' to 'c'
     } {
//      println(j + " " + k)
    }
     
    val stuff = for {
      j <- 0 until 10
      if j%3==0 || j%j==5
      sqr = j*j
      k <- 'a' to 'c'
     } yield {
      j -> k
    }
//    println(stuff)

//***************************************************************************************************************
     //TRY CATCH
     //The catch block is like partial functions
     val str = "123a"
     val num = try {
       str.toInt
     } catch {
       //We have to return an Int
       case ex: NumberFormatException => 0
         println(ex)
     }
     println(num)

//***************************************************************************************************************
     //Below function takes no input but returns a list.
     //It asks user to keep entering the string until the user quits. When user quits, it forms a list of all the entered strings
     def buildList(): List[String] = {
       println("Please enter a string")
       val input = readLine()
       if (input == "quit") Nil
       else input::buildList()
     }
//     val lst = buildList()
//     println(lst)
     

  }
}