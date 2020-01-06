package chessGame;

public class Pawn extends ChessPiece {


	
	public Pawn(boolean color) {
		super(color);
	}
	


	@Override
	public boolean canMove(Object[][] arrayBoard, Square startSquare, Square startEnd) {
		return false;
	}
	
	public void setPicture(boolean white, int row, int column) {
		
		
		
		//If endSquare is white, pic1, else pic 2
		if (white == true){
		
			StdDraw.picture(column, row, "pawn.jpg");
			
		}else {
			
			StdDraw.picture(column, row, "pawn.jpg");
			
		}
		
	}
	
	
}//End Pawn Object
