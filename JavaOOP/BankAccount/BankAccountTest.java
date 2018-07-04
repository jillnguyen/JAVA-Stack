public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(2000, 3000);
		BankAccount account2 = new BankAccount(350, 5000);
		BankAccount account3 = new BankAccount(3500, 65000);
		BankAccount account4 = new BankAccount(850, 40000);
		BankAccount account5 = new BankAccount(300, 25000);
		account1.getCheckingBalance();
		BankAccount.getTotal();
		account1.withdrawFromChecking(500);
		account2.withdrawFromSaving(5100);
		account3.depositToChecking(500);
		account4.depositToSaving(4500);
		account1.withdrawFromChecking(1500);
		account5.withdrawFromSaving(5000);
		account1.getCheckingBalance();
		account2.getSavingBalance();
		account3.getSavingBalance();
		BankAccount.getTotal();
		BankAccount.getNumber();
	}

}
