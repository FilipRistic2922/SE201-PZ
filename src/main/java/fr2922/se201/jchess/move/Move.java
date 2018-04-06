package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.events.MoveExecutedEvent;
import fr2922.se201.jchess.events.utils.EventBus;
import fr2922.se201.jchess.piece.Piece;

public abstract class Move {

    /**
     * Position from which piece is moved
     */
    public final int from;

    /**
     * Position to which piece is moved
     */
    public final int to;

    /**
     * Move type
     */
    public final MoveType type;

    protected Move(int from, int to, Piece movingPiece, MoveType type) {
        this.from = from;
        this.to = to;
        this.type = type;
    }

    /**
     * Executes move on provided board, if move leaves king in check same it will return same board,
     * otherwise new board is created
     *
     * @return board after move is executed
     */
    public abstract MoveResult execute(IBoard board);

    @Override
    public String toString() {
        return "Move{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    public enum ResultType{
        KING_LEFT_CHECKED,
        STALEMATE,
        CHECKMATE,
        CHECK,
        REGULAR
    }



}
