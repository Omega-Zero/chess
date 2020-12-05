package chessGame;

public class Bishop extends ChessPiece {

	public Bishop(boolean color) {
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
						return "wbishopWsq.jpeg";
					}else{//black piece
						return "bbishopWsq.jpeg";
					}
			
				}else{//square is black
					//if white piece
					if (whitePiece) {
						return "wbishopBsq.jpeg";
					}else{//black piece
						return "bbishopBsq.jpeg";
					}
					
				}
	}
	
}
