public class CurrentAccount extends Account 
{
	
	final double overdraftLimit=1000;
	
	public CurrentAccount()
	{
		System.out.println("Object of CurrentAccount class");
	}
	
	public CurrentAccount(String name,int age,long accountNum, double balance)
	{
		super(name,age,accountNum,balance);
	}
	
	public void withdraw(double a)
	{
		if(a>balance+overdraftLimit)
			System.out.println("overdraftLimit is reached ");
		else 
		{
			balance=balance-a;
		}
	}
	
	public void printBalance()
	{
		System.out.println("Updated balance of "+name+"is"+balance);
	}
}
