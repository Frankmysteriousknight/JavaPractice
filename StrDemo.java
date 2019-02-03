class test {
	public static void main(String [] args) {
		String s = new String();
		s = "abcdef";
		String s1 = new String("jkhilg");
		String s2 = "xyzqwe";
		System.out.println(s+" "+s1+" "+s2);
		String s3 = s;
		System.out.println(s3);
		s = s.concat("  more stuff");
		System.out.println(s);
		System.out.println(s3);
		String x = "Java";
		//x.concat("Rules!!");
		x += "Rules!!";
		System.out.println("x ="+x);
		String y = "big surprise";
		System.out.println(y.toString());
		//int y1 = 1235436;
		//System.out.println(y1.toString()); The int cannot be dereferenced
		StringBuilder sb = new StringBuilder();
		sb.append("askbfkabkfjahfhadklfghakhghalhgal");
		System.out.println(sb);
		String s4 = new String();
		s4.concat("hello");
		System.out.println(s4);//Nothing will be printed here
		
	}

}
