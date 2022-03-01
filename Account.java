import java.text.DecimalFormat;
import java.util.Scanner;


public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'10,1000.21");
	private int CustomerNumber;
	private int PinNumber;
	private double CheckingBalance;
	private double SavingBalance;
	
	//set the customerNumber
	
	public int setCustomerNumber(int customerNumber) {
		
		 this.CustomerNumber = customerNumber;
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
	  this.PinNumber = pinNumber;
		return pinNumber;
	}
	
	public int  getCustomerNumber() {
		return CustomerNumber;
		
	}
	
	public int  getPinNumber() {
		return PinNumber;
	}
	
	public double getCheckingBalance() {
		return CheckingBalance;
	}
	
	public double getSavingBalance() {
		return SavingBalance;
	}
	
	
	
	//calculate checking account withdraw
	public double calcCheckingWithdrawal(double amount) {
		CheckingBalance = (CheckingBalance - amount);
		return CheckingBalance;
		 
	}
	//calculate saving account withdrawal
	public double clacSavingWithdrawl(double amount) {
		SavingBalance = (SavingBalance - amount);
		return SavingBalance;
	}
	
	//calculate checking account deposit
	public double calcCheckingDeposit(double amount)
	{
		CheckingBalance=(CheckingBalance + amount);
		return CheckingBalance;
		}
	public double calcSavingDeposit(double amount)
	{
		SavingBalance=(SavingBalance + amount);
		return SavingBalance;
	}
	
	//customer checking account withdrawal input
	public void getCheckingWithdrawlInput()
	{
		System.out.println("Checking account balance" + moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to withdraw from checking Account");
		double amount=input.nextInt();
		if((CheckingBalance-amount)>=0)
		{
			calcCheckingWithdrawal(amount);
			System.out.println("New checking account Balance" + moneyFormat.format(CheckingBalance));
			
		}
		else
		{
			System.out.println("Balance can not be negative "+"\n");
			
		}
		}
	//customer saving account withdraw input
	public void getSavingWithdrawInput() 
	{
		System.out.println("Saving Account balance"+ moneyFormat.format(SavingBalance));
		System.out.println("Amount you want to withsrawfrom saving account");
		double amount=input.nextDouble();
		if((SavingBalance-amount)>=0)
		{
			
			clacSavingWithdrawl(amount);
			System.out.println("New Saving Account" +SavingBalance + "\n");
		}else {
			System.out.println("Balance can not be Negative" + "\n");
		}
		
	}
	
	//customer checking account Deposit input
		public void getCheckingDepositInput()
		{
			System.out.println("Checking account balance"+moneyFormat.format(CheckingBalance));
			System.out.println("Amount you want to Deposit from checking Account");
			double amount=input.nextInt();
			if((CheckingBalance + amount)>=0)
			{
				calcCheckingDeposit(amount);
				System.out.println("New checking account Balance"+moneyFormat.format(CheckingBalance));
				
			}
			else
			{
				System.out.println("Balance can not be negative "+"\n");
				
			}
			}
		
		//customer saving account deposit input
		public void getSavingDepositInput() 
		{
			System.out.println("Saving Account balance"+ moneyFormat.format(SavingBalance));
			System.out.println("Amount you want to deposit from saving account");
			double amount=input.nextDouble();
			if((SavingBalance-amount)>=0)
			{
				
				calcSavingDeposit(amount);
				System.out.println("New Saving Account" + moneyFormat.format(SavingBalance) + "\n");
			}else {
				System.out.println("Balance can not be Negative" + "\n");
			}

		}

}
