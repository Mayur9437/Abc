package opratorsExamples;

public class AssignmentOnOperators {

	public void UnaryOp()
	{
		int a = 30;
		System.out.println(a++); 	//= 30 >> a = 30+1 = 31
		System.out.println(a--);   			 //	a= 31 >> a = 31-1 = 30
		System.out.println(++a);       		//	a= 30 >> a = 30+1 = 31
		System.out.println(--a);    		//	a= 31 >> a = 31-1 = 30
	}
	
	public void arithMaticOp(int a , int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	public void conditionalOp(int a, int b)
	{
	System.out.println(a<b); 
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	}
	
	public void shiftOp(int a, int b)
	{
	System.out.println(a<<b);
	System.out.println(a>>b);
	}

	public void logicalOp()
	{
	System.out.println((30>20)&&(10>12));
	System.out.println((10>30)||(10>14));
	boolean a = !((10>20)||(10>5));
	System.out.println(a);
	}

	public void bitwiseOp()
	{
	System.out.println((10>20)&(10>5));
	System.out.println((10>20)|(10>5));
	System.out.println((10>20)^(10>5));
	}

	
	public static void main(String[] args) {
		AssignmentOnOperators x = new AssignmentOnOperators();
		x.UnaryOp();
		x.arithMaticOp(10,60);
		x.conditionalOp(10,60);
		x.shiftOp(20,60);
		x.logicalOp();
		x.bitwiseOp();
	}

}
