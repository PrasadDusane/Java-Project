import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {

	Scanner input = new Scanner(System.in);
	
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	private int accountNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	public int setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		return accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
		} else {
		System.out.println("Balance is less,sorry");	
		}
		}

	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
		} else {
		System.out.println("Balance is less,sorry");	
		}
		}

	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposite for Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
		} else {
		System.out.println("Balance is less,sorry");	
		}
		}

	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposite3 from saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
		} else {
		System.out.println("Balance is less,sorry");	
		}
		}
}
