class Bank{
 
  double balance ;
  
  void set(double d){
	  balance = d ;
  }
  double deposite(double v){
	  balance += v ;
	 return balance ;
  }
  
  double withdraw(double w){
	  balance -= w ;
	  return balance;
	 
  }
  void check(){
	   System.out.println("Your Balance is: "+balance);
  }
}
class BankAccount{
	public static void main(String args[]){
		Bank b1 = new Bank();
		
		b1.set(10000.0);
		System.out.println("Money deposite \n Total balance is: "+b1.deposite(13000.87));
		System.out.println("Money withdraw \n Total balance is: "+b1.withdraw(4000.00));
		 
		 b1.check();
	}
}