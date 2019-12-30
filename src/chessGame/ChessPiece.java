package chessGame;

public class ChessPiece {

	//Instance Variables
	String name;
	String color;
	String squareColor;
	
	boolean alive;
	int row;
	int column;
	
	//Constructor Declaration of Class
	public ChessPiece(String name, String color, String squareColor,
			int row, int column, boolean alive) {
		
		this.name = name;
		this.color = color;
		this.squareColor = squareColor;
		this.row = row;
		this.column = column;
		this.alive = alive;
		
		
	}
	
	
	//getMethods()
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String SquareColor() {
		return squareColor;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	
	//setMethods()
	public void setRow(int newRow) {
		row = newRow;
	}
	
	public void setColumn(int newColumn) {
		row = newColumn;
	}
	
	public void setState(boolean state) {
		alive = state;
	}
	
	//Specific piece initializers
	public static ChessPiece initPawn(String color, String squareColor, int row, int column) {
		return new ChessPiece("pawn", color, squareColor,
				row, column, true);
	}
	
	public static ChessPiece initKing(String color, String squareColor, int row, int column) {
		return new ChessPiece("king", color, squareColor,
				row, column, true);
	}
	
	public static ChessPiece initQueen(String color, String squareColor, int row, int column) {
		return new ChessPiece("queen", color, squareColor,
				row, column, true);
	}
	
	public static ChessPiece initKnight(String color, String squareColor, int row, int column) {
		return new ChessPiece("knight", color, squareColor,
				row, column, true);
	}
	
	public static ChessPiece initBishop(String color, String squareColor, int row, int column) {
		return new ChessPiece("bishop", color, squareColor,
				row, column, true);
	}
	
	public static ChessPiece initRook(String color, String squareColor, int row, int column) {
		return new ChessPiece("rook", color, squareColor,
				row, column, true);
	}
	
	public static void main(String[] args) {

	}
	
	
	
	
}
