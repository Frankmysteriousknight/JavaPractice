class Box{
	private int size;
	private String color;
	void setSize(int s){
		this.size=s;
	}
	void setColor(String cl){
		this.color=cl;
	}
	int getSize(){
		return size;
	}
	String getColor(){
		return color;
	}
}

class demo{
	public static void main(String[] args) {
		Box b=new Box();
		b.setSize(12);
		b.setColor("Green");
		System.out.println("The Size of the Box is"+b.getSize());
		System.out.println("The Color of the Box is"+b.getColor());
	
	}

}
