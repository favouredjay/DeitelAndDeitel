package WHOT;

import java.security.SecureRandom;
import java.util.Arrays;

public class CardDeck {
    private int lastPushLocation = -1;
private CardGames [] cards;
    CardGames swap;

    public CardDeck(int numberOfCards) {
        cards = new CardGames[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public  void push(CardGames card) {
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
//            System.out.println(cards[i]);
for(i=0;i< cards.length;i++){
    System.out.println(cards[i]);
}
        }
    return Arrays.toString(cards);
    }
    public static CardDeck createFullCardDeck(){
        CardDeck cardDeck = new CardDeck(54);
        for(Suit suit : Suit.values()){
            switch (suit){
                case TRIANGLE -> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 6 || i == 9)
                            continue;
                       cardDeck.push (CardGames.createTriangleCardOfValue(i));
                    }
                }
                case CIRCLE -> {
                    for (int i = 1; i <= 14; i++) {
                        if(i ==6 || i == 9)
                            continue;
                        cardDeck.push(CardGames.createCircleCardOfValue(i));
                    }
                }
                case STAR -> {

                    for (int i = 1; i <=8 ; i++) {
                       if(i == 6)
                           continue;
                        cardDeck.push(CardGames.createStarCardOfValue(i));
                    }
                }
                case CROSSES -> {
                    for (int i = 1; i <=14 ; i++) {
                        if(i==4||i==6||i==8||i==9||i==12)
                            continue;
                      cardDeck.push  ( CardGames.createCrossesCardOfValue(i));
                    }
                }
                case SQUARE -> {
                    for (int i = 1; i <=14; i++) {
                        if(i == 4||i == 6|| i==8|| i==9|| i ==12)
                            continue;
                     cardDeck.push   (CardGames.createSquareCardOfValue(i));


                    }
                }
                case WHOT -> {
                    for (int i = 1; i <6; i++) {
                        cardDeck.push(CardGames.createWhotCardOfValue());

                    }
                }

            }
        }
return cardDeck;

    }
//    public int getNumberOfCards(){
//        return
//    }

}