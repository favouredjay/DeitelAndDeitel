package CardGame;

import java.security.SecureRandom;
import java.util.Arrays;

public class CardDeck {
    private int lastPushLocation = -1;
    private CardGames[] cards;
    CardGames swap;

    public CardDeck(int numberOfCards) {
        cards = new CardGames[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(CardGames card) {
        if (isFull()) throw new StackOverflowExceptions("Card deck is full");
        lastPushLocation++;
        cards[lastPushLocation] = card;
    }

    public CardGames peek() {
        if (isEmpty()) throw new StackUnderFlowExceptions("Card deck is empty");
        return cards[lastPushLocation];
    }

    public CardGames pop() {
        if (isEmpty()) throw new StackUnderFlowExceptions("Card deck is empty");
//        cards[lastPushLocation--] = null;
//        return cards[lastPushLocation];
        return cards[lastPushLocation--];
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public boolean isFull() {
        return lastPushLocation == getSize() - 1;
    }

    public String shuffleCardDeck() {
        SecureRandom randomNumber = new SecureRandom();
        for (int i = 0; i < cards.length; i++) {
            int number = randomNumber.nextInt(5);
            swap = cards[number];
            cards[number] = cards[i];
            cards[i] = swap;

        }
    return Arrays.toString(cards);
    }

}