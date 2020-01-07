package chessGame;

public class Square { 
    private ChessPiece piece; 
    private int row; 
    private int column; 
    private boolean squareColor;
    
    public Square(int row, int column, boolean white, ChessPiece piece) { 
        this.setPiece(piece); 
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
    
    
    
} //End Square Obj
