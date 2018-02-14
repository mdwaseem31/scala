package bank1

class Account(val customer: Customer, val id: String) {
  
  //We don't want one account to alter balance of another account. That's why we used private[this]
  private[this] var _balance = 0
  
  //If a new account is created then the customer should have it on his list
  customer.addAccount(this)
  
  //Function to return balance
  def balance = _balance
  
  def deposit(amount: Int): Boolean = {
    if(amount<0) false
    else {
      _balance += amount
      true
    }
  }
  
  def withdraw(amount: Int): Boolean = {
    if(amount<0 || amount>_balance) false
    else {
      _balance -= amount
      true
    }
  }
  
//object Account {
//  def main(args: Array[String]): Unit = {
//    val a = new Account(new Customer("Waseem","Mohammed","id",new Address(Nil)),"id")
//    a.balance = 700
//    a.balance += 40
//  }
// }
// 
//def apply(c: Customer): Account = {
//    
//}

}