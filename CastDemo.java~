class Animal {
	public void makeNoise() {
		System.out.println("Animal Makes Noise");
	}
}
class Dog extends Animal {
	public void makeNoise() { 
		System.out.println("Barks");
	}
	public void playDead() {
		System.out.println("Roll Over");
	}
}
class demo {
	public static void main(String [] args) {
		Animal [] a = {new Animal(),new Dog(),new Animal()};
		for(Animal animal : a) {
			animal.makeNoise();
			if(animal instanceof Dog) {
				Dog d = (Dog) animal;
				d.playDead();
			}
		
		}
		//Animal ab = new Animal();ClassCastException Animal cannot be casted to Dog
		//Dog d = (Dog) ab;
		//d.makeNoise();
		Dog d = new Dog();
		Animal ab = (Animal) d;
		Animal ad = d;
		ad.makeNoise();
		//ad.playDead();
		ab.makeNoise();
		//ab.playDead();
	}
}
