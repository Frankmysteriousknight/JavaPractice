 class Box{
	private static int l;
 	private static int b;
	static void setBox(int len,int brd){
		l=len;
		b=brd;
		System.out.println("It is accessible"+l+b);
	}
	Box(){
		this.l=11;
		this.b=15;
	}
	void area()
	{
		System.out.println("This is an instance method");
	}
//	abstract void boxhe();
        static void display(){
		System.out.println("This is a static Block of Box");
	}

}

class something extends Box{
	int h;

	void show(){
		super.area();
		//System.out.println(l*b);
	}
	//void boxhe(){
	//	System.out.println(super.l*super.b*h);
	//}
	static void like(){
		setBox(12,14);
		System.out.println("This is another static block of something");
		System.out.println("This is an accessible thing");
	}

	
}

class test{
	public static void main(){
	       
		System.out.println("This is a coding block");
			
		something b=new something();
		//b.l=16;
		//b.b=19;
		//b.h=12;
		b.like();
		b.area();
		b.display();
		//b.boxhe();
		b.show();
		super.Box();
		
	}
	public static void main(String[] args)
	{
		something s=new Box();
		//s.l=12;
		//s.b=10;
		s.show();
		s.area();
		s.h=10;
		//s.boxhe();
		s.display();
		s.like();
		main();		

		
	}

}
