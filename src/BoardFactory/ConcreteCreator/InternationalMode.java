package BoardFactory.ConcreteCreator;

import BoardFactory.ConcreteProduct.InternationalBoard;
import BoardFactory.GameMode;
import BoardFactory.Board;

public class InternationalMode extends GameMode {
    @Override
    protected Board initializeBoard() {
        return new InternationalBoard();
    }
}
