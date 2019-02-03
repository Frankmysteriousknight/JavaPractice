import java.util.*;
//Encapsulation means to use method in a class to get or set the value to the identifiers and is also needed as we don't want the people to access the datatype simply and that's why we keep them private also we can maintain a log file to make it more specific and order it.
class Employee
{
	private int emp_id;
	private String name;
	public void setEmpId(int id)
	{
		this.emp_id=id;
	}
	public int getEmpId()
	{
		return emp_id;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return name;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		emp.setEmpId(id);
		emp.setName(name);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		sc.close();
		
	}

}
