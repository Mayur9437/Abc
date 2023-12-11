package variablesExample;

public class Assign01 {

	//local variable
		public void local()
		{
			int a = 10;
			int b = 30;
			int c = a+b;
			System.out.println(c);
		}
		
		//local variable
		public void local2()
		{
			int a = 46;
			int b = 44;
			int c =a-b;
			System.out.println(c);
		}
		
		//local variable
		public static void local3() 
		{
			int a = 12;
			int b = 6;
			int c = a*b;
			System.out.println(c);
		}
		
		//local variable
		public static void local4()
		{
			int a = 60;
			int b = 5;
			int c = a/b;
			System.out.println(c);
		}
	
		//main method
	public static void main(String args[])
	{
		Assign01 x = new Assign01();
		x.local();
		x.local2();
		Assign01.local3();
		Assign01.local4();	
	}
	
}
