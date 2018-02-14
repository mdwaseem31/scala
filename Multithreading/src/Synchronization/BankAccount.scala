package Synchronization

//Without syncronize, below code was returning a random number everytime I run it (race condition problem).
//The problem was fixed after adding synchronized method

class BankAccount (private var _balance: Int) {
  def balance = _balance
  
  def deposit(amount: Int): Boolean = synchronized {  //this is same like this.synchronized
    if (amount < 0) false
    else {
      _balance += amount
      true
    }
  }
    
  def withdraw(amount: Int): Boolean = synchronized {
    if (amount < 0 || amount > _balance) false
    else {
      _balance -= amount
      true
    }
  }
} 

object BankAccount extends App {
  val acc = new BankAccount(0)
  for(i <- (1 to 1000000).par) {
    acc.deposit(1)
  }
  println(acc.balance)
}