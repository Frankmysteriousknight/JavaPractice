/*
 * Here we will	use the statica keyword to instantiate an object or the method without calling the class object. The static keyword is used to instantiate the methods in the class without calling the objects.
 * We can directly call a static method by calling the class method
 * by giving the class name
 * we cannot use a non static variable in a static block, you can call the class name and call the variable or the method i.e is static
 */

class Abc
{	int num1;
	static int num2;
	public static void show()
	{
		System.out.println("Hello There");
	}
	public static void increment()
	{
		num1++;
	}
	public void incr()
	{
		num2++;
	}
}

class StaticDemo
{
	public static void main(String args[])
	{
		Abc.show();
		Abc.num2=26;
		Abc obj1=new Abc();
		Abc obj2=new Abc();
		Abc obj3=new Abc();
		Abc.increment();
		Abc.incr();
		System.out.println(obj.num1);
		System.out.println(Abc.num2);
		System.out.println(obj2.num1);
		System.out.println(obj3.num1);

	}

}
