package OOPS;

class Facultyy
{
	public static void main(String[] args) {
		Science obj = new Science();
		obj.total_sal=obj.salary+obj.hra+obj.da+obj.bonous;
		System.out.println("total_salary is :" +obj.total_sal);

	}


	float total_sal = 0,salary =30000;
}

class HRA extends Facultyy
{
	float hra=3000;
}
class Daa extends HRA
{
	float da=2000;

}
class Science extends Daa
{
	float bonous = 2000;
}

