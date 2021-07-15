package WHOT;

import org.junit.jupiter.api.Test;

import static WHOT.Suit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CardGamesTest {
    private CardGames cardGames;

    @Test
    void testThatCardHasCrosses() {
        CardGames cardGames = new CardGames(CROSSES, 2);
        assertSame(CROSSES, cardGames.getSuit());

    }

    @Test
    void testThatCardHasTriangleSuit() {
        CardGames cardGames = new CardGames(TRIANGLE, 2 );
        assertSame(TRIANGLE, cardGames.getSuit());
    }

    @Test
    void testThatCardHasClubSuit() {
        CardGames cardGames = new CardGames(CIRCLE, 2);
        assertSame(CIRCLE, cardGames.getSuit());
    }

    @Test
    void testThatCardHasHeart() {
        CardGames cardGames = new CardGames(TRIANGLE, 2);
        assertSame(TRIANGLE, cardGames.getSuit());
    }

    @Test
    void testThatCardHasAceValue() {
        cardGames = CardGames.createTriangleCardOfValue(1);
        assertEquals(TRIANGLE, cardGames.getSuit());
    }

    @Test
    void testThatCardHasJackValue() {
        cardGames = CardGames.createCircleCardOfValue(2);
        assertEquals(CIRCLE, cardGames.getSuit());

    }
    @Test
    void testThatCardHasQueenValue(){
        cardGames = CardGames.createCrossesCardOfValue(3);
        assertEquals(CROSSES, cardGames.getSuit());
    }

    @Test
    void testThatCardHasKingValue(){
        cardGames = CardGames.createSquareCardOfValue(5);
        assertEquals(SQUARE,cardGames.getSuit());
    }
    @Test
    void testThatCardHasOtherNumbers(){
        cardGames = CardGames.createStarCardOfValue(3);
        assertEquals(STAR, cardGames.getSuit());
    }

}