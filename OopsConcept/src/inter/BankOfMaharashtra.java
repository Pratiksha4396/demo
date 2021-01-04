package inter;

public class BankOfMaharashtra implements Bank{
	public void rateOfIntrest(double r)
	{
		double SimpleInterest= (p*r*t)/100 ;
		System.out.println("Simple interest of BankOfMaharashtra is "+SimpleInterest);
	}
}
