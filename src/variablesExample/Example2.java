package variablesExample;

public class Example2 {
	static int a = 10;
	static int b = 10;
	
	//static variable
	public void ex1()
	{
		int c = a+b;
		System.out.println(c);
		
	}
	
	//static variable
	public void ex2()
	{
		int c =a-b;
		System.out.println(c);
		
	}
	
	//static variable
	public void ex3()
	{
		int c = a*b;
		System.out.println(c);
	}
	
	//static variable
	public void ex4()
	{
		int c = a/b;
		System.out.println(c);
	}
	
	//main method
	public static void main(String args[])
	{
		Example2 x = new Example2();
		x.ex1();
		x.ex2();
		x.ex3();
		x.ex4();
	
	}
	
	
	
	
	
	
	
	
	
}
