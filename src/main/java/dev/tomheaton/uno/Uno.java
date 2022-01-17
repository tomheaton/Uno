package dev.tomheaton.uno;

import dev.tomheaton.uno.common.player.Player;
import dev.tomheaton.uno.server.GameManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Uno {

    public static final Logger LOGGER = LogManager.getLogger("uno");

    public static void main(String[] args) {
        System.out.println("Uno");

        GameManager gameManager = new GameManager();

        gameManager.addPlayer(new Player());
        gameManager.addPlayer(new Player());
        gameManager.addPlayer(new Player());
        gameManager.addPlayer(new Player());

        gameManager.startGame();

        System.out.println(gameManager);
    }
}
