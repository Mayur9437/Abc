package polymorphism;

public class Display {

	public void test1()
	{
		System.out.println("test1 method from without argument");
	}
	
	public void test1(int a)
	{
		System.out.println("test1 method int argument");
	}
	
	public void test1(String n)
	{
		System.out.println("test1 method String argument");
	}
	
	public void test2()
	{
		System.out.println("test2 method from without argument");
	}
	
	public void test2(int a)
	{
		System.out.println("test2 method int argument");
	}
	
	public static void main(String[] args) {
		
		Display d = new Display ();
		d.test1();
		d.test1(20);
		d.test1("dhsj");
		d.test2();
		d.test2(55);
		
	}

}
