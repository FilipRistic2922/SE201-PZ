package fr2922.se201.jchess;

import fr2922.se201.jchess.events.GameEndedEvent;
import fr2922.se201.jchess.events.MoveExecutedEvent;
import fr2922.se201.jchess.events.PieceEatenEvent;
import fr2922.se201.jchess.events.utils.EventBus;
import fr2922.se201.jchess.piece.Color;
import fr2922.se201.jchess.piece.Piece;
import fr2922.se201.jchess.piece.Type;


public class Main {


    public static void main(String[] args){

        EventBus.onEvent(MoveExecutedEvent.class,
                event -> System.out.println("Move from " + event.getMove().FROM + " to " + event.getMove().TO));

        EventBus.onEvent(GameEndedEvent.class,
                event -> System.out.println("Winner is " + event.getResult()));

        EventBus.post(GameEndedEvent.of("White"));

        EventBus.onEvent(PieceEatenEvent.class, event -> System.out.println("Eaten piece type " + event.getEatenPiece().type));

        EventBus.post(new PieceEatenEvent(new Piece(Type.BISHOP, Color.BLACK)));

    }
}
