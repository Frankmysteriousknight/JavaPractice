class Bicycle
{
	public int gear,speed;
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	
	}
	public void speedUp(int increment)
	{
		speed+=increment;
	}
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void display()
	{
		System.out.println("The Gears are"+gear+"Speed is"+speed);
	}
}
class MountainBike extends Bicycle
{
	public int seatHeight;
	public MountainBike(int gear,int speed,int stHeight)
	{
		super(gear,speed);
		seatHeight=stHeight;
	}
	public void setHeight(int newHeight)
	{
		seatHeight=newHeight;
	}
	public void displayMB()
	{
		System.out.println("The Gears are"+gear+"Speed is"+speed+"Seat Height is"+seatHeight);
	}


}

class Test
{
	public static void main(String args[])
	{
		MountainBike mb=new MountainBike(2,100,4);
		mb.displayMB();
		mb.speedUp(2);
		mb.setHeight(24);
		mb.displayMB();
		mb.applyBrake(1);
		mb.displayMB();
	}

}
