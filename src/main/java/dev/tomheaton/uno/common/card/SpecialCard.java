package dev.tomheaton.uno.common.card;

public class SpecialCard extends Card {

    public SpecialCard(CardColour colour, CardType type) {
        super(colour, type);
    }

    @Override
    public String toString() {
        return String.format("Card: { Colour: %s, Type: %s }", getColour(), getType());
    }
}
