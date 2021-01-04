package oops;
//inheritance
public class Empolyee extends Person {
	int id = 1010;
	public void DisplayInfo()
	 {
		 System.out.println("id is " +id);
		
	 }
	//Polymorphism
	  //overriding
	 public void display()
	{
		 System.out.println("overriding Employee SubClass");
	 }
	 
	 //overloading
	 public int addition(int x , int y)
	 {
		 return x+y;
	 }
	 
	 public float addition(float x ,float y)
	 {
		 return x+y;
	 }
	 
}
//Encapsulation
class Encapsulation{
	private double Salary;
	
	public double getSalary()
	{
		return Salary;
	}
	
	public void setSalary(double sal)
	{
		Salary = sal;
	}
}

	
	
	
