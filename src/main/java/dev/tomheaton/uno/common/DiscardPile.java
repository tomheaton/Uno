package dev.tomheaton.uno.common;

import dev.tomheaton.uno.common.card.Card;

import java.util.Stack;

public class DiscardPile {

    public Stack<Card> discardPile;

    public DiscardPile() {
        discardPile = new Stack<>();
    }

    public boolean discardCard(Card card) {
        if (discardPile.isEmpty()) {
            discardPile.push(card);
            return true;
        }

        Card topCard = discardPile.peek();

        if (topCard.getColour().equals(card.getColour()) || topCard.getType().equals(card.getType())) {
            return true;
        }

        return false;
    }
}
