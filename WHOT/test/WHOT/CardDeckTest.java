package WHOT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    public CardDeck cardDeck;

    @BeforeEach
    void setUp(){
        cardDeck = new CardDeck(54);
    }

    @Test
    void cardDeckHasFixedSize(){
        assertEquals(54, cardDeck.getSize());
    }
    @Test
    void firstElementPushedShouldBeLastInStack(){
        CardGames card = new CardGames(Suit.CROSSES, 4);
        cardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }
    @Test
    void pushTwice_popOnce_thenPeek_shouldReturnFirstElement(){
        CardGames firstCard = new CardGames(Suit.TRIANGLE, 5);
        CardGames secondCard = new CardGames(Suit.TRIANGLE, 7);
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        CardGames poppedCard = cardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, cardDeck.peek());
    }
//    @Test
//    void popEmptyCardDeck_throwsStackUnderflowException(){
//        assertTrue(cardDeck.isEmpty());
//        assertThrows(StackUnderFlowExceptions.class, ()->cardDeck.pop());
//    }
//    @Test
//    void pushIntoFullDeck_throwsStackOverflowException(){
//        CardGames card = new CardGames(Suit.SQUARE, 4);
//        for (int i = 0; i < 4; i++) {
//            cardDeck.push(card);
//        }
//        assertTrue(cardDeck.isFull());
//        assertThrows(StackOverflowExceptions.class, ()->cardDeck.push(card));
//    }
//    @Test
//    void peekingEmptyCardDeck_throwsStackUnderflowException(){
//        assertTrue(cardDeck.isEmpty());
//        assertThrows(StackUnderFlowExceptions.class, ()->cardDeck.peek());
//    }
    @Test
    void cardCanShuffle(){
        System.out.println(CardDeck.createFullCardDeck().shuffleCardDeck());
//        CardGames firstCard = new CardGames(Suit.CIRCLE, 8);
//        CardGames secondCard = new CardGames(Suit.CROSSES, 2);
//        CardGames thirdCard = new CardGames(Suit.STAR, 1);
//        CardGames fourthCard = new CardGames(Suit.SQUARE, 2);
//        cardDeck.push(firstCard);
//        cardDeck.push(secondCard);
//        cardDeck.push(thirdCard);
//        cardDeck.push(fourthCard);
//        assertSame(fourthCard, cardDeck.peek());
//        cardDeck.shuffleCardDeck();
//        assertNotSame(fourthCard, cardDeck.peek());

    }
    @Test
    void testThatCardIsFull(){
        CardDeck.createFullCardDeck();
        assertEquals(54, CardDeck.createFullCardDeck().getSize());
        assertTrue(CardDeck.createFullCardDeck().isFull());

    }
}
