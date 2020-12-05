package chessGame;

//the 1%
public class King extends ChessPiece{

	boolean hasMoved = false;
	
	public King(boolean color) {
		super(color);
		
	}
	
	
	@Override
	public String getPicture(boolean whiteSquare, boolean whitePiece) {
		
		//if square piece is on is white
		if (whiteSquare){
		//if white piece
			if (whitePiece) {
				return "wkingWsq.jpeg";
			}else{//black piece
				return "bkingWsq.jpeg";
			}		
		}else{//square is black
		//if white piece
			if (whitePiece) {
				return "wkingBsq.jpeg";
			}else{//black piece
				return "bkingBsq.jpeg";
			}
		
		}
	}


	@Override
	public boolean canMove(Object[][] arrayBoard, Square startSquare, Square endSquare) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
