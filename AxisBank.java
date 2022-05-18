package week3.day1.assignments;

public class AxisBank extends BankInfo{
	
	public static void deposit() {
		int y= 50000;
		System.out.println("Override Deposit: " +y);
	}
	
	public static void main(String[] args) {
	
		AxisBank axb = new AxisBank();
	axb.saving();
	axb.fixed();
	axb.deposit();

	}
}
