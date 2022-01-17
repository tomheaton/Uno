package dev.tomheaton.uno.server;

import dev.tomheaton.uno.common.DiscardPile;
import dev.tomheaton.uno.common.card.Card;
import dev.tomheaton.uno.common.deck.CardDeck;
import dev.tomheaton.uno.common.player.Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GameManager {

    private static final int MAX_PLAYERS = 10;
    private static final int STARTING_CARD_COUNT = 7;

    public CardDeck cardDeck;
    public DiscardPile discardPile;
    public List<Player> players;

    public GameManager() {
        cardDeck = new CardDeck();
        discardPile = new DiscardPile();
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (players.size() < MAX_PLAYERS) {
            players.add(player);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void startGame() {
        cardDeck.initialise();
        cardDeck.shuffle();

        for (int i = 0; i < STARTING_CARD_COUNT; i++) {
            for (Player player : players) {
                Card card = cardDeck.getRandomCard();
                player.addCard(card);
            }
        }

        for (Player player : players) {
            System.out.printf("player %s's turn to play a card.\n", player.getId());
        }
    }

    @Override
    public String toString() {
        return String.format("Game Manager: { Players: %s }", getPlayers());
    }
}
