class Rect {
	private int len;
	private int brd;
	public void setLen(int l){
		this.len=l;
	}
	public void setBrd(int b) {
		this.brd=b;
	}
	public int getLen() {
		return brd;
	}
	public int getBrd() {
		return len;
	}
	public void area() {
		System.out.println("Area of Rectangle is");
	}
}
interface Box {
	 final int heg=10;
	 public void setHeg(int h);
	 public int getHeg();
	 public void area();
}
class shape extends Rect implements Box {
	int h;
	public void area() {
		System.out.println("Area throgh the shape");
	}
	public int getHeg(){
		return heg;
	}
	public void setHeg(int h) {
		h=10;
	}
	public void show() {
		System.out.println("This is the area of the shape");
	}

}

class test {
	public static void main(String args[]) {
		shape s=new shape();
		Object o=s;
		Rect r=s;
		Box b=s;
		//o.area();
		r.area();
		b.area();
		s.area();
		Rect r2=new Rect();
		Rect r1=new shape();
		r2.area();
		r1.area();
		s.show();
		//r1.show(); Error as the r1 is of rectangle type not shape	

	
	}

}
