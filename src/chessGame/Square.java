package chessGame;

public class Square { 
    private ChessPiece piece; 
    private int row; 
    private int column; 
    private boolean squareColor;
    private boolean hasPiece = false;
    
    //--two constructors- 1 for alive and one for dead
    //square has piece
    public Square(int row, int column, boolean white, ChessPiece piece) { 
    	hasPiece = true;
    	this.setPiece(piece); 
        this.setColumn(column); 
        this.setRow(row); 
        this.setSquareColor(white);      
    } 
    //square has no piece
    public Square(int row, int column, boolean white) { 
    	this.setColumn(column); 
        this.setRow(row); 
        this.setSquareColor(white);
    } 
  
    public void setSquareColor(boolean white) {
    	this.squareColor = white;
    }
    
    public boolean getSquareColor() {
    	return this.squareColor;
    }
    
    public ChessPiece getPiece() { 
        return this.piece; 
    } 
  
    public void setPiece(ChessPiece p) { 
        this.piece = p; 
    } 
  
    public int getColumn() { 
        return this.column; 
    } 
  
    public void setColumn(int column) { 
        this.column = column; 
    } 
  
    public int getRow() { 
        return this.row; 
    } 
  
    public void setRow(int row) { 
        this.row = row; 
    } 
    
    public boolean hasPiece() {
    	return  hasPiece;
    }
    
    public void setColor(boolean white) {
    		if(white) {
    			squareColor = true;
    		}
    }
    
    public String setPicture() {
 
    	if(hasPiece) {
    		return this.piece.getPicture(this.squareColor, this.piece.isWhitePiece());
    	}else {
    		
    		if (this.squareColor){
    			return "wSquare.jpeg";
    		}else {
    			return "bSquare.jpeg";
    		}
    	}
    }//end setPicture
    
    
    
} //End Square Obj
