package WHOT;

import org.junit.jupiter.api.Test;

import static WHOT.Suit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void playerHasAnID(){
        Player player = new Player("player1");
        assertEquals("player1", player.getName());
    }
    @Test
    void playerHasCards(){
        Player player = new Player("player1");
        player.addCard(new CardGames(TRIANGLE, 4));
        player.addCard(new CardGames(CIRCLE, 10));
        player.addCard(new CardGames(CROSSES, 6));
        player.addCard(new CardGames(SQUARE, 3));
        assertEquals(4, player.getNumberOfCards());
    }
}
