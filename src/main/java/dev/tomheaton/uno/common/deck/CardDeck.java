package dev.tomheaton.uno.common.deck;

import dev.tomheaton.uno.common.card.*;

import java.util.*;

public class CardDeck {

    public List<Card> cards;

    public CardDeck() {
        this.cards = new ArrayList<>(108);
    }

    public void initialise(){
        // Colour Cards
        for (CardColour colour : EnumSet.range(CardColour.BLUE, CardColour.YELLOW)) {
            cards.add(new NumberCard(colour, 0));
            for (int i = 1; i <= 9; i++) {
                cards.add(new NumberCard(colour, i));
                cards.add(new NumberCard(colour, i));
            }
        }
        // Special Cards
        for (CardColour colour : EnumSet.range(CardColour.BLUE, CardColour.YELLOW)) {
            for (int i = 1; i <= 2; i++) {
                cards.add(new SpecialCard(colour, CardType.DRAW));
                cards.add(new SpecialCard(colour, CardType.REVERSE));
                cards.add(new SpecialCard(colour, CardType.SKIP));
            }
        }
        // Wild Cards
        for (int i = 1; i <= 4; i++) {
            cards.add(new SpecialCard(CardColour.BLACK, CardType.WILD));
            cards.add(new SpecialCard(CardColour.BLACK, CardType.WILD_DRAW));
        }
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards, new Random());
    }
}
