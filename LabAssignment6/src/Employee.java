
public class Employee 
{
	private int empId;
	private String empName;
	private static int count=0;
	
	public static Employee createObj()
	{
		Employee emp=null;
		if(count==0)
		emp=new Employee(1001,"Amit");
		return emp;
	}
	
	public Employee() 
	{
		this(1002,"Sumit");
	}
	
	private Employee(int empId,String empName)
	{
		super();
		this.empId=empId;
		this.empName=empName;
		count++;
	}
	
	public int getEmpId()
	{
		return this.empId;
	}


	public void setEmpName(String empName) 
	{
		this.empName=empName;
	}
	
	public String getEmpName()
	{
		return empName;
	}


	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	
	public static int showCount() 
	{
		return count;
	}

}
