import java.util.*;
class Bicycle
{
	int gear,speed;
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	void speedUp(int increment)
	{
		speed+=increment;
	}
	void display()
	{
		System.out.println("Gears="+gear+"Speed="+speed);
	}
}

class MountainBike extends Bicycle
{
	int seatHeight;
	public MountainBike(int gear,int speed,int stHeight)
	{
		super(gear,speed);
		seatHeight=stHeight;
	}
	void changeHeight(int newHeight)
	{
		seatHeight=newHeight;
	}
	void displayMB()
	{
		System.out.println("Gears="+gear+"Speed="+speed+"Seat Height="+seatHeight);
	}

}
class Test
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int g,s;
		System.out.println("Enter the Gear and Speed");
		g=sc.nextInt();
		s=sc.nextInt();
		Bicycle bk=new Bicycle(g,s);
		bk.display();
		System.out.println("Enter the decreased Speed");
		int ab=sc.nextInt();
		bk.applyBrake(ab);
		System.out.println("Enter the speed increased");
		int su=sc.nextInt();
		bk.speedUp(su);
		bk.display();
		System.out.println("Enter the seat height");
		int sh=sc.nextInt();
		MountainBike mb=new MountainBike(g,s,sh);
		mb.displayMB();
		System.out.println("Enter the new seat height");
		int ch=sc.nextInt();
		mb.changeHeight(ch);
		mb.displayMB();
		sc.close();
	}


}
