package oops;

public class PersonDemo {

	public static void main(String[] args) {
		Person objPerson = new Person();
		objPerson.display();
		
		Empolyee obj = new Empolyee();
		obj.personalDetails();
		obj.DisplayInfo();
		obj.addition(10, 20);
		obj.addition(15.2f, 20.5f);
		
		Encapsulation objEncap = new Encapsulation();
		objEncap.setSalary(20000);
		System.out.println("Salary of Employee is " +objEncap.getSalary());
		
		AbstractVehical objAbstract = new BMW();
		objAbstract.run();
		
		Draw objInterface = new Triangle();
		objInterface.DrawTriangle();
	
	}

}
