package demo;

import java.io.IOException;
import java.util.Scanner;

public class Maintest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Account ac = new Account();
	        SavingsAccount sa = new SavingsAccount();
	        FixedAccount fa = new FixedAccount();
	        CheckingAccount ca = new CheckingAccount();
	        System.out.println("1)Checking Account");
	        System.out.println("2)Saving Account");
	        System.out.println("3)Fixed Account");
	        System.out.println("Enter Account Type");
	        int choice = sc.nextInt();
	        switch (choice) {
	        case 1: {
	 
	            System.out.println("Enter The Account Number");
	            ac.accountNumber = sc.next();
	            System.out.println("Enter The Customer Name");
	            ac.customerName = sc.next();
	            System.out.println("Enter The Amount");
	            ac.amount = sc.nextDouble();
	            System.out.println("Hi " + ac.getCustomerName() + ", " + "currently you are using Checking Account.");
	            System.out.println("Your account number is " + ac.getAccountNumber());
	            System.out.println("Your are currently holding amount Rs." + ac.getAmount());
	            break;
	        }
	 
	        case 2: {
	 
	            System.out.println("Enter The Account Number");
	            ac.accountNumber = sc.next();
	            System.out.println("Enter The Customer Name");
	            ac.customerName = sc.next();
	            System.out.println("Enter The Amount");
	            ac.amount = sc.nextDouble();
	            System.out.println("Enter The InterestRate");
	            sa.interestRate = sc.nextDouble();
	            System.out.println("Hi " + ac.getCustomerName() + ", " + "currently you are using Savings Account.");
	            System.out.println("Your account number is " + ac.getAccountNumber());
	            System.out.println("Your are currently holding amount Rs." + ac.getAmount());
	            System.out.println("Rate of interest is " + sa.interestRate + "%");
	            break;
	        }
	 
	        case 3: {
	 
	            System.out.println("Enter The Account Number");
	            ac.accountNumber = sc.next();
	            System.out.println("Enter The Customer Name");
	            ac.customerName = sc.next();
	            System.out.println("Enter The Amount");
	            ac.amount = sc.nextDouble();
	            System.out.println("Enter The Number Of Years");
	            fa.numberOfYears = sc.nextInt();
	            System.out.println("Hi " + ac.getCustomerName() + ", " + "currently you are using Fixed Account.");
	            System.out.println("Your account number is " + ac.getAccountNumber());
	            System.out.println("Your are currently holding amount Rs." + ac.getAmount());
	            System.out.println("Number of years " + fa.numberOfYears);
	            break;
	        }
	 
	        default:
	            System.out.println("Invalid Account Type");
	        }
	}

}
