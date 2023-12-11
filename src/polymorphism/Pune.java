package polymorphism;

public class Pune extends Mumbai{

	public void vadapav()
	{
		System.out.println("Vadapav from ");
	}
	
	public void bollywood(String n)
	{
		System.out.println("Bollywood from pune");
	}
	
	public static void main(String[] args) {
		
		Pune p = new Pune();
		p.vadapav();
		p.bollywood("fhdg");
		p.tajHotel();
		
		Mumbai m = new Mumbai();
		m.vadapav();
		m.bollywood();
		m.tajHotel();
		
		
		
	}

}
