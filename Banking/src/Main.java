
public class Main {

	
	public static void main(String[] args) {
		Account[] accounts= new Account[3];
		MortgageAccount account1= new MortgageAccount("John",100000);
		CheckingAccount account2= new CheckingAccount("David", 200);
		CheckingAccount account3= new CheckingAccount("Sam", 1000);
		
		accounts[0]=account1;
		accounts[1]=account2;
		accounts[2]=account3;
		
		for(int index=0;index<3;index++){
			
			System.out.println(accounts[index].deposit(1000));
			System.out.println("Account Balance: "+accounts[index].getBalance());
			System.out.println(accounts[index].withdraw(500));
			System.out.println("Account Balance: "+accounts[index].getBalance());
			System.out.println(accounts[index].withdraw(1000));
			System.out.println("Account Balance: "+accounts[index].getBalance());
			System.out.println(accounts[index].withdraw(2000));
			System.out.println("Account Balance: "+accounts[index].getBalance());
		}
		
		
	}

}
