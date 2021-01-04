package inter;

public class HDFC implements Bank{
	public void rateOfIntrest(double r)
	{
		double SimpleInterest= (p*r*t)/100; 
		System.out.println("Simple interest of HDFC is "+SimpleInterest);
	}
}
