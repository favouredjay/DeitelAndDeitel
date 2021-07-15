package CardGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static CardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    private CardGame.CardDeck cardDeck;

    @BeforeEach
    void setUp(){
        cardDeck = new CardGame.CardDeck(4);
    }

    @Test
    void cardDeckHasFixedSize(){
        assertEquals(4, cardDeck.getSize());
    }
    @Test
    void firstElementPushedShouldBeLastInStack(){
        CardGames card = new CardGames(DIAMOND, 4);
        cardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }
    @Test
    void pushTwice_popOnce_thenPeek_shouldReturnFirstElement(){
        CardGames firstCard = new CardGames(SPADE, 5);
        CardGames secondCard = new CardGames(CLUB, 7);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        CardGames poppedCard = cardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, cardDeck.peek());
    }
    @Test
    void popEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderFlowExceptions.class, ()->cardDeck.pop());
    }
    @Test
    void pushIntoFullDeck_throwsStackOverflowException(){
        CardGames card = new CardGames(SPADE, 4);
        for (int i = 0; i < 4; i++) {
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverflowExceptions.class, ()->cardDeck.push(card));
    }
    @Test
    void peekingEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderFlowExceptions.class, ()->cardDeck.peek());
    }
    @Test
    void cardCanShuffle(){
        CardGames firstCard = new CardGames(HEART, 8);
        CardGames secondCard = new CardGames(DIAMOND, 2);
        CardGames thirdCard = new CardGames(SPADE, 1);
        CardGames fourthCard = new CardGames(CLUB, 2);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        cardDeck.push(thirdCard);
        cardDeck.push(fourthCard);
        assertSame(fourthCard, cardDeck.peek());
        cardDeck.shuffleCardDeck();
        assertNotSame(fourthCard, cardDeck.peek());

    }
}
