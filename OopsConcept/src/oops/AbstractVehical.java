package oops;

abstract class AbstractVehical {
	public abstract void run(); 

}

class BMW extends AbstractVehical
{
	public void run()
	{
		System.out.println("BMW is Running");
}
}
