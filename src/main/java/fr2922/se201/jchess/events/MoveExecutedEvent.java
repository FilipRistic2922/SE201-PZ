package fr2922.se201.jchess.events;

import fr2922.se201.jchess.move.Move;

public class MoveExecutedEvent implements GameEvent{

    private int moveNumber;
    private Move move;

    public MoveExecutedEvent(int moveNumber, Move move) {
        this.moveNumber = moveNumber;
        this.move = move;
    }

    public int getMoveNumber() {
        return moveNumber;
    }

    public Move getMove() {
        return move;
    }
}
