package BoardFactory.ConcreteProduct;

import BoardFactory.Board;

public class InternationalBoard implements Board {

    private final long initialWhitePawns ;
    private final long initialBlackPawns ;

    public InternationalBoard() {

        this.initialWhitePawns = 0b11111_11111_11111_11111_00000_00000_00000_00000_00000_00000L ;
        this.initialBlackPawns = 0b00000_00000_00000_00000_00000_00000_11111_11111_11111_11111L ;

    }

    @Override
    public void display() {

        int nb = 0 ;
        for ( long i = this.initialBlackPawns ; i >= 0 ; i--){

            if (i % 11 == 10) {
                continue;
            }

            long isBlack = (this.initialBlackPawns >>> i) & 1L;
            long isWhite = (this.initialWhitePawns >>> i) & 1L;

            if ( isBlack == 1L ) {
                System.out.print('\u26C0' + " ");
            } else if (isWhite == 1L){
                System.out.print('\u26C2' + " ");
            } else {
                System.out.print('\u25A1' + " ");
            }
            nb ++ ;
            if (nb % 5 == 0){ // Next Line
                System.out.println();
            }

        }

    }
}
