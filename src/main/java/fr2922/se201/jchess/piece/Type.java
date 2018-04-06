package fr2922.se201.jchess.piece;

public enum Type {
    PAWN(100, "p"),
    ROOK(500,"r"),
    KNIGHT(220, "n"),
    BISHOP(225, "b"),
    QUEEN(910, "q"),
    KING(30000, "k");

    Type(final int value, final String letter){

        this.value = value;
        this.letter = letter;
    }

    public final int value;
    public final String letter;


}
