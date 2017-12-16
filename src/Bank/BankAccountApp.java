package Bank;

import Bank.RegularBankAccount;
import Bank.BusinessBankAccount;
import Bank.StockBankAccount;



public class BankAccountApp {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------Regular Account----------------------------");
		RegularBankAccount regular = new RegularBankAccount(307950905);
		regular.Deposit(100);
		System.out.println("regular account balance after deposit is : " + regular.getBalance());
		regular.Withdraw(50);
		System.out.println("regular account balance after withdraw is : " + regular.getBalance());
		
		
		
		System.out.println("------------------------Business Account----------------------------");
		BusinessBankAccount business = new BusinessBankAccount(306879553);
		business.Deposit(100);
		System.out.println("business account balance after deposit is : " + business.getBalance());
		business.Withdraw(50);
		System.out.println("business account balance after withdraw is : " + business.getBalance());
		
		
		
		
		System.out.println("------------------------Stock Account--------------------------------");
		StockBankAccount stock = new StockBankAccount(306887524);
		stock.Deposit(100);
		System.out.println("stock account balance after deposit is : " + stock.getBalance() + stock.getBonus());
		stock.Withdraw(50);
		System.out.println("stock account balance is after withdraw : " + stock.getBalance() + stock.getBonus());
		
		
	}



}
