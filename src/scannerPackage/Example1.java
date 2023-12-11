package scannerPackage;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int  a = in.nextInt();
		int  b = in.nextInt();
		
		System.out.println("The Value of a = " +a);
		System.out.println("The value of b =" +b);
		
		System.out.println(a*b);
	}

}
