package dev.tomheaton.uno.server;

import dev.tomheaton.uno.common.DiscardPile;
import dev.tomheaton.uno.common.deck.CardDeck;
import dev.tomheaton.uno.common.player.Player;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private static final int MAX_PLAYERS = 10;

    public CardDeck cardDeck;
    public DiscardPile discardPile;

    public List<Player> players;

    public GameManager() {
        cardDeck = new CardDeck();
        discardPile = new DiscardPile();
        players = new ArrayList<>(MAX_PLAYERS);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame() {
        cardDeck.initialise();
    }
}
