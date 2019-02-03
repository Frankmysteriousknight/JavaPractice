interface I1 {
	default int getVal() {
		return 1;
	}
}
interface I2 {
	default int getVal() {
		return 2;
	}
}
class MultiInt implements I1,I2 {
	public static void main(String [] args) {
		new MultiInt().go();
	}
	public void go() {
		System.out.println(getVal());
	}
	public int getVal() {
		return 3;
	}
}
