package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.piece.Piece;

public class Capture extends Move{

    public final Piece eatenPiece;

    protected Capture(int from, int to, Piece movingPiece, Piece eatenPiece) {
        super(from, to, movingPiece, MoveType.CAPTURE);
        this.eatenPiece = eatenPiece;
    }

    @Override
    public MoveResult execute(IBoard board) {
        return null;
    }
}
