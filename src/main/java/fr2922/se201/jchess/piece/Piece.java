package fr2922.se201.jchess.piece;

public class Piece {

    public final Type type;
    public final Color color;

    public Piece(Type type, Color color) {
        this.type = type;
        this.color = color;
    }

    public final boolean isWhite(){
        return color.isWhite();
    }



}
