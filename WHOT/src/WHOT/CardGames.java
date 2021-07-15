package WHOT;

import static WHOT.Suit.*;

public class CardGames {
  private final int value;
  private final Suit suit;
    CardGames(Suit suit, int value){
    this.value = value;
    this.suit = suit;
}

    public Suit getSuit() {
    return suit;
    }

//    public String getDefaultValue() {
//        return switch (value) {
//            case 1 -> "1";
//            case 2 -> "2";
//            case 3 -> "3";
//            case 5-> "5";
//            default -> "7";
//        };
//    }

    public static CardGames createTriangleCardOfValue(int value) {
        CardGames cardGames = new CardGames(TRIANGLE, value);
        return cardGames;
    }

    public static CardGames createSquareCardOfValue(int value){
        CardGames cardGames = new CardGames(SQUARE, value);
        return cardGames;
    }

//    public String get4Values(){
//        if (value == 4){
//            Suit.TRIANGLE, Suit.SQUARE, Suit.STAR;
//        }
//    }
public static CardGames createCrossesCardOfValue(int value){
    CardGames cardGames = new CardGames(CROSSES, value);
    return cardGames;
}
    public static CardGames createCircleCardOfValue(int value){
        CardGames cardGames = new CardGames(CIRCLE, value);
        return cardGames;
    }

    public static CardGames createStarCardOfValue(int value){
        CardGames cardGames = new CardGames(STAR, value);
        return cardGames;
    }
    public static CardGames createWhotCardOfValue(){
        CardGames cardGames = new CardGames(WHOT, 20);
        return cardGames;
    }


    @Override
    public boolean equals(Object obj){
        if(!this.getClass().equals(obj.getClass())){
            System.out.println("Not same");
        }
        CardGames cardToCompare=(CardGames) obj;
        if(this.value==cardToCompare.value || this.suit== cardToCompare.suit) {
            return true;
        }
        return false;
    }

@Override
    public String toString() {
    return getValue() + " of " + suit.toString();
}

    public int getValue(){
        return value;
    }
}

