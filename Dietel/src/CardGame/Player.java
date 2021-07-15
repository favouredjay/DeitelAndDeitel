package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<CardGames> cards = new ArrayList<>();

    public Player(String playerName) {
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public void addCard(CardGames card) {
        cards.add(card);
    }

    public int getNumberOfCards() {
        return cards.size();
    }
}
