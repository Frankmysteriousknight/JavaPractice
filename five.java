abstract class vehicle{
	private static String type="Four";
	public abstract void goUpHill();
	public static String getType(){
		return type;
	}

}
abstract class car extends vehicle {

	public void goUpHill(){
		System.out.println("This is Vehicle Going Up Hill");
	}
	void doCarThings(){
		System.out.println("This is from the Car method");
	}

}

class bmw extends car{
	public void goUpHill(){
		super.goUpHill();
		System.out.println("This is BMW Going Up Hill");
	}

} 

class test {
	public static void main(String [] args)
	{
		bmw b=new bmw();
		b.goUpHill();
		b.doCarThings();
		System.out.println("The Vehicle Type is"+b.getType());
	}

}
