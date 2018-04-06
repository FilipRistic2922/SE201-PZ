package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.piece.Piece;

public class StandardMove extends Move{


    protected StandardMove(int from, int to, Piece movingPiece) {
        super(from, to, movingPiece, MoveType.STANDARD);

    }

    @Override
    public MoveResult execute(IBoard board) {

        return null;
    }
}
