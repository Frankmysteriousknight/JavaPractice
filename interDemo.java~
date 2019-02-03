interface Bounceable extends Moveable,Spherical{
	public void bounce();
	public void setBounceFactor(int bf);

}
interface Moveable {
	public void moveIt();

}
interface Spherical {
	public void sphereIt();

}

class Ball implements Bounceable {
	public void bounce() {
		System.out.println("Ball did a Bounce");
	}
	public void setBounceFactor(int bf) {
		System.out.println("The Bounce Factor is"+bf);
	}

	public void moveIt() {
		System.out.println("I like to Move It,Move It, You like to Move it Move It, I LIKE TO, 'MOVE IT!!!!'");
	}
	public void sphereIt() {
		System.out.println("Sphered it UP");
	}


}
class beachBall extends Ball {
	public void moveIt() {
		System.out.println("Beach Ball like to Move It,Move It, You like to Move it Move It, I LIKE TO, 'MOVE IT!!!!'");
	}
	public void sphereIt() {
		System.out.println("Beach Ball is Sphered it UP");
	}
	public void blast() {
		System.out.println("Beach Ball Got a Smash Hit");
	}
}
class demo {
	public static void main(String [] args) {
		beachBall bb = new beachBall();
		bb.bounce();
		bb.setBounceFactor(24);
		bb.moveIt();
		bb.sphereIt();
		Ball b = new beachBall();
		beachBall bn = (beachBall) b;
		bn.bounce();
		bn.moveIt();
		bn.sphereIt();
		bn.setBounceFactor(16);
		b.bounce();
		b.moveIt();
		Ball c = new beachBall();
		c.moveIt();
		//c.blast(); Cannot find the symbol
		beachBall bd = new beachBall();
		Ball bt = bd;
		bt.moveIt();
		bt.sphereIt();
		bd.moveIt();
	}

}
