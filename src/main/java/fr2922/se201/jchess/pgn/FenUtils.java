package fr2922.se201.jchess.pgn;

import fr2922.se201.jchess.board.Board;
import fr2922.se201.jchess.board.CastlingRights;
import fr2922.se201.jchess.board.IBoard;
import fr2922.se201.jchess.board.Square;
import fr2922.se201.jchess.piece.Color;

public class FenUtils {

    private FenUtils(){

    }

    /**
     * Generates FEN - Forsyth–Edwards Notation based on passed chessboard state
     * @param board - board for which we are creating FEN
     * @return String representing FEN
     */
    public static String generateFenFromBoard(final IBoard board){

        final StringBuilder builder = new StringBuilder();
        builder.append(convertPiecePositionsToString(board)).append(" ");
        builder.append(convertActiveColorToString(board)).append(" ");
        builder.append(convertCastlingRightsToString(board.getCastlingRights())).append(" ");
        builder.append(convertEnPassantPawnToString(board)).append(" ");
        builder.append(convertMoveCountToString(board)).append(" ");
        return builder.toString();
    }

    private static String convertPiecePositionsToString(final IBoard board){
        final StringBuilder builder = new StringBuilder();
        for(int i =0; i < 64; i++)
            builder.append(board.getSquare(i).getPieceNotation());
        builder.insert(8,"/");
        builder.insert(17,"/");
        builder.insert(26,"/");
        builder.insert(35,"/");
        builder.insert(44,"/");
        builder.insert(53,"/");
        builder.insert(62,"/");

        return builder.toString()
                .replaceAll("--------", "8")
                .replaceAll("-------", "7")
                .replaceAll("------", "6")
                .replaceAll("-----", "5")
                .replaceAll("----", "4")
                .replaceAll("---", "3")
                .replaceAll("--", "2")
                .replaceAll("-", "1");
    }

    private static String convertActiveColorToString(final IBoard board){
        return board.getActiveColor() == Color.WHITE ? "w" : "b";
    }

    private static String convertCastlingRightsToString(final CastlingRights castlingRights){
        if(!castlingRights.isAnyCastlingPossible())
            return "-";
        final StringBuilder builder = new StringBuilder();
        builder.append(castlingRights.canCastleWhiteKingSide() ? "K" : "");
        builder.append(castlingRights.canCastleWhiteQueenSide() ? "Q" : "");
        builder.append(castlingRights.canCastleBlackKingSide() ? "k" : "");
        builder.append(castlingRights.canCastleBlackQueenSide() ? "q" : "");
        return builder.toString();
    }


    private static String convertEnPassantPawnToString(final IBoard board){
        if(!board.isEnPassantPossible())
            return "-";
        return board.getActiveColor().isWhite() ? "" +(board.getEnPassantPawnPosition()-8) : "" +(board.getEnPassantPawnPosition()+8);
    }

    private static String convertMoveCountToString(final IBoard board){
        return board.getHalfMoveClockCount() + " " + board.getFullMoveCount();
    }

    public static Board generateBoardFromFen(final String fen){
        // TODO Implement generation of board from FEN
        return null;
    }

}
