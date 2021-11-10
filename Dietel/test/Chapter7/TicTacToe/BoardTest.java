package Chapter7.TicTacToe;

import org.junit.jupiter.api.Test;

import static Chapter7.TicTacToe.GameState.EMPTY;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {



    @Test
    void testThatTicTacToeCanBePlayed(){
        Board board = new Board();
        assertNotNull(board);
    }

    @Test
    void testThatBoardIsEmpty(){
        Board board = new Board();
        assertNotEquals(EMPTY, board.getBoard());
    }
    @Test
    void testThatPlayer1CanPlay() {
        Board board = new Board();
        board.setPlayer1(4, board.gameArray[0][1]);
       assertEquals(GameState.X,board.setBoard());
    }

}