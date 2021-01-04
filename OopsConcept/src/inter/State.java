package inter;

public class State implements Bank{
	public void rateOfIntrest(double r)
	{
		double SimpleInterest=(p*r*t)/100 ;
		System.out.println("Simple interest of State is "+SimpleInterest);
	}
}
