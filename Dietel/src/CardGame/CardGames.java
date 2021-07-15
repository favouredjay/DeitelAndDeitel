package CardGame;

public class CardGames {
  private final int value;
  private final Suit suit;
    public CardGames(Suit suit, int value){
    if(value <1 || value > 13){
        throw new InvalidCardValueException(value + " is invalid");
    }
    this.value = value;
    this.suit = suit;
}

    public Suit getSuit() {
    return suit;
    }

    public String getValue() {
        return switch (value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> value + "";
        };

    }
}
