package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.piece.Piece;

import javax.swing.*;

public class Castling extends Move{


    public final boolean isKingSide;

    protected Castling(int from, int to, Piece movingPiece, boolean isKingSide) {
        super(from, to, movingPiece, MoveType.CASTLING);
        this.isKingSide = isKingSide;
    }

    @Override
    public MoveResult execute(IBoard board) {
        return null;
    }
}
