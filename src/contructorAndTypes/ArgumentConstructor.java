package contructorAndTypes;

public class ArgumentConstructor {


	
	ArgumentConstructor()
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	ArgumentConstructor(int q)
	{
		int a =20;
		int b = 5;
		System.out.println(a-b);
	}
	
	ArgumentConstructor(String g, int d)
	{
		int a = 12;
		int b = 5;
		System.out.println(a*b);
	}
	
	ArgumentConstructor(int x , int y)
	{
		int a = 10;
		int b = 5;
		System.out.println(a/b);
	}
	public static void main(String args[])
	{
		ArgumentConstructor obj = new ArgumentConstructor();
		ArgumentConstructor obj1 = new ArgumentConstructor(10);
		ArgumentConstructor obj3 = new ArgumentConstructor("mayur", 10);
		ArgumentConstructor obj4 = new ArgumentConstructor(10,20);
	}
	
	
	
	
	
}
