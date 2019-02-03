final class Bike{
	int maxSpeed=10;
	void showSpeed(){
		System.out.println("The Highest Speed of the Cycle is 10");
	}
	void showCap(){
		System.out.println("The Capacity is Null as it is Man Powered");
	}

}

abstract class Car{
	static int maxSpeed;
	abstract void showSpeed();
	 abstract void showCap();
	static void display(){
		System.out.println("It is made my Car Company");
	}

}
/*
class BMX extends Bike{
	void showSpeed(){
		System.out.println("The speed is 20");
	}
	void showCap(){
		System.out.println("The Capacity is not Man Powered");
	}
}
*/
class BMW extends Car{
	void showSpeed(){
		System.out.println("The speed is"+maxSpeed);
	}
	void showCap(){
		System.out.println("The Capacity of tank is 25L");
	}

}

class Volks extends BMW{
	void showSpeed()
	{
		System.out.println("The Speed is"+maxSpeed);
	}
	void showCap(){
		System.out.println("The Capacity of tank is 23L");
	}

}

class demo{
	public static void main(String args[])
	{
		BMW b=new BMW();
	        b.maxSpeed=107;
		b.showSpeed();
		b.showCap();
		b.display();
		Volks v=new Volks();
		v.showSpeed();
		v.showCap();
		v.display();
		Bike bx=new Bike();
		bx.showSpeed();
		bx.showCap();

	}

}
