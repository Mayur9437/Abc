package mockPrac;

public class Combi {
	// static method 
	public static void test1()
	{
		System.out.println(" My name is Mayur ");
	}
	
	//non static method
	public void test2()
	{
		System.out.println(" Mayur is good boy ");
		
	}
	
	//main method 
	public static void main(String args[])
	{
		Combi.test1();
		Combi x = new Combi();
		x.test2();
		
	}
}
