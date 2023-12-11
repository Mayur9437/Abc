package assignmentDate29_10_22;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		//swapping logic 
		// a= a+b = 20+30 =50 now a is 50
		// b= a-b = 50-30 = 20 now b is 20
		// a= a-b = 50-20 = 30 now a is 30 
		//now no are swapped a=30 b=20
		
		System.out.println("Before swaapping :"+a +" "+b);
		
		a= a+b;
		b= a-b;
		a= a-b;
				
		System.out.println("After swaapping :"+a +"  "+b);
		

	}

}
