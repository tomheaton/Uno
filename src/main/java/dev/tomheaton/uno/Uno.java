package dev.tomheaton.uno;

import dev.tomheaton.uno.common.card.*;
import dev.tomheaton.uno.common.deck.CardDeck;
import dev.tomheaton.uno.common.player.Player;

public class Uno {

    public static void main(String[] args) {
        System.out.println("Uno");

        // Testing:
        Card blueOne = new NumberCard(CardColour.BLUE, 1);
        Card redReverse = new SpecialCard(CardColour.RED, CardType.REVERSE);
        Card wild = new SpecialCard(CardColour.BLACK, CardType.WILD);
        Card wildDraw = new SpecialCard(CardColour.BLACK, CardType.WILD_DRAW);

        Player playerOne = new Player(1);

        // start game:
        CardDeck cardDeck = new CardDeck();
        cardDeck.initialise();
//        cardDeck.shuffle();
//        cardDeck.print();
    }
}
