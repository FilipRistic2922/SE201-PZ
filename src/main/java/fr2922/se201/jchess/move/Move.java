package fr2922.se201.jchess.move;

import fr2922.se201.jchess.board.IBoard;

public class Move {
    public final int FROM;
    public final int TO;

    public Move(int FROM, int TO) {
        this.FROM = FROM;
        this.TO = TO;
    }

    /**
     * Executes move on provided board, if move is invalid it will return same board,
     * otherwise new board is created
     *
     * @param board - board on which we are executing move
     * @return board after move is executed
     */
    public IBoard execute(IBoard board){
        return board;
    }
}
