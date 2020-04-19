package OOPS;

public class Faculty 
{
	float salary = 30000;
	

}
class Science extends Faculty
{
	float bonous = 2000;
	
	public static void main(String[]args) 
	{
		Science obj = new Science();
		System.out.println(" salary is: " + obj.salary);
		System.out.println(" bonus is: " + obj.bonous);
	}
}
