package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.piece.Piece;

public class EnPassant extends Move{

    private Piece eatenPawn;

    protected EnPassant(int from, int to, Piece movingPiece) {
        super(from, to, movingPiece, MoveType.EN_PASSANT);
    }

    @Override
    public MoveResult execute(IBoard board) {
        return null;
    }
}
