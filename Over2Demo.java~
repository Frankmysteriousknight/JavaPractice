class Animal {
	public void eat() {
		System.out.println("The Animal Eats");
	}
	private static void drink() {
		System.out.println("The Animal drinks");
	}
	//private void name(){
	//	System.out.println("The Animal has a name");
	//}
}
class Horse extends Animal {
	public String name;
	public void eat() {//if done private or protected Trying to assign a weaker entity privilegde
		super.eat();
		System.out.println("The Horse Eats Hay");
	}
	public void drink() {
		//super.drink(); private access
		System.out.println("The Horse Drinks Water");
	}
	
}
class test {
	public static void main(String [] args) {
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();
		//b.drink(); Type Animal i.e. supertype reference and subtype instance
		//a.drink();
		Horse h = new Horse();
		h.eat();
		h.drink();
		//h.name();
		//b.drink();
		//b.name="Badal";
		h.name="Badal Again";
		//System.out.println("The Name of the Horse is"+b.name);
		System.out.println("The Name of the Horse is"+h.name);
	}
}
