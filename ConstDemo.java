/**Constructors are the member methods which are used to 1. intialise the objects of the class, 
 * 2. The values can be passed through the objects of the class parameters
 * 3. It is of same name as that of the Class Name
 * 4. It is used to allocate the memory
 * 5. It will  never return anything. 
 *
 */
import java.util.*;
class Employee
{
	private int id;
	private String name;
	public Employee() //Default Constructors
	{
		this.id=98;
		this.name="Yash Mathur";
		System.out.println("The Employee's Id is"+id+"And Name is"+name);
	}
	public Employee(int i,String n)//Parameterized Constructors
	{
		this.id=i;
		this.name=n;
		System.out.println("The Employee's Id is"+id+"And Name is"+name);
	}
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
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

class test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		Employee emp=new Employee();
		Employee emp1=new Employee(id,name);
		emp.setId(5);
		System.out.println(emp.getId());
		emp.setName("Jai");
		System.out.println(emp.getName());
		sc.close();
	}

}
