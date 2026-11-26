package Move;

import BoardFactory.Board;

public class MovementAvailable {

    private Board board ;

    public MovementAvailable(Board board){
        this.board = board ;
    }

    public boolean canWhiteMoveTopLeft() {
        return ((board.getWhitePawns() >>> 6) & board.getEmptySquares()) != 0L;
    }

    public boolean canWhiteMoveTopRight() {
        return ((board.getWhitePawns() >>> 4) & board.getEmptySquares()) != 0L;
    }

    public long WhiteAttackersTopLeft() {

        long empty = board.getEmptySquares();
        long black = board.getBlackPawns();
        long white = board.getWhitePawns();

        long jumpableEnemies = (empty << 6) & black;
        return (jumpableEnemies << 6) & white;

    }


}
