class Square {
	double area;
	void area(double b)
	{
		area=b*b;
		System.out.println("Area of square is = "+area);
	}

}
class Cube extends Square {
	double area;
	void area(double b)
	{
		area=b*b*b;
		System.out.println("Area of Cube is = "+area);
	}

}

class demo {
	public static void main(String [] args)
	{
		Square sq = new Square();
		sq.area(7);
		Cube cb = new Cube();
		cb.area(8);
	
	}

}
