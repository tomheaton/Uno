package dev.tomheaton.uno.common.card;

public class NumberCard extends Card {

    public final int number;

    public NumberCard(CardColour colour, int number) {
        super(colour, CardType.NUMBER);
        this.number = number;
    }
}
