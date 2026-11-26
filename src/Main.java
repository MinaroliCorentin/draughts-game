import BoardFactory.Board;
import BoardFactory.ConcreteCreator.InternationalMode;
import BoardFactory.GameMode;

void main() {

        GameMode gameMode = new InternationalMode();
        Board board = gameMode.createBoard();
        board.display();

}
