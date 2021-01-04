package oops;

public interface Draw {
	void DrawTriangle();
	
}
class Triangle implements Draw
{
	public void DrawTriangle()
	{
		System.out.println("Drwaing Triangle");
	}
}