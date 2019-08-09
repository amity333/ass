
public class CouseObj {

	public static void main(String[] args) 
	{

		Courses course=Courses.SAP;
		Trainee trainee=new Trainee("Amit",course);
		
		System.out.println("Below Details");
		System.out.println("name = "+trainee.getTName());
		System.out.println("course = "+trainee.getCourse());
	}

}
