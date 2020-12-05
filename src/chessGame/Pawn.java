package chessGame;

public class Pawn extends ChessPiece {

	boolean firstMove = true;
	
	public Pawn(boolean color) {
		super(color);
		
	}
	


	@Override
	public boolean canMove(Object[][] arrayBoard, Square startSquare, Square endSquare) {
			int stSqCol = startSquare.getColumn();
			int enSqCol = endSquare.getColumn();
			
			//check to see if the endsquare is in the same row 
			if(stSqCol == enSqCol) {
				return false;
				
			}	
			return true;
	}
	
<<<<<<< HEAD
	@Override
=======
>>>>>>> branch 'master' of https://github.com/Omega-Zero/chess.git
	public String getPicture(boolean whiteSquare, boolean whitePiece) {
		
<<<<<<< HEAD
		//if square piece is on is white
		if (whiteSquare){
			//if white piece
			if (whitePiece) {
				return "wpawnWsq.jpeg";
			}else{//black piece
				return "bpawnWsq.jpeg";
			}
	
		}else{//square is black
=======
		//if endSquare is white
		if (whiteSquare){
			//if white piece
			if (whitePiece) {
				return "wpawnWsq.jpeg";
			}else{//black piece
				return "bpawnBsq.jpeg";
			}
			
		
		}else{//end square is black
>>>>>>> branch 'master' of https://github.com/Omega-Zero/chess.git
			//if white piece
			if (whitePiece) {
				return "wpawnBsq.jpeg";
			}else{//black piece
				return "bpawnBsq.jpeg";
			}
			
		}
	}
	
	
}//End Pawn Object
