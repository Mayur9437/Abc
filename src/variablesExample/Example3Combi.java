package variablesExample;

public class Example3Combi {
	
	static int a = 20;
	static int b = 30;
	
	public void ex1()
	{
		int a = 10;
		int b = 70;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void ex2()
	{
		int a = 30;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}
	
	public void ex3()
	{
		int c = a*b;
		System.out.println(c);
	}
	
	public static void ex4()
	{
		int c = a/b;
		System.out.println(c);
		
	}
	
	public static void main(String args[])
	{
		Example3Combi x = new Example3Combi();
		x.ex1();
		Example3Combi.ex2();
		x.ex3();
		Example3Combi.ex4();
	
	}
	
}
