package fr2922.se201.jchess.board;

public class CastlingRights {

    private boolean whiteKingSide;
    private boolean whiteQueenSide;

    private boolean blackKingSide;
    private boolean blackQueenSide;

    public CastlingRights(){
        whiteKingSide = true;
        whiteQueenSide = true;
        blackKingSide = true;
        blackQueenSide = true;
    }

    public void setWhiteKingSide(boolean whiteKingSide) {
        this.whiteKingSide = whiteKingSide;
    }

    public void setWhiteQueenSide(boolean whiteQueenSide) {
        this.whiteQueenSide = whiteQueenSide;
    }

    public void setBlackKingSide(boolean blackKingSide) {
        this.blackKingSide = blackKingSide;
    }

    public void setBlackQueenSide(boolean blackQueenSide) {
        this.blackQueenSide = blackQueenSide;
    }

    public boolean canCastleWhiteKingSide(){
        return whiteKingSide;
    }

    public boolean canCastleWhiteQueenSide(){
        return whiteQueenSide;
    }

    public boolean canCastleBlackKingSide(){
        return blackKingSide;
    }

    public boolean canCastleBlackQueenSide(){
        return blackQueenSide;
    }

    public boolean isAnyCastlingPossible() { return whiteKingSide || whiteQueenSide || blackKingSide || blackQueenSide; }

}
