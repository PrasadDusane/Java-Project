import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{

	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer,Integer>data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException {
		int x=1;
		
		do {
			try {
				data.put(1234, 1234);
				
				System.out.println("Welcome to the ATM Machine");
				
				System.out.println("Enter Your Account Number: ");
				setAccountNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			}
			
			catch(Exception e) {
				System.out.println("Invalid Information");
				System.out.println("Pleae Enter Again");
				x = 2;
			}
			
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getAccountNumber() && entry.getValue() == getPinNumber())
					{
					getAccountType();
					}
			}
			
			System.out.println("Wrong Account Number or Pin Number");
		}while(x == 1);
	}
	
	int selection;
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice : ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM");
			break;
			
		default:
			System.out.println("Invalid Choice");
			getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice : ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Accont Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM");
			break;	
			
		default:
			System.out.println("Invalid Choice");
			getChecking();
		}
	}
	
	public void getSaving() {
		System.out.println("Saving Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice : ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Accont Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM");
			break;	
			
		default:
			System.out.println("Invalid Choice");
			getSaving();
		}
	}
}
