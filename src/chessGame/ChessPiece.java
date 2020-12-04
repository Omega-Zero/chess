package chessGame;

public abstract class ChessPiece {

	//Instance Variables
	private boolean alive = true;
	private boolean white = true;
	ChessPiece objpiece;
	
	
	//Constructor 
	public ChessPiece (boolean white) {
		this.setWhite(white);
	}
	
	
	private void setWhite(boolean white) {
		this.white=white;
	}


	public boolean isAlive() {
		return this.alive;
	}
	
	//setMethods()
	public void setDead(boolean setDead) {
		alive = false;
	}
	
	
	public boolean isWhitePiece() {
		return this.white == true;
	}
	

	public abstract boolean canMove(Object[][] arrayBoard, Square startSquare, Square endSquare);
	
		
	public abstract String getPicture(boolean whiteSquare, boolean whitePiece);
	

	public static void main(String[] args) {

	}
}
