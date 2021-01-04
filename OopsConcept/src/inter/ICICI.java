package inter;

public class ICICI implements Bank{
	public void rateOfIntrest(double r)
	{
		double SimpleInterest=(p*r*t)/100 ;
		System.out.println("Simple interest of ICICI is "+SimpleInterest);
	}
}
