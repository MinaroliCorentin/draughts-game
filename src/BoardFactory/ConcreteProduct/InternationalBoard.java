package BoardFactory.ConcreteProduct;

import BoardFactory.Board;

public class InternationalBoard implements Board {

    private int[] board;
    private final int LENGTH = 10  ;
    private final int WIDTH = 10;

    public InternationalBoard() {

        this.board = new int[LENGTH * WIDTH];
    }

    @Override
    public void display() {

        for (int i = 0; i < WIDTH * LENGTH; i++) {
            switch (getter(i) & 0 ) {
                case 0x00 -> System.out.println("null");
                case 0x10 -> System.out.println("Blanc");
                case 0x20 -> System.out.println("Noir");
            }
        }
    }

    public int getter(int a ){
            return this.board[a];
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
