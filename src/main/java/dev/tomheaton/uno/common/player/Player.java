package dev.tomheaton.uno.common.player;

import java.util.UUID;

public class Player {

    public UUID id;

    public Player() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
