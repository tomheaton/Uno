package dev.tomheaton.uno.common.card;

public abstract class Card {

    public CardColour colour;
    public CardType type;

    public Card(CardColour colour, CardType type) {
        this.colour = colour;
        this.type = type;
    }

    public CardColour getColour() {
        return colour;
    }

    public CardType getType() {
        return type;
    }

}
