package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.piece.Piece;

public class PawnPromotion extends Move{

    public final Piece promotedTo;

    protected PawnPromotion(int from, int to, Piece movingPiece, Piece promotedTo) {
        super(from, to, movingPiece, MoveType.PAWN_PROMOTION);
        this.promotedTo = promotedTo;
    }

    @Override
    public MoveResult execute(IBoard board) {
        return null;
    }
}
