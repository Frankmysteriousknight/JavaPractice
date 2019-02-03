class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class Horse extends Animal {
	public void eat() {
		System.out.println("Horse is eating");
	}

}
class User {
	public static void doStuff(Animal a) {
		System.out.println("Animal version");
	}
	public static void doStuff(Horse h) {
		System.out.println("Horse version");
	}
	public static void main(String [] args) {
		//Animal a = new Animal();
		//Horse h = new Horse();
		//doStuff(a);
		//doStuff(h);
		//main("Hello");
		//Animal ah = new Horse();
		//Horse ha = new Animal(); Animal cannot be converted to Horse,incompatible types
		//User.doStuff(ah);
		//User.doStuff(ha);
		System.out.println("This is the User's main method");
	}
	public static void main(String argv) {
		System.out.println("OverLoaded main");
	}

}
class overduo extends User {
	public static void main(String [] args) {
		System.out.println("This is the over ridden main method");
	}

}
class test {
	public static void main(String[] args) {
		User u = new User();
		overduo o = new overduo();
		u.main(new String[1]);
		o.main(new String[1]);
		User uo = new overduo();
	}
}
