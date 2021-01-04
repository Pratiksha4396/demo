package interfac;

public class BankInterfaceDemo {

	public static void main(String[] args) {
		bankinterface b1,b2;
		IcicBank  ic = new IcicBank();
		b1 = ic;
		b1.rateOfInterest();
		AxisBank ax  = new AxisBank();
		b2 = ax;
		b2.rateOfInterest();
	}

}
