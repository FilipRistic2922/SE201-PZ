package fr2922.se201.jchess.ai;

import fr2922.se201.jchess.move.Move;

import java.util.Optional;

public interface AiStrategy {

    Optional<Move> findBestMove();
}
