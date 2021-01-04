package interfac;

public class AxisBank implements bankinterface{
	float intRate=9.5f;
	//double prin
	@Override
	public void rateOfInterest() {
		System.out.println(" Axis Interest rate is "+ intRate);
	}
	

}
