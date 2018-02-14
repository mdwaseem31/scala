package bank1

import io.StdIn._

object BankMain {
  
  def main(args: Array[String]): Unit = {
    var option = 0
    val bank = new Bank
    //customer is going to be an Option for Customer
    var customer: Option[Customer] = None
    var account: Option[Account] = None
    while(option != 10) {
      println(menu)
      option = readInt()
      option match {
        case 1 => customer = Some(createCustomer(bank))
        case 2 => customer = selectCustomer(bank)
        case 3 =>
        case 4 =>
        case 5 =>
        case 6 =>
        case 7 =>
        case 8 =>
        case 9 =>
        case 10 =>
        case _ => println("That is not a valid option. Please select again.")
      }
    }
  }
  
  private def createCustomer(bank: Bank): Customer = {
    println("What is the customer's first name?")
    var firstName = readLine()
    println("What is the customer's last name?")
    var lastName = readLine()
    println("What is the customer's address?")
    var address = readAddress()  //This is because an address can have variable number of lines
    bank.addCustomer(firstName, lastName, address)
  }
  
  private def readAddress(): Address = ???
  
  private def selectCustomer(bank: Bank): Option[Customer] = {
    println("Do you want to find the customer by name or id? (name/id)")
    val option = readLine()
    if(option == "name") {
      println("What is the customer's first name?")
      var firstName = readLine()
      println("What is the customer's last name?")
      var lastName = readLine()
      bank.findCustomer(firstName, lastName)
    } else {
      println("What is the customer's id")
      val id = readLine()
      bank.findCustomer(id)
    }
  }

  private val menu = """Select one of the following options:
  1. Create Customer
  2. Select Customer
  3. Create Account
  4. Close Account
  5. Select Account
  6. Deposit to Account
  7. Withdraw from Account
  8. Check Account Balance
  9. Change Address
  10. Quit"""
  
}