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

        board.setWhitePawns(0b00000_00000_0_01000_00000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        board.setBlackPawns(0b00000_00000_0_00000_00100_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        assertFalse(movement.canWhiteMoveTopLeft());

    }

    @Test
    void canWhiteMoveTopRightTest(){

        GameMode gameMode = new InternationalMode();
        Board board = gameMode.createBoard();
        board.setWhitePawns(0b00000_00000_0_01000_00000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        board.setBlackPawns(0b11111_11111_0_10111_01111_0_11111_11111_0_11111_11111_0_11111_11111L) ;
        MovementAvailable movement = new MovementAvailable(board);
        assertTrue(movement.canWhiteMoveTopRight());

        board.setWhitePawns(0b00000_00000_0_01000_00000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        board.setBlackPawns(0b00000_00000_0_00000_10000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        assertFalse(movement.canWhiteMoveTopRight());

    }

    @Test
    void attackTopLeftTest() {
        GameMode gameMode = new InternationalMode();
        Board board = gameMode.createBoard();
        board.setWhitePawns(0b00000_00000_0_01000_00000_0_00000_00000_0_00000_00000_0_00000_00000L);
        board.setBlackPawns(0b00000_10000_0_00000_00000_0_00000_00000_0_00000_00000_0_00000_00000L);
        MovementAvailable movement = new MovementAvailable(board);
        assertTrue(movement.canWhiteMoveTopLeft());
    }

    @Test
    void attackTopLeftTestNoEnnemies(){
        GameMode gameMode = new InternationalMode();
        Board board = gameMode.createBoard();
        board.setWhitePawns(0b00000_00000_0_00100_00000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        board.setBlackPawns(0b00000_10000_0_00000_00000_0_00000_00000_0_00000_00000_0_00000_00000L) ;
        MovementAvailable movement = new MovementAvailable(board);
        movement.WhiteAttackersTopLeft();
        assertEquals(0b00000_00000_0_00100_00000_0_00000_00000_0_00000_00000_0_00000_00000L, board.getWhitePawns());
    }


}
