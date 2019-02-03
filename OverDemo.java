//This program is an example of Constructor and Method Overloading,We can even do it with different datatype


import java.util.*;
class Employee
{
	private int id;
	private String name;
	public Employee()
	{
		this.id=0;
		this.name="Yash";
	}
	public Employee(int i)
	{
		this.id=i;
		this.name="Yash";
	}
	public Employee(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	public void display()
	{
		System.out.println("Default ID="+id+"Name="+name);	
	}
	public void display(int i)
	{	this.id=i;
		System.out.println("Para Id="+id+"Default Name="+name);
	}
	public void display(int i,String n)
	{
		this.id=i;
		this.name=n;
		System.out.println("Para Id="+id+"Para Name="+name);
	}
}

class test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String name=sc.next();
		Employee empD=new Employee();
		Employee empP=new Employee(23);
		Employee empP2=new Employee(i,name);
		empD.display();
		empP.display(23);
		empP2.display(i,name);
		sc.close();
	
	}

}
