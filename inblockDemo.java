class Init {
	Init(){
		System.out.println("no-arg constructor");
	}
	Init(int i){
		System.out.println("1-arg constructor");
	}
	static {
		System.out.println("1-st static");
	}
	{System.out.println("1-st instance");}
	{System.out.println("2-nd instance");}
	static {
		System.out.println("2-nd static");
	}

}
class test {
	public static void main(String [] args) {
		new Init();
		new Init(4);
	}
}
