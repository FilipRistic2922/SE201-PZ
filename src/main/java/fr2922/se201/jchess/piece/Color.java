package fr2922.se201.jchess.piece;

public enum  Color {
    WHITE {
        @Override
        public boolean isWhite() {
            return true;
        }
    },
    BLACK {
        @Override
        public boolean isWhite() {
            return false;
        }
    };

    public abstract boolean isWhite();

}
