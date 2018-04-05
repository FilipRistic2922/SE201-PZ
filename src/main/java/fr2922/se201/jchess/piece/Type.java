package fr2922.se201.jchess.piece;

public enum Type {
    PAWN(100),
    ROOK(500),
    KNIGHT(220),
    BISHOP(225),
    QUEEN(910),
    KING(30000);

    Type(int value){
        this.value = value;
    }

    public final int value;



}
