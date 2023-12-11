package methodType;

public class NonStaticMethod {
	
	// non static method
	public void mumbai() {
		
		System.out.println("Mumbai is famous for the Bollywood");
	}
	
	//non static method
	public void pune() {
		
		System.out.println("Pune is famous for the Shanivar Vada ");
	}
	
	// main method
	public static void main(String args[]) {
		
		NonStaticMethod x = new NonStaticMethod();
		
		x.pune();
		x.mumbai();
	}
}


