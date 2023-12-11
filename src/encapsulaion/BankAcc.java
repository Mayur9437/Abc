package encapsulaion;

public class BankAcc {
	
	private double balance = 300000;
	
	public void getBalance()
	{
		System.out.println("My account balance is "+balance);
	}

	public void updatebalance(double b)
	{
		
		balance= balance+b;
	}
}
