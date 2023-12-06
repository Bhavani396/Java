package com.Exceptionhandling;

public class BankAccount {
	
	String accountHolderName;
	int accountNumber;
	int balance;
	
	//constructor
	public BankAccount(String accountHolderName, int accountNumber, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//getter and setter method
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//methods
	
	public String deposit(int deposit)
	{
		balance=balance+deposit;
		
		return (balance>=5000 ? "Minimum balance is maintained" : "Minimum balance is not mainitained");

	}
	
	
	public String withdraw(int withdraw) throws InsufficientBalanceException
	{
		if (withdraw > balance) {
            // Throw the custom exception if the amount to withdraw exceeds the balance
            throw new InsufficientBalanceException("Insufficient balance in the account");
        } else {
            balance -= withdraw;
            return("Withdrawn: " + withdraw + ", Remaining balance: " + balance);
        }

	}
	
	
	public static void main(String[] args) throws Exception
	{
		
		BankAccount bank = new BankAccount("Manjula",123456, 5000);
		System.out.println("a/c no "+ bank.getAccountNumber());
		System.out.println("a/c holder name  "+ bank.getAccountHolderName());
		System.out.println("a/c balace "+ bank.balance);
		
		String msg= bank.deposit(1000);
		System.out.println(msg);
		System.out.println("Balance after depost " + bank.getBalance());
		msg=bank.withdraw(7000);
		System.out.println(msg);
		System.out.println("Balance after withdraw " + bank.getBalance());
		
		}
	}

//Custom exception class for handling insufficient balance during a withdrawal
class InsufficientBalanceException extends Exception {

public InsufficientBalanceException(String message) {
   super(message);
}
}


