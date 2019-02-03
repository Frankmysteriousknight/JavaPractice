/*Static block is executed when it is loaded in the JVM even before the main block is loaded
 *
 * You can call a constructor to initialise the value of the static variable as the constructor only works for the instance variable and here is staic, so we use the static block
 *
 */

class Test1
{	
	static String s="";
	static {
	s="Hello world";
	}
	public static void main(String args[])
	{
		int i=4;
		System.out.println("Hello"+i);
		System.out.println("The value of s:"+s);
	}
	static {
		System.out.println("Hello World2");
	}

}
