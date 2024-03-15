package org.bank;

public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("Saving Account");
	}
	private void fixed() {
		System.out.println("Fixed Account");
	}
	
@Override
public void deposit(){
	System.out.println("Deposit ac new");
}
public static void main(String[] args) {
	BankInfo b= new BankInfo();
	b.deposit();
	b.fixed();
	b.saving();
}
}

