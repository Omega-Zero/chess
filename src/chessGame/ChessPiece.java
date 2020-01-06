package chessGame;

public abstract class ChessPiece {

	//Instance Variables
	private boolean alive = true;
	private boolean white = true;
	private String name = "" ;
	
	
	//Constructor Declaration of Class
	public ChessPiece (boolean color) {
		
		this.setWhite(color);	
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isAlive() {
		return this.alive == true;
	}
	
	//setMethods()
	public void setDead(boolean setDead) {
		this.alive = false;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setWhite(boolean white) {
		this.white = true;
	}
	
	
	public abstract boolean canMove(Object[][] arrayBoard, Square startSquare, Square endSquare);
	
		
	public abstract void setPicture(boolean white, int row, int column);
	

	public static void main(String[] args) {

	}
}
