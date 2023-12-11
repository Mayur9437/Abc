package variablesExample;

public class Example1 {
	
	//local variable
	public void ex1()
	{
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println(c);
	}
	
	//local variable
	public void ex2()
	{
		int a = 46;
		int b = 44;
		int c =a-b;
		System.out.println(c);
		
	}
	
	//local variable
	public void ex3() 
	{
		int a = 12;
		int b = 6;
		int c = a*b;
		System.out.println(c);
		
	}
	
	//local variable
	public void ex4()
	{
		int a = 60;
		int b = 5;
		int c = a/b;
		System.out.println(c);
	}
	
	//main method 
	public static void main(String args[])
	{
		Example1 x = new Example1();
		x.ex1();
		x.ex2();
		x.ex3();
		x.ex4();
	}
	
	
}
