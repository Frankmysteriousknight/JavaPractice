import java.awt.Dimension;
class StringTest {
	public static void main(String[] args) {
		String x = "Java";
		String y = x;
		System.out.println("y String = "+y);
		System.out.println("X string = "+x);
		y = y + "Bean";
		System.out.println("Y String = "+y );
		System.out.println("X String = "+x );
		Dimension a1 = new Dimension(5,10);
		Dimension b1 = a1;
		b1.height = 30;
		System.out.println("Value of a"+a1.height);
	}
}
