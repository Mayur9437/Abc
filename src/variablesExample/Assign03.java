package variablesExample;

public class Assign03 {
	
	int a = 12;
	int b = 4;
	
	//non static method
	public void global01()
	{
		int c = a+b;
		System.out.println(c);
	}
	
	//non static method 
	public void global02()
	{
		int c = a-b;
		System.out.println(c);
	}
	
	//main method 
	public static void main(String args[])
	{
		Assign03 x = new Assign03();
		x.global01();
		x.global02();
		
		int y = 12;
		int z = y*x.b; 		//static method 
		System.out.println(z);
		
		int m = 45;
		int q = m/x.b;		//static method
		System.out.println(q);
	}
	
}
