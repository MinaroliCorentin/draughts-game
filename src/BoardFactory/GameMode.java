package BoardFactory;

public abstract class GameMode {

    protected abstract Board initializeBoard();

    public void createBoard(){
        Board board = initializeBoard();
        board.display();
    }

}
