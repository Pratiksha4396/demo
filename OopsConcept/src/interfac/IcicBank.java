package interfac;

public class IcicBank implements bankinterface{
	float intRate=10.5f;
	@Override
	public void rateOfInterest() {
		System.out.println(" ICIC Interest rate is "+ intRate);
		
	}

	
	

}
