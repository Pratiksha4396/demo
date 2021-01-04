package oops;

public class Person {
	String name = "Pratiksha";
	int age = 10;
	String address =" Pune";
	
  public void personalDetails()
	{
		System.out.println("Details of person " + name+ "," +age+ "," +address);
	}
	
	public void display()
	{
		System.out.println("Overridding SuperClass");
	}
}

