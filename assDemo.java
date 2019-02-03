class HexTest {
	public static void main(String [] args) {
		int x=0x00002;
		int y=0xDeafCafe;
		long z=01234567123456712345671l;
		System.out.println(x+" "+y);
		System.out.println(z);
		HexTest ht = new HexTest();
		System.out.println(ht);
		byte a = 6;
		byte c = 1;
		byte b = (byte) (a + c);
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		long l = 128L;
		byte az = (byte)l;
		System.out.println("the Byte is"+az);
		double af = 900.345;
		short sh = (short) af;
		System.out.println(sh);	
		float ff = (float)1.01;
		System.out.println(ff);
	}

}
