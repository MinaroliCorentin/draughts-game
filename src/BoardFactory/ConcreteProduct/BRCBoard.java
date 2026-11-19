package BoardFactory.ConcreteProduct;

import BoardFactory.Board;

public class BRCBoard implements Board {

    private int[] board;
    private final int LENGTH = 8  ;
    private final int WIDTH = 8;

    public BRCBoard() {

        this.board = new int[LENGTH * WIDTH];
    }

    @Override
    public void display() {

        for ( int i = 0 ; i < WIDTH ; i ++ ){
            for ( int j = 0 ; j < LENGTH ; j ++){
                int a = WIDTH * 8 + LENGTH ;
            }
        }
    }

    public int[] getBoard() {
        return board;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public int getLENGTH() {
        return LENGTH;
    }

    public int getWIDTH() {
        return WIDTH;
    }
}
