package chessGame;

public class Rook extends ChessPiece{

	
	public Rook(boolean color) {
		super(color);
		
	}

	
	@Override
	public boolean canMove(Object[][] arrayBoard, Square startSquare, Square endSquare) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPicture(boolean whiteSquare, boolean whitePiece) {

		//if square piece is on is white
		if (whiteSquare){
			//if white piece
			if (whitePiece) {
				return "wrookWsq.jpeg";
			}else{//black piece
				return "brookWsq.jpeg";
			}
		}else{// square is black
			//if white piece
			if (whitePiece) {
				return "wrookBsq.jpeg";
			}else{//black piece
				return "brookBsq.jpeg";
			}
			
		}
	}
	




}
