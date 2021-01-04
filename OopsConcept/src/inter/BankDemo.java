package inter;

public class BankDemo {

	public static void main(String[] args) {
		
		Bank objBank = new AxisBank();
		objBank.rateOfIntrest(9);
		
		Bank obj1Bank = new State();
		obj1Bank.rateOfIntrest(8.9);
		
		Bank obj2Bank = new BankOfMaharashtra();
		obj2Bank.rateOfIntrest(8.8);
		
		Bank obj3Bank = new ICICI();
		obj3Bank.rateOfIntrest(8.7);
		
		Bank obj4Bank = new HDFC();
		obj4Bank.rateOfIntrest(8.6);
		
		
		
	}

}
