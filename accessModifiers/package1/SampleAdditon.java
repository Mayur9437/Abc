package package1;

import java.util.Scanner;

public class SampleAdditon {

	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
//	int d = in.nextInt();

	
	public void add()
	{
		System.out.println("The value of "+a);
		System.out.println("The value of "+b);
		c= a+b;
		System.out.println("sum of a and b is "+c);
	}
	
//	SampleAdditon()
//	{
//		System.out.println(c+d);
//	}
	
	public static void main(String[] args) {
		SampleAdditon s1 = new SampleAdditon();
	//	s1.add();

	}

}
