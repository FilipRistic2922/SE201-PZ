package fr2922.se201.jchess.ai.evaluators;

import fr2922.se201.jchess.board.IBoard;

public interface Evaluator {

    int evaluate(IBoard board, int currentDepth);


}
