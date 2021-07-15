package CardGame;

import org.junit.jupiter.api.Test;

import static CardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardGamesTest {

    @Test
    void cardCanBeCreatedAndDiamondCanBeCreated() {
        CardGames cardGames = new CardGames(DIAMOND, 2);
        assertSame(DIAMOND, cardGames.getSuit());

    }

    @Test
    void testThatCardHasSpadeSuit() {
        CardGames cardGames = new CardGames(SPADE, 2);
        assertSame(SPADE, cardGames.getSuit());
    }

    @Test
    void testThatCardHasClubSuit() {
        CardGames cardGames = new CardGames(CLUB, 2);
        assertSame(CLUB, cardGames.getSuit());
    }

    @Test
    void testThatCardHasHeart() {
        CardGames cardGames = new CardGames(HEART, 2);
        assertSame(HEART, cardGames.getSuit());
    }

    @Test
    void testThatCardHasAceValue() {
        CardGames cardGames = new CardGames(HEART, 1);
        assertEquals("Ace", cardGames.getValue());
    }

    @Test
    void testThatCardHasJackValue() {
        CardGames cardGames = new CardGames(HEART, 11);
        assertEquals("Jack", cardGames.getValue());

    }
    @Test
    void testThatCardHasQueenValue(){
        CardGames cardGames = new CardGames(HEART,12);
        assertEquals("Queen", cardGames.getValue());
    }

    @Test
    void testThatCardHasKingValue(){
        CardGames cardGames = new CardGames(DIAMOND, 13);
        assertEquals("King", cardGames.getValue());
    }
    @Test
    void testThatCardHasOtherNumbers(){
        CardGames cardGames = new CardGames(DIAMOND, 8);
        assertEquals("8", cardGames.getValue());
    }
    @Test
    void testThatInvalidValueCanThrowInvalidException(){
        assertThrows(InvalidCardValueException.class,()->new CardGames(HEART,-2));
        assertThrows(InvalidCardValueException.class,()-> new CardGames(DIAMOND, 23));

    }
}