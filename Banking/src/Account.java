
public abstract class Account {
	private long balance;
	private String holderName;
	
	public Account(String name) {
		// TODO Auto-generated constructor stub
		holderName=name;		
	}

	public final void transaction(String message, long amount){
		
		System.out.println("Name: "+holderName);
		System.out.println("Transaction Message: "+message);
		System.out.println("Amount: "+amount);
		balance=balance+amount;
	}
	
	public long getBalance(){
		
		return balance;
	}
	
	public abstract boolean deposit(long amount);
	
	public abstract boolean withdraw(long amount);
	
}
