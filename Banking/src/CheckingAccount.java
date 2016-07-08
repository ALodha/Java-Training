
public class CheckingAccount extends Account {

	private long overDraftAmount;
	
	public CheckingAccount(String holderName, long amount) {
		super(holderName);
		overDraftAmount=amount;
	}

	@Override
	public boolean deposit(long amount) {
		// TODO Auto-generated method stub
		transaction("Checking Deposit", amount);
		return true;
	}

	@Override
	public boolean withdraw(long amount) {
		// TODO Auto-generated method stub
		
		if(getBalance()+overDraftAmount>amount){
			transaction("Checking Withdrawal", -amount);
			return true;
		}
		return false;
	}

}
