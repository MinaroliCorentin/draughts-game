import BoardFactory.ConcreteCreator.InternationalMode;
import BoardFactory.GameMode;

void main() {

        GameMode gameMode = new InternationalMode();
        gameMode.createBoard();

}
