/*interface Bounceable{
	int b1=1;
	 void setBounceFactor(int bf);
 	 void bounce();
}*/
/*interface cycle {
	int b=23;
	void speed(int sp);
}*/
class vehicle{
	void setVehicle(){
		System.out.println("This is the vehicle class");
	}
}
interface cycle extends vehicle{ 
	int b1=3;
	default void speed(){
		System.out.println("This is the default speed");
	}
	static void mycycle(){
		super.setvehicle();
		System.out.println("This is my interface's cycle");
	}
	int b4=123;
	interface Bounceable
	{	 int b4=12;
		 void setBounceFactor(int bc);
		 void bounce();	
	}
}
class Tire implements cycle{
 	public void setBounceFactor(int bb){
		System.out.println("Bounce Factor is set to "+bb+" "+b4);
	}
 	public void bounce(){
		speed();	
		System.out.println("Tire Did a Bounce of"+b1);
	
	}
	/*
	public void speed()
	{
		System.out.println("The Speed of Cycle is"+b1*b4);
	}*/

}
abstract class Motor{
	int i=10;
	abstract void display();
	void speed()
	{
		System.out.println("The Speed of the Motor is"+i);
	}
}
class car extends Motor{
	void display()
	{
		System.out.println("This is a motor function");
	}

}

class demo {
	public static void main(String args[])
	{
		Tire tr=new Tire();
		tr.setBounceFactor(12);
		tr.bounce();
		tr.speed();
		cycle.mycycle();
		car cr=new car();
		cr.display();
	//	Motor mt=new Motor();
	//	mt.speed();
	/*	void display(){
		System.out.println("This is the another motor function");
		}
	*/
	}

}

