

public abstract class Account extends Person 
{

	long accountNum;
	double balance;
	Person accountHolder;
	
	
	public Account()
	{
		super();
		accountNum = 0;
		balance = 0;
		accountHolder = null;
	}
	

	public Account(String name,int age,long accountNum, double balance) 
	{
		super(name,age);
		this.accountNum = accountNum;
		this.balance = balance;
		
		
	}


	public long getAccNum() 
	{
		return accountNum;
	}

	public void setAccNum(long accountNum) 
	{
		this.accountNum = accountNum;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public Person getAccHolder()
	{
		return accountHolder;
	}

	public void setAccHolder(Person accHolder)
	{
		this.accountHolder = accHolder;
	}

	public void deposit(double a)
	{
		balance=balance+a;
		
	}
	
	public abstract void withdraw(double a);

	
	public double getBalance(double a)
	{
		return balance;
	}
	
	public void printBalance()
	{
		System.out.println("Updated balance of"+name+"is"+balance);
	}

	@Override
	public String toString() {
		return super.toString()+"Account [accNum=" + accountNum + ", balance=" + balance + ", accHolder=" + accountHolder + "]";
	}
	
	
}
