package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;

import java.util.function.Consumer;

public class MoveResult {

    private final IBoard board;
    private final Move move;
    private final Move.ResultType resultType;
    private final boolean isSuccessful;

    public MoveResult( final IBoard board, final Move move, final Move.ResultType resultType){
        this.board = board;
        this.move = move;
        this.resultType = resultType;

        if(resultType == Move.ResultType.KING_LEFT_CHECKED)
            isSuccessful = false;
        else
            isSuccessful = true;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public IBoard getBoard() {
        return board;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "MoveResult{" +
                "move=" + move +
                ", resultType=" + resultType +
                ", isSuccessful=" + isSuccessful +
                '}';
    }
}
