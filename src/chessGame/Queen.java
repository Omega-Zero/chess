package chessGame;

public class Queen extends ChessPiece {

	public Queen(boolean color) {
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
						return "wqueenWsq.jpeg";
					}else{//black piece
						return "bqueenWsq.jpeg";
					}
				}else{//square is black
					//if white piece
					if (whitePiece) {
						return "wqueenBsq.jpeg";
					}else{//black piece
						return "bqueenBsq.jpeg";
					}
					
				}
	}
	
}