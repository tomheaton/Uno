package dev.tomheaton.uno.common.card;

public class NumberCard extends Card {

    public final int number;

    public NumberCard(CardColour colour, int number) {
        super(colour, CardType.NUMBER);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("Card: { Colour: %s, Number: %d }", getColour(), getNumber());
    }
}
