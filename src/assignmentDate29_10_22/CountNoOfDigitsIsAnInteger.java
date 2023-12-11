package assignmentDate29_10_22;

public class CountNoOfDigitsIsAnInteger {

	public static void main(String[] args) {
		
		
		int a = 3423647;
		int count = 0; 
		
		
		for(int i = 1; a>0 ;i++)	
		{
			a= a/10;
			count++;
		}
		
		System.out.println("count is "+count );
		
		
	}

}
