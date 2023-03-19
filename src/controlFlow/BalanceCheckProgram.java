package controlFlow;

public class BalanceCheckProgram extends AccountDetailsProgram{
public void displayName(String myNameIsPuja) {
	
	System.out.println(myNameIsPuja);
	float updatedBalance=depositAmount(50000, 1000);
	updatedBalance = withdrawAmount(updatedBalance, 6000);
	displayMethod(122323, updatedBalance);
	
}
}