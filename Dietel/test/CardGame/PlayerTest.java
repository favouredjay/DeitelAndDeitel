package CardGame;

import org.junit.jupiter.api.Test;

import static CardGame.Suit.*;
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
        player.addCard(new CardGames(DIAMOND, 4));
        player.addCard(new CardGames(SPADE, 10));
        player.addCard(new CardGames(CLUB, 6));
        player.addCard(new CardGames(HEART, 3));
        assertEquals(4, player.getNumberOfCards());
    }
}
