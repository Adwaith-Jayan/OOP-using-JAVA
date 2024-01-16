class Employee
{
	char[] Name=new char[30];
	int age;
	long phone_number;
	char[] Address=new char[30];
	int salary;

	void printSalary()
	{
		System.out.println("Salary="+salary);
	}

}
class Officer
{
	char[] Specialization=new char[30];

}
class Manager
{
	char[] Department=new char[30];
}
class EmployeeMain
{
	public static void main(String[] args)
	{
		Employee E1;
		E1=new Employee();
		E1.Name=new char[]{'A','b','c','\0'};
		E1.age=25;
		E1.phone_number=8281489680L;
		E1.Address=new char[]{'A','B','\0'};
		E1.salary=50000;
		E1.printSalary();
	}
}
