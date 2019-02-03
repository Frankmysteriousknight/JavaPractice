class Zoo{
	private static String coolMethod()
	{	System.out.println("This is Wow,Cool");
		return "Wow,Cool";
	}
	void display()
	{
		coolMethod();
	}
}
class Moo extends Zoo{
	public void aMoo(){
		//Zoo z=new Zoo();
		System.out.println("A Zoo says");
	}

}

class test{
	public static void main(String args[])
	{
		Moo m=new Moo();
		m.aMoo();
		/*Zoo z=new Zoo();
		System.out.println("This is a Zoo which says"+z.coolMethod());
		*/
		Zoo z=new Zoo();
		z.display();
	}

}

