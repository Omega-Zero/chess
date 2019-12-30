//Always loved a good game of chess(:
//Random winter break project 12/29/2019

package chessGame;

public class chessBoard {

	public static void main(String[] args) {

		boolean initialArray[][] = new boolean[9][9];
		
		generateBoard(initialArray, 9, 9);
	
	}

	

	
	
	public static void generateBoard(boolean[][] array, int COLUMNS, int ROWS) {

		StdDraw.clear();
		StdDraw.enableDoubleBuffering();

		for (int column = 0; column < COLUMNS; column++) {
			for (int row = 0; row < ROWS; row++) {
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
	
	
}

	
	

	
	