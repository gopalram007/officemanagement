package demo;

public class Account {
	 public String accountNumber;
	    public double amount;
	    public String customerName;
	 
	    public String getAccountNumber() {
	        return this.accountNumber;
	    }
	 
	    public double getAmount() {
	        return this.amount;
	    }
	 
	    public String getCustomerName() {
	        return this.customerName;
	    }
	 
	    public void setAccountNumber(String newAccNum) {
	        this.accountNumber = newAccNum;
	    }
	 
	    public void setAmount(double newAmount) {
	        this.amount = newAmount;
	    }
	 
	    public void setCustomerName(String newCustomerName) {
	        this.customerName = newCustomerName;
	    }
	}
	 
	class SavingsAccount extends Account {
	    public double interestRate;
	 
	}
	 
	class FixedAccount extends Account {
	    public int numberOfYears;
	}
	 
	class CheckingAccount extends Account {
	}
	 

