package dev.tomheaton.uno.common.player;

import dev.tomheaton.uno.common.DiscardPile;
import dev.tomheaton.uno.common.card.Card;
import dev.tomheaton.uno.common.deck.CardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Player {

    public final UUID id;

    public List<Card> hand;

    public Player() {
        id = UUID.randomUUID();
        hand = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void playCard(DiscardPile discardPile, Card card) {
        discardPile.discardCard(card);
    }

    public void drawCard(CardDeck deck) {
        Card card = deck.getRandomCard();
        hand.add(card);
    }

    @Override
    public String toString() {
        return String.format("Player: { id: %s, hand: %s }", getId(), getHand());
    }
}
