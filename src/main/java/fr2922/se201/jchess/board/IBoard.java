package fr2922.se201.jchess.board;

import fr2922.se201.jchess.piece.Color;

import java.util.function.Consumer;

public interface IBoard {

    Square getSquare(int xy) throws IndexOutOfBoundsException;

    Square getSquare(int x, int y) throws IndexOutOfBoundsException;

    void withSquare(int xy, Consumer<Square> squareConsumer) throws IndexOutOfBoundsException;

    void forEachSquare(Consumer<Square> squareConsumer);

    Color getActiveColor();

    boolean isEnPassantPossible();

    int getEnPassantPawnPosition();

    int getHalfMoveClockCount();

    int getFullMoveCount();

    CastlingRights getCastlingRights();

}
