package BoardFactory.ConcreteCreator;

import BoardFactory.Board;
import BoardFactory.ConcreteProduct.InternationalBoard;
import BoardFactory.GameMode;

public class CanadianMode extends GameMode {
    @Override
    protected Board initializeBoard() {
        return new InternationalBoard();
    }
}
