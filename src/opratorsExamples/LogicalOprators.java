package opratorsExamples;

public class LogicalOprators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		// AND operator
		boolean r1 = (a>b)&&(b>a);    // a>b = 10 > 30 = false && b>a = 30>10 = true 
		System.out.println(r1);
		
		boolean r2 = (a<b)&&(b>a);    // a<b = 10 < 30 = true  && b>a =30>10 = true 
		System.out.println(r2);
		
		// OR Operator
		boolean r3 = (a>b)||(b>a);    // a>b = 10 > 30 = false || b>a = 30>10 = true  
		System.out.println(r3);
		
		boolean r4 = (a>b)&&(b<a);    // a>b = 10 >30 = false || b<a = 30<10 = false
		System.out.println(r4);
		
		boolean r5 = (a>b)&&(b<a);    // a>b = 10 >30 = false || b<a = 30<10 = false
		System.out.println(!r5);
		
	}

}
