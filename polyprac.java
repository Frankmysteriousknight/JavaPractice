class GameShape{
	void displayShape(){
		System.out.println("displaying shape");
	}
}
class PlayerPiece extends GameShape{
	void movePiece(){
		System.out.println("player's piece");
	}
}
class TilePiece extends GameShape{
	void tilePiece(){
		System.out.println("piece of a tile");
	}
}
class test{
	public static void main(String [] args){
		PlayerPiece pp=new PlayerPiece();
		TilePiece tp=new TilePiece();
		display(tp);
		display(pp);
	}
	public static void display(GameShape shape){
		//public static void display(TilePiece shape(){
		//shape.tilePiece();
		shape.displayShape();
		
	}

}
