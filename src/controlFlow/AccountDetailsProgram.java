package controlFlow;

public class AccountDetailsProgram {

	public void displayMethod(int accountNumber, float balance) {
		System.out.println("account number:" + accountNumber);
		System.out.println("balance:" + balance);
	}

	public float withdrawAmount(float balance, float amountWithdrawl) {
		balance = balance - amountWithdrawl;
		System.out.println("amountRemaining:" + balance);
		return balance;
	}

	public float depositAmount(float balance, float amountDeposit) {
		float totalAmount = balance + amountDeposit;
		System.out.println("totalAmount:" + totalAmount);
		return totalAmount;
	}
}
