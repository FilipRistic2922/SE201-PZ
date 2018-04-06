package fr2922.se201.jchess.board;

import fr2922.se201.jchess.piece.Piece;

import java.awt.*;

public class Board {

    private int halfMoveClockCounter;
    private int fullMoveCounter;
    private CastlingRights rights;

    private Square[] chessboard;



    private Board(Builder builder){

    }





    public static class Builder{



        public Builder(){

        }

        public Board buildStartingBoard(){
            return new Board(this);
        }

        public Board build(){
            return new Board(this);
        }

    }

}
