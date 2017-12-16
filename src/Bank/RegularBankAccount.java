package Bank;

public  class RegularBankAccount {
	
	private final int clientId;
	private int balance;
	
	protected int commissionOnDeposit = 1;
	protected int commisionOnWithdraw = -3;
	
	
public RegularBankAccount(int clientId) {
	this.clientId = clientId;
	
}
	
	public  int getBalance() {
		return this.balance;
	}
	
	public int getClientId() {
		return this.clientId;
	}
	
	
	public void Deposit(int sum) {
		this.balance = this.balance + sum + this.commissionOnDeposit;
	}
	
	public void Withdraw(int sum) {
		this.balance = this.balance + sum + this.commisionOnWithdraw;
	}
	
	public int getBonus() {
		return 0;
	}

	






}
	
		





/*You are asked to simulate a bank account. Each account must have a client id and it doesn’t change ever. For each account,
 *  there’s a commission on withdrawals (COW) and commission on deposits (COD): each time a client withdraws an amount of money, 
 *  the bank will “take” (COW) money, and each time the client deposits an amount, the bank will add a “reward” with (COD).
There are 3 types of accounts:
1.	Regular: commissions are initialize to {COW: 3, COD: 1}
2.	Business:  commissions are initialize to {COW: 1, COD: 1}, but each 10 DEPOSITS the COD will increase by one
, but when it gets to 7
, it will start from 1 again.
3.	Stock: commissions are initialize to {COW: 0, COD: 0} but they change RANDOMLY on every deposit / withdrawal but the range must be in [0..5]
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
