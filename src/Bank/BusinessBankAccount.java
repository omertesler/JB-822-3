package Bank;

public class BusinessBankAccount extends RegularBankAccount{

	
	protected int commissionOnDeposit = 1;
	protected int commisionOnWithdraw = -1;
	
	private int balance;
	
	
	
		
	
	
	public BusinessBankAccount(int clientId) {
		super(clientId);		
	}
	
	
	public int getBonus() {
		if (this.commissionOnDeposit == 7) {
			return 20 * this.commissionOnDeposit;
		}
		return 0;
	}
	
	
	@Override
	public void Deposit(int sum) {
		for(int counter = 1; counter <= 70; counter ++)
			if(counter == 10) {
				 commissionOnDeposit ++ ;	
			}
			
			else if (counter == 70) {
				commissionOnDeposit  = 1 ;
			}
		
			else  super.Deposit(sum + (commissionOnDeposit - 1) + this.getBonus()); ;
		
		
	}


	
	


	
	
	
	
	/*2.	Business:  commissions are initialize to {COW: 1, COD: 1}, but each 10 DEPOSITS the COD will increase by one
	, but when it gets to 7
	, it will start from 1 again.
*/
	
	
}
