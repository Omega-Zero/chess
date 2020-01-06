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
				
				//assigns square object to each square and assigns it white/black
				if(isWhiteSpace(row, column)) {
					boardArray[row][column] = new Square(row, column, true, null);
				}else{
					boardArray[row][column] = new Square(row, column, false, null);
				}
				
				
				
				//Draws black, white squares and pieces based off obj array values
				double xCoord = ((double) column * (1.0/8)) + (0.5/8);
				double yCoord = ((double) row * (1.0/8)) + (0.5/8);
				//if no piece
				if (boardArray[row][column].getPiece() == null) {
					//if white
					if (boardArray[row][column].getSquareColor()) {
						StdDraw.square(xCoord, yCoord, 0.5/8);
					}else{
						StdDraw.filledSquare(xCoord, yCoord, 0.5/8);
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
	}
	
	
	

}//end ChessBoard

	
	

	
	