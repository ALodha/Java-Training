
public class MortgageAccount extends Account {

	public MortgageAccount(String holderName, long amount) {
		// TODO Auto-generated constructor stub
		super(holderName);
		transaction("Initial Borrowed Amount", amount);
	}

	@Override
	public boolean deposit(long amount) {
		// TODO Auto-generated method stub
		transaction("Mortgage Payment", amount);
		return true;
	}

	@Override
	public boolean withdraw(long amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
