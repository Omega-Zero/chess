package chessGame;

public class Pawn extends ChessPiece {


	
	public Pawn(boolean color) {
		super(color);
	}
	


	@Override
	public boolean canMove(Object[][] arrayBoard, Square startSquare, Square startEnd) {
		return false;
	}
	
	public void setPicture(boolean whiteSquare, boolean whitePiece, double xCoord, double yCoord) {
		
		
		
		//If endSquare is white, pic1, else pic 2
		if (whiteSquare == true){
		
			StdDraw.picture(xCoord, yCoord, "pawn.jpg", 0.125, 0.125);
			
		}else {
			
			StdDraw.picture(xCoord, yCoord, "pawn.jpg", 0.125, 0.125);
			
		}
		
	}
	
	
}//End Pawn Object
