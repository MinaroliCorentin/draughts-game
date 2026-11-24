package BoardFactory;

public abstract class GameMode {

    protected abstract Board initializeBoard();

    public Board createBoard(){
        Board board = initializeBoard();
        return board ;
    }

}
