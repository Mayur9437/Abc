package variablesExample;

public class Assign02 {
	
	static int a = 12;
	static int b = 5;
	
	//non static method
	public void static01()
	{
		int c = a+b;
		System.out.println(c);		
	}
	
	//non static method 
	public void static02()
	{
		int c = a-b;
		System.out.println(c);
	}
	
	//static method 
	public static void static03()
	{
		int c =a*b;
		System.out.println(c);
	}
	
	//static method
	public static void static04()
	{
		int c = a/b;
		System.out.println(c);
	}
	
	//main method 
	public static void main(String args[])
	{
		Assign02 x = new Assign02();
		x.static01();
		x.static02();
		Assign02.static03();
		Assign02.static04();
		
	}
		
}
