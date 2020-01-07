//Always loved a good game of chess(:
//Random winter break project 12/29/2019

package chessGame;

public class ChessBoard {

	public static void main(String[] args) {

		generateBoard();
		
	
	}

	
	public static void generateBoard() {

		StdDraw.clear();
		StdDraw.enableDoubleBuffering();

		Square[][] boardArray = new Square[8][8];
		
		
		
		//cycle through every cell on board 
		for (int column = 0; column <= 7; column++) {
			for (int row = 0; row <= 7; row++) {
				
				Square currentSquare = boardArray[row][column];
				
				//assigns square object to each square and assigns it white/black (draw null squares)
				if(isWhiteSpace(row, column)) {
					currentSquare = new Square(row, column, true, new Pawn(true));
				}else{
					currentSquare = new Square(row, column, false, null);
				}
					
				//Draws black, white squares and pieces based off obj array values
				double xCoord = ((double) column * (1.0/8)) + (0.5/8);
				double yCoord = ((double) row * (1.0/8)) + (0.5/8);
				
				//if no piece
				if (currentSquare.getPiece() == null) {
					//if white
					if (currentSquare.getSquareColor()) {
						StdDraw.square(xCoord, yCoord, 0.5/8);
					}else{
						StdDraw.filledSquare(xCoord, yCoord, 0.5/8);
					}
					
				//there's a piece
				}else{
					
					//if whiteSquare
					if(currentSquare.getSquareColor()) {
						//set picture according to piece color and square color
						currentSquare.getPiece().setPicture(true, true, xCoord, yCoord);
					}else {
						
					}
					
				}
		
			}

		}
		StdDraw.show();
	}// END generateBoard()
	
	
	//returns true if number is odd
	public static boolean isOdd(int num) {
		
		if(num % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}//end isOdd()
	
	
	public static boolean isWhiteSpace(int row, int column) {

		boolean result = true;
		
		if((isOdd(column) && isOdd(row))   ||    (!isOdd(column) && !isOdd(row))) {
			result = false;
		}
		return result;
	}//end isWhiteSpace()
	
	
	

}//end ChessBoard

	
	

	
	