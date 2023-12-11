package methodType;

public class CombiOfStaticAndNonStaticMethod {
		//static method 
		public static void mumbai() {
			System.out.println("Mumbai is famous for the Bollywood");
		}
		
		//non static method 
		public void  pune() {
			System.out.println("Pune is famous for the Shanivar Vada ");
		}
			
		// main method
		public static void main(String args[]) {
			
			CombiOfStaticAndNonStaticMethod.mumbai();   //static method 
			
			CombiOfStaticAndNonStaticMethod y = new CombiOfStaticAndNonStaticMethod();   //non static method 
			y.pune();
		}
		
		
		
		
		
	}

