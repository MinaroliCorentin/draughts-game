package Test;

import BoardFactory.Board;
import BoardFactory.ConcreteCreator.InternationalMode;
import BoardFactory.GameMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getEmptySquareTest(){

        GameMode gameMode = new InternationalMode();
        Board board = gameMode.createBoard();
        assertEquals(0b00000_00000_0_00000_00000_0_11111_11111_0_00000_00000_0_00000_00000L, board.getEmptySquares());

    }

}
