public class CreatePerson {

	public static void main(String[] args)
	{
		
		Account acc1=new CurrentAccount();
		System.out.println("Current account="+acc1);
		acc1.withdraw(100);
		acc1.printBalance();
	
		Account acc2=new SavingsAccount();
		System.out.println("Savings account="+acc1);
		acc2.deposit(2000);
		acc2.printBalance();
				
	}

}
