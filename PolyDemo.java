class Animal {
	public void eat() {
		System.out.println("The Animal Eats");
	}
}
class Horse extends Animal {
	public void eat() {
		System.out.println("The Horse Eats");
	}
	public void eat(String name) {
		System.out.println("The Horse Eats"+name);
	}
}
class test {
	public static void main(String [] args) {
		Animal a = new Animal();
		Horse  h = new Horse();
		a.eat();
		h.eat();
		h.eat("Apples");
		Animal ah = new Horse();
		ah.eat();
		//ah.eat("Hay"); Cannot be applied as the no argument list is present in the animal's eat method
		//Horse ha = new Animal(); Incomaptible types error will be shown
		//ha.eat("Hay");
		
	}

}
