import java.io.IOException;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Menu extends Account{

	Scanner menuInput =new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	
	public void getLogin()throws IOException{
		int x =1;
		do {
			try {
				
				data.put(123456, 123);
				data.put(221222, 456);
				System.out.println("Welcome  the ATM project");
				System.out.println("Enter  your customer number");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your pin number");
				setPinNumber(menuInput.nextInt());
				
			}catch (Exception e)
			{
				
				System.out.println("Invalid character, Enter only Number"+"\n");
				x=2;	
			}
			for(Entry<Integer, Integer> entry:data.entrySet()) {
				
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()) {
					getaccountType();
				}
				
			}
			
			System.out.println("Wrong customer number or id "+ "\n");
		 
		
	  }while(x==1);
  }
int selection;

//display Account type menu
  private void getaccountType() {
	  
	  System.out.println("Select the Account you want to accsess");
	  System.out.println("Type 1: checking Account");
	  System.out.println("Type 2: Saving Account");
	  System.out.println("Type 3:Exit");
	  System.out.println("Choice:");
	  selection =menuInput.nextInt();
	  
	  switch (selection) {
	  
	  case 1:
		  getCheckingBalance();
		  break;
		  
	  case 2:
		  getsaving();
		  break;
		  
	  case 3:
		  System.out.println("Invalid choice" + "\n");
		  getaccountType();
  
	  }
  }
  
  //Display checking account menu with selection
  
  public void getChecking() {
	  System.out.println("Checking Account");
	  System.out.println("Type 1: View Balance");
	  System.out.println("Type 2: Withdraw funds");
	  System.out.println("Type 3:Deposit funds");
	  System.out.println("Type 4:");
	  System.out.println("Choice :"+ "\n");
	  selection = menuInput.nextInt();
	  switch(selection) {
	  
	  case 1:
		  System.out.println("Checking Account Balance" + moneyFormat.format(getCheckingBalance()));
		  getaccountType();
		  break;
		  
	  case 2:
		  getCheckingWithdrawlInput();
		  getaccountType();
		  break;
		  
	  case 3:
		  getCheckingDepositInput();
		  getaccountType();
		  break;
		  
		  default:
			  System.out.println("\n"+"Invalid choice"+"\n");
			  getChecking();
			  	  
	  }
  
  }
  
  //display saving account menu with selection 
  public void getsaving() {
	  
	  System.out.println("Saving Account");
	  System.out.println("Type 1: View Balance");
	  System.out.println("Type 2: Withdraw funds");
	  System.out.println("Type 3:Deposit funds");
	  System.out.println("Type 4:");
	  System.out.println("Choice :"+ "\n");
	  selection = menuInput.nextInt();
	  switch(selection) {
	  
	  case 1:
		  System.out.println("Saving Account Balance" + moneyFormat.format(getCheckingBalance()));
		  getaccountType();
		  break;
		  
	  case 2:
		  getSavingWithdrawInput();
		  getaccountType();
		  break;
		  
	  case 3:
		  getSavingDepositInput();
		  getaccountType();
		  break;
		  
		  default:
			  System.out.println("\n"+"Invalid choice"+"\n");
			  getsaving();
			  	  
	  }
	  
  }
	  
	}


 
  

