package tictactoe;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TicTacToeTest {
Board board = new Board();

    @Test
    void boardHasTicTacToe(){
     tictactoe ticTacToe = new tictactoe();
     assertNotNull(ticTacToe);


    }


}
