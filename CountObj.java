class ABC
{	static int i=0;
	public ABC()
	{
		i++;
	}
	public void count()
	{
		System.out.println(i);
	}

}
class Test
{
	public static void main(String args[])
	{
		ABC obj=new ABC();
		obj.count();
		ABC obj2=new ABC();
		obj.count();
		ABC obj3=new ABC();
		obj.count();
		ABC obj4=new ABC();
		obj.count();
	}

}
