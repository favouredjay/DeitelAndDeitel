package Chapter16;

public class Card {
    public static enum Face{Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}
    public static enum Suit {Clubs, Diamonds, Hearts, Spades}

    private final Face face;
    private final Suit suit;

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }
    public String toString()
 {
         return String.format("%s of %s", face, suit);
        }

}
