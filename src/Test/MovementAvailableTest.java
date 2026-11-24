package Test;

import BoardFactory.Board;
import BoardFactory.ConcreteCreator.InternationalMode;
import BoardFactory.GameMode;
import Move.MovementAvailable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovementAvailableTest {

    @Test
    void canWhiteMoveTopLeftTest(){

        GameMode gameMode = new InternationalMode();
        Board board = gameMode.createBoard();
        board.setWhitePawns(0b00000_00000_0_01000_00000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        board.setBlackPawns(0b11111_11111_0_10111_11011_0_11111_11111_0_11111_11111_0_11111_11111L) ;
        MovementAvailable movement = new MovementAvailable(board);
        assertTrue(movement.canWhiteMoveTopLeft());

    }

}
