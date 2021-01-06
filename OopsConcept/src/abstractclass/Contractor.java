package abstractclass;

	public class Contractor extends Employee {
		int payment = 1000;
		int workingHour =8;
		public void calculateSalary()
		{
			int calculate = payment*workingHour;
			System.out.println("Salary of Contractor is " +calculate);
		}
public void calculateSalary(int hr)
{
	int calculate = payment*hr;
	System.out.println("Salary of Contractor is " +calculate);
}
	
	public static void main(String[] args) {
		//Employee obj = new Contractor();
		
		Contractor obj1 = new Contractor();
		obj1.calculateSalary(5);
		obj1.calculateSalary();
		
		
		
		

	}

}
