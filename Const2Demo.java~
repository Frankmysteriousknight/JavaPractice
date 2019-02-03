class Animal {
	 int num;
	 String name;
	private	Animal() {
		this(setValue(),setName());	
	}
	Animal (int n,String nm){
		this.num=n;
		this.name=nm;
	}
       static int setValue() {
		return 13;
	}
       static String setName() {
       		return "Purana";
       }
	void getValue() {
		System.out.println("Animal's Name="+name+"Number="+num);
	}
}
class Horse extends Animal{
	int num;
	String name;
	Horse(int n,String nm) {
		super(n,nm);
		this.num=12;
		this.name="Badal";
		//super.setValue(n,nm);
	}
	void getValue() {
		System.out.println("Name="+name+"Number="+num);
		super.getValue();
	}
}
class test {
	public static void main(String [] args) {
		Horse h = new Horse(14,"Naya Badal");
		h.getValue();
		//Animal a = (Animal) h;
		//a.getValue();
		//Animal a = new Animal();
		//a.getValue();
		
	
	}

}
