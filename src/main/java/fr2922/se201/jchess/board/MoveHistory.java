package fr2922.se201.jchess.board;

import fr2922.se201.jchess.move.MoveResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MoveHistory {

    private final List<MoveResult> pastMoves;

    public MoveHistory() {
        this.pastMoves = new ArrayList<>(40);
    }

    public void pushMoveResult(MoveResult moveResult){
        this.pastMoves.add(moveResult);
    }

    public MoveResult getLastMove(){
        if(pastMoves.isEmpty())
            throw new IndexOutOfBoundsException("Move history is empty");
        return this.pastMoves.get(pastMoves.size()-1);
    }

    public void reset(){
        pastMoves.clear();
    }

}
