package RockPaper;

import org.junit.jupiter.api.Test;

import static RockPaper.GameMove.*;

import static org.junit.jupiter.api.Assertions.*;


public class RockPaperScissorsTest {



    RockPaperScissors rockPaperScissors =new RockPaperScissors();

    @Test

    void gameCanBePlayed(){
        if (rockPaperScissors != null) {
            assertNotNull(rockPaperScissors);
        }
    }

    @Test
    void computerCanPlay(){
        rockPaperScissors.computerPlay(1);
        assertEquals(ROCK, rockPaperScissors.computerCanPlay());
        rockPaperScissors.computerPlay(2);
        assertSame(PAPER, rockPaperScissors.computerCanPlay());
        rockPaperScissors.computerPlay(3);
        assertEquals(SCISSORS, rockPaperScissors.computerCanPlay());
    }
     @Test
    void canGenerateRandomMoves(){
        assertNotEquals(rockPaperScissors.computerRandomMoveCanBeGenerated(), rockPaperScissors.computerRandomMoveCanBeGenerated());
    }

    @Test
    void playerCanPlay(){
        rockPaperScissors.playerCanPlay(1);
        assertEquals(ROCK, rockPaperScissors.playerPlay());
        rockPaperScissors.playerCanPlay(2);
        assertEquals(PAPER, rockPaperScissors.playerPlay());
    }

    @Test
    void playerCanWin(){
        rockPaperScissors.playerCanWinOrLose();

        rockPaperScissors.computerPlay(3);
        rockPaperScissors.playerCanPlay(1);
        assertEquals(RockPaperScissors.Status.WON,rockPaperScissors.playerCanWinOrLose());
    }

    @Test
    void playerCanLose(){
        rockPaperScissors.computerPlay(2);
        rockPaperScissors.playerCanPlay(1);
        assertEquals(RockPaperScissors.Status.LOST, rockPaperScissors.playerCanWinOrLose());
    }

    @Test
    void computerCanWin(){
        rockPaperScissors.computerPlay(2);
        rockPaperScissors.playerCanPlay(1);
        assertEquals(RockPaperScissors.Status.WON, rockPaperScissors.computerCanWinOrLose());
    }

    @Test
    void computerCanLose(){
        rockPaperScissors.computerPlay(3);
        rockPaperScissors.playerCanPlay(1);
        assertEquals(RockPaperScissors.Status.LOST, rockPaperScissors.computerCanWinOrLose());
    }

    @Test
    void playerAndComputerCanDraw(){
        rockPaperScissors.computerPlay(1);
        rockPaperScissors.playerCanPlay(1);
        assertEquals(RockPaperScissors.Status.DRAW, rockPaperScissors.playerCanDraw());
    }
}
