package fr2922.se201.jchess.board;

import fr2922.se201.jchess.piece.Piece;

import java.util.function.Consumer;

public class Square {

    private Piece piece;
    private boolean isOccupied;

    public Square(){
        piece = null;
        isOccupied = false;
    }

    public Square(Piece piece) {
        this.piece = piece;
        isOccupied = true;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void ifOccupied(Consumer<Piece> pieceConsumer){
        if(isOccupied)
            pieceConsumer.accept(piece);
    }

    public String getPieceNotation(){
        return isOccupied ? piece.isWhite() ? piece.type.letter : piece.type.letter.toUpperCase() : "-";
    }

    @Override
    public String toString() {
        return "Square{" +
                "piece=" + piece +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
