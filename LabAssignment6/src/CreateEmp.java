
public class CreateEmp {

	public static void main(String[] args) 
	{
		System.out.println("count = "+Employee.showCount());
		
		Employee emp1=Employee.createObj();
		System.out.println("count="+Employee.showCount());
		
		Employee emp2=Employee.createObj();
		System.out.println("count="+Employee.showCount());
		
		System.out.println("emp1 = ");
		System.out.println("id = "+emp1.getEmpId());
		System.out.println("name = "+emp1.getEmpName());
		
		emp1.setEmpName("Rahul");
		System.out.println("new name = "+emp1.getEmpName());
		
		System.out.println("emp2 = ");
		System.out.println("id = "+emp2.getEmpId());
		System.out.println("name = "+emp2.getEmpName());
		
		Employee emp3=new Employee();
		System.out.println("name = "+emp3.getEmpName());
	}
	
	static
	{
		System.out.println("call to static block");
	}
}
