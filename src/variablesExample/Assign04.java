package variablesExample;

public class Assign04 {
	int a = 10;
	
	// non static method 
	public void global01()
	{
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	// static method 
	public static void global02()
	{
		int d = 30;
	//	int e = d+a; we can't access the global variable in static method.
		System.out.println(d);
	}
	
	//main method 
	public static void main(String args[])
	{
		Assign04 x = new Assign04();
		x.global01();
		System.out.println(x.a);
		Assign04.global02();
	}
	
	
}
