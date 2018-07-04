import java.util.Random;
public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
//	Class member (static) that has the number of accounts created thus far
	private static int numberOfAccounts = 0;
//	Class member (static) that tracks the total amount of money stored in every account created
	private static double totalMoney = 0;
//	BankAccount has the following attributes: (string) account number, (double) checking balance, (double) savings balance
	public BankAccount(double cB, double sB) {
		checkingBalance = cB;
		savingBalance = sB;
		accountNumber = randomAccount();
		numberOfAccounts ++;
		totalMoney = totalMoney + cB + sB;
	}
//	Create a private method that returns a random account number
	private static String randomAccount() {
		Random rand = new Random();
		int currentNo = 1000000 + rand.nextInt(8999999);
		return Integer.toString(currentNo);
	}
//	Getter balance
	public void getCheckingBalance() {
		System.out.println("Account Balance is " + this.checkingBalance);
	}
	public void getSavingBalance() {
		System.out.println("Account Balance is " + this.savingBalance);
	}
//	Deposit money into either the checking or saving, be sure to add to total amount stored.
	public void depositToChecking(double amount) {
		this.checkingBalance += amount;
		totalMoney += amount;
		System.out.println("This person has checking " + this.checkingBalance + "Total money in the bank " + totalMoney);
	}
	public void depositToSaving(double amount) {
		this.savingBalance += amount;
		totalMoney += amount;
		System.out.println("This person has saving " + this.savingBalance + "Total money in the bank " + totalMoney);
	}
//	Withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds
	public void withdrawFromChecking(double amount) {
		if (this.checkingBalance > amount) {
			this.checkingBalance -= amount;
			totalMoney -= amount;
			System.out.println("This person has checking " + this.checkingBalance + "Total money in the bank " + totalMoney);
		} else {
			System.out.println("Not enough funds");
		}
	}
	public void withdrawFromSaving(double amount) {
		if (this.savingBalance > amount) {
			this.savingBalance -= amount;
			totalMoney -= amount;
			System.out.println("This person has saving " + this.savingBalance + "Total money in the bank " + totalMoney);
		} else {
			System.out.println("Not enough funds");
		}
	}
//	See total money:
	public static void getTotal() {
		System.out.println(totalMoney);
	}
	public static int getNumber() {
		System.out.println(numberOfAccounts);
		return numberOfAccounts;
	}
	
}
