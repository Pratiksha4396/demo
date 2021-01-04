package inter;

public class AxisBank implements Bank{

	public void rateOfIntrest(double r)
	{
		double SimpleInterest= (p*r*t)/100;
		System.out.println("Simple interest of Axis bank is "+SimpleInterest);
	}
}
