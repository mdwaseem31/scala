package bank1

class Customer(
    val firstName: String,
    val lastName: String,
    val id: String,
    private var _address: Address){
  
  private var _accounts: List[Account] = Nil
  
  def addAccount(account: Account): Unit = _accounts ::= account
  
  def removeAccount(id: String): Boolean = {
    //get the index of the id which matches the id to be removed
    val index = _accounts.indexWhere(_.id == id)
    if(index < 0) false
    else {
       //find id by index and replace it with empty list(Nil). "1" represents number of elements to be replaced
      _accounts = _accounts.patch(index, Nil, 1)
      true
    }
  }
    
    def accounts = _accounts
    
    def changeAddress(a: Address): Unit = _address = a
    
    def address = _address
    
}