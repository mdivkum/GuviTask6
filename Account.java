package task6.GuviTask6;

public class Account {
	
	private double accountnumber;
	private double balance;
	
	public Account()
	{
		this.accountnumber=678345;
		this.balance=10000;
		System.out.println("Account Number"+ this.accountnumber);
	}
 public Account(double accountnumber , double balance) {
	 this.accountnumber=accountnumber;
	 this.balance=balance;
	 }
 
 public void withdraw(double amount) {
	 
	 if(balance>=amount) {
		 balance-=amount;
	 }else {
		 System.out.println("Insufficient balance amount");
	 }
 }
 
 public void depositbalance(double amount) {
	
	 balance+=amount; 
 }
 public double getcheckbalance() {
	 return balance;
 
 }
 
 
	public static void main(String[] args) {
	
		System.out.println("Create a bank account with initial amount Rs.5000 ");
		Account a=new Account(12354,5000);
		System.out.println("Deposit the amount Rs.6000 ");
		a.depositbalance(6000);
		System.out.println("Total Amount after deposit :  " + a.getcheckbalance());
		System.out.println("Withdraw amount Rs.6000  : ");
		a.withdraw(4000);
		System.out.println("Amount after withdraw " + a.getcheckbalance());
		System.out.println("Total Balance amount  : "+ a.getcheckbalance());
		

	}

}
