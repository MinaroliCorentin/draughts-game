package BoardFactory.ConcreteProduct;

import BoardFactory.Board;

public class InternationalBoard implements Board {

    private static final long INITIAL_WHITE_PAWNS = 0b11111_11111_0_11111_11111_0_00000_00000_0_00000_00000_0_00000_00000L;
    private static final long INITIAL_BLACK_PAWNS = 0b00000_00000_0_00000_00000_0_00000_00000_0_11111_11111_0_11111_11111L;

    private long whitePawns;
    private long blackPawns;
    private long Valid_Squares ;
    private long kings;

    public InternationalBoard() {
        this.whitePawns = INITIAL_WHITE_PAWNS;
        this.blackPawns = INITIAL_BLACK_PAWNS;
        this.Valid_Squares = 0b11111_11111_0_11111_11111_0_11111_11111_0_11111_11111_0_11111_11111L ;
        this.kings = 0L;
    }

    @Override
    public void display() {

        int row = 0;
        for (int i = 0; i <= 53; i++) {

            //Skip Fake bit
            if (i % 11 == 10) {
                continue;
            }

            if (row % 2 == 0) {
                System.out.print("   ");
            }

            long isBlack = (this.blackPawns >>> i) & 1L;
            long isWhite = (this.whitePawns >>> i) & 1L;
            long isKing  = (this.kings >>> i) & 1L;

            if (isBlack == 1L) {
                System.out.print((isKing == 1L ? '\u26C3' : '\u26C2') + " ");
            } else if (isWhite == 1L) {
                System.out.print((isKing == 1L ? '\u26C1' : '\u26C0') + " ");
            } else {
                System.out.print('\u25A1' + " ");
            }

            if (row % 2 != 0) {
                System.out.print("   ");
            }

            // EOF
            int playableIndex = i - (i / 11);
            if ((playableIndex + 1) % 5 == 0) {
                System.out.println();
                row++;
            }
        }
    }

    public long getKings() {
        return kings;
    }

    public long getBlackPawns() {
        return blackPawns;
    }

    public long getWhitePawns() {
        return whitePawns;
    }


    public long getValid_Squares() {
        return Valid_Squares;
    }

    @Override
    public long getEmptySquares() {
        return ~(getBlackPawns() | getWhitePawns()) & getValid_Squares();
    }

    @Override
    public void setBlackPawns(long black) {
        this.blackPawns = black ;
    }

    @Override
    public void setWhitePawns(long white) {
        this.whitePawns = white;
    }

}