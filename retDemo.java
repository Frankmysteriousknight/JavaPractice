class alpha {
	char doStuff(char c) {
		return c;
	}
	int [] go() {
		return new int[] {1,2,4,5};
	}	
}
class beta extends alpha {
	char doStuff(char c) {
		return c;
	}
	int foo() {
		char c ='c';
		return c;
	}
}

class meta {
	public static void main(String args[]) {
		beta b = new beta();
		System.out.println(b.doStuff('b'));
		alpha a = new alpha();
		System.out.println(a.doStuff('a'));
		System.out.println(b.foo());
		System.out.println(a.go());
	
	}

}
