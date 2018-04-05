package fr2922.se201.jchess.events;

import fr2922.se201.jchess.piece.Piece;

public class PieceEatenEvent implements GameEvent {

    private Piece eatenPiece;

    public PieceEatenEvent(Piece eatenPiece){
        this.eatenPiece = eatenPiece;
    }

    public Piece getEatenPiece() {
        return eatenPiece;
    }
}
