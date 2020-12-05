package chessGame;

public class Knight extends ChessPiece {

	public Knight(boolean color) {
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
						return "wknightWsq.jpeg";
					}else{//black piece
						return "bknightWsq.jpeg";
					}
			
				}else{//square is black
					//if white piece
					if (whitePiece) {
						return "wknightBsq.jpeg";
					}else{//black piece
						return "bknightBsq.jpeg";
					}
					
				}
	}
	
}
