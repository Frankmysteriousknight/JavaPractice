class Animal{
	public void name(){
		System.out.println("This is naming block");
	}
}
class Horse extends Animal{
	private Halter myHalter=new Halter();
	public void tie(LeadRope rope){
		myHalter.tie(rope);
	}

}
class Halter{
	public void tie(LeadRope aRope){
		System.out.println("Do the actual tie work");
	}

}
class LeadRope{
	void tie(int l){
	System.out.println("This is illegal to do"+l);
	}
}
class test{
	public static void main(String [] args)
	{
		Horse h=new Horse();
		h.tie(LeadRope l);
	}
}
