package Bank;
import java.util.Random;
public class StockBankAccount extends RegularBankAccount {
	
public StockBankAccount(int clientId) {
		super(clientId);
	
	}


Random random = new Random();


	protected int commissionOnDeposit = 0;
	protected int commisionOnWithdraw = 0;
	
	
	@Override
	public void Deposit(int sum) {
	commissionOnDeposit = random.nextInt(5);
	 super.Deposit(sum);
	}
	
	
	
	
	@Override
	public void Withdraw(int sum) {
		 commisionOnWithdraw = random.nextInt(5);
		 super.Withdraw(sum);
		 
	}
	
	

	@Override
	public int getBonus() {
		
		return (this.commissionOnDeposit) - (commisionOnWithdraw);
		
		
	}
	
	
	
	
	/*3.	Stock: commissions are initialize to {COW: 0, COD: 0} but they change RANDOMLY on every deposit / withdrawal,
	 *  but the range must be in [0..5]
The bank also adds a bonus:
1.	For regular accounts: 0$ (never)
2.	For business accounts: if (COD = 7) then the bonus is (20 * COD)$
3.	For stock accounts: (COD - COW)$ (can be “negative” bonus)
General structure:
RegularAccount:
	Fields:
		client id - only with getter
		balance - private with a getter but without a setter
		commissionOnWithdrawal - no getter and no setter, NOT public
		commissionOnDeposit  - no getter and no setter, NOT public
	Methods
		deposit(sum) - public, adds “sum” to the balance + COD + bonus
		withdraw(sum) - public, adds “sum” to the balance – COW
		getBonus() - NOT public, calculates the bonus according to the terms
StockAccount and BusinessAccount extend the RegularAccount*/

}
