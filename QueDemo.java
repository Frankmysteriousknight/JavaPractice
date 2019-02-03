import java.util.*;
class Rectangle
{	int length,breadth;
	public Rectangle(int l, int b)
	{
		this.length=l;
		this.breadth=b;
	}
	public void area(int l,int b)
	{
		System.out.println("Area of Rectangle is"+l*b);
	
	}

}

class Cuboid extends Rectangle
{
	int height;
	Cuboid(int l,int b,int h)
	{
		super(l,b);
		height=h;
	}
	public void volume()
	{
		System.out.println("Volume is"+length*breadth*height);
	}


}
class Random
{	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
	int l=sc.nextInt();
	System.out.println("Enter the Breadth");
	int b=sc.nextInt();
	Rectangle r=new Rectangle(l,b);
	System.out.println("Enter the height");
	int h=sc.nextInt();
	r.area(l,b);
	Cuboid c=new Cuboid(l,b,h);
	c.volume();
	}
}
