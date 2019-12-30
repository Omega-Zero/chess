//Always loved a good game of chess(:
//Random winter break project 12/29/2019

package chessGame;

public class ChessBoard {

	public static void main(String[] args) {

		boolean initialArray[][] = new boolean[8][8];
		
		generateBoard(initialArray, 8, 8);
		

	
	}

	
	public static void generateBoard(boolean[][] array, int COLUMNS, int ROWS) {

		StdDraw.clear();
		StdDraw.enableDoubleBuffering();

		//cycle through every cell on board
		for (int column = 0; column < COLUMNS; column++) {
			for (int row = 0; row < ROWS; row++) {
				
				//assigns true to array if row and column are both even or both odd 
				if((isOdd(column) && isOdd(row))   ||    (!isOdd(column) && !isOdd(row))) {
					array[column][row] = true;	
				}
				
				
				//Draws black and white squares based off array values
				double xCoord = ((double) column * (1.0/COLUMNS)) + (0.5/COLUMNS);
				double yCoord = ((double) row * (1.0/ROWS)) + (0.5/ROWS);
				if (array[column][row] == true) {
					StdDraw.filledSquare(xCoord, yCoord, 0.5/ROWS);
				} else {
					StdDraw.square(xCoord, yCoord, 0.5/ROWS);
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
	
	
	
	
	
	public void generatePieces(String [][] board) {
		
		
		
	}//End generatePieces


}//end ChessBoard

	
	

	
	