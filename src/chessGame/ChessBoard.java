//Always loved a good game of chess(:
//Random winter break project 12/29/2019

package chessGame;

public class ChessBoard {

	public static void main(String[] args) {
		
		generateBoard(newGame());
	}

	
	public static void generateBoard(Square[][] board) {
 		StdDraw.clear();
		StdDraw.enableDoubleBuffering();
		
		//cycle through every cell on board, calculate 
		//its position on the screen and get the cell's picture
		for (int column = 0; column < 8; column++) {
			for (int row = 0; row < 8; row++) {
				//calculates the *center* of each photo(piece) will go
				double xCoord = ((double) column * (1.0/8)) + (0.5/8);
				double yCoord = ((double) row * (1.0/8)) + (0.5/8);
				//draw the picture of whatever obj in cell
				StdDraw.picture(xCoord, yCoord, board[row][column].setPicture(), .125, .125);
			}
		}
		StdDraw.show();
	}// END generateBoard()
	
	
	
	public static Square[][] newGame(){
		
		Square[][] newGameBoard = new Square[8][8];
		
		//init all squares
		for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 8; column++) {
				//if its a white space
				if(isWhiteSpace(row, column)) {	
					newGameBoard[row][column] = new Square(row, column, true);
							}else{//is black space
					newGameBoard[row][column] = new Square(row, column, false);
				}
			}
		}
		
		//init pieces, Kings, Queens, Rooks, Knights, Bishops, Pawns
		//white
		newGameBoard[0][4] = new Square(0, 4, isWhiteSpace(0, 4), new King(true));
		newGameBoard[0][3] = new Square(0, 3, isWhiteSpace(0, 3), new Queen(true));
		newGameBoard[0][0] = new Square(0, 0, isWhiteSpace(0, 0), new Rook(true));
		newGameBoard[0][7] = new Square(0, 7, isWhiteSpace(0, 7), new Rook(true));
		newGameBoard[0][1] = new Square(0, 1, isWhiteSpace(0, 1), new Knight(true));
		newGameBoard[0][6] = new Square(0, 6, isWhiteSpace(0, 6), new Knight(true));
		newGameBoard[0][2] = new Square(0, 2, isWhiteSpace(0, 2), new Bishop(true));
		newGameBoard[0][5] = new Square(0, 5, isWhiteSpace(0, 5), new Bishop(true));
		//black
		newGameBoard[7][4] = new Square(7, 4, isWhiteSpace(7, 4), new King(false));
		newGameBoard[7][3] = new Square(7, 3, isWhiteSpace(7, 3), new Queen(false));
		newGameBoard[7][0] = new Square(7, 0, isWhiteSpace(7, 0), new Rook(false));
		newGameBoard[7][7] = new Square(7, 7, isWhiteSpace(7, 7), new Rook(false));
		newGameBoard[7][1] = new Square(7, 1, isWhiteSpace(7, 1), new Knight(false));
		newGameBoard[7][6] = new Square(7, 6, isWhiteSpace(7, 6), new Knight(false));
		newGameBoard[7][2] = new Square(7, 2, isWhiteSpace(7, 2), new Bishop(false));
		newGameBoard[7][5] = new Square(7, 5, isWhiteSpace(7, 5), new Bishop(false));
		//pawns
		for (int column=0; column<8; column++) {
			newGameBoard[6][column] = new Square(6, column, isWhiteSpace(6, column), new Pawn(false)); //black 
			newGameBoard[1][column] = new Square(1, column, isWhiteSpace(1, column), new Pawn(true)); //white
		}
		
		return newGameBoard;
		
	}//end newGame()

	
	

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

	
	

	
	