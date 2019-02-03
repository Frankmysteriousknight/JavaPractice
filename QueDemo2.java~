import java.util.*;
class Rectangle
{
	int lx,ly,rx,ry;
	public Rectangle(int x1,int y1,int x2,int y2)
	{
		this.lx=x1;
		this.ly=y1;
		this.rx=x2;
		this.ry=y2;
	}
	public Rectangle(Rectangle r1)
	{
		this.lx=r1.lx;
		this.ly=r1.ly;
		this.rx=r1.rx;
		this.ry=r1.ry;
	}
	
}
class BigRectangle
{
	int lx,ly,rx,ry;
	public void findBigRtl(Rectangle r1,Rectangle r2)
	{	
		if(r1.lx<=r2.lx && r1.ly<=r2.ly)
		{
			this.lx=r1.lx;
			this.ly=r1.ly;
		}	
		else
		{
			this.lx=r2.lx;
			this.ly=r2.ly;
		}
		if(r1.rx<=r2.rx && r1.ry<=r2.ry)
		{
			this.rx=r2.rx;
			this.ry=r2.ry;
		}
		else
		{
			this.rx=r1.rx;
			this.ry=r1.ry;
		}
	
	}
	public void show()
	{
		System.out.println("Top Left= "+lx+","+ly);
		System.out.println("Bottom Right= "+rx+","+ry);
	}

}
class Test
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Top left Coordiantes for Rectangle1");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter the Bottom Right Coordinates for Rectangle1");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		Rectangle r=new Rectangle(x1,y1,x2,y2);
		System.out.println("Enter the Top Left Coordinates for Rectangle2 ");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		System.out.println("Enter the Bottom Right Coordinates for Rectangle2");
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		Rectangle r1=new Rectangle(x3,y3,x4,y4);
		BigRectangle br=new BigRectangle();
		br.findBigRtl(r,r1);
		br.show();
	}
}
