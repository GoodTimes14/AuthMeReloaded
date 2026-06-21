package fr.xephi.authme.velocity.events;

import com.velocitypowered.api.proxy.Player;

public class AuthMeVelocityLogoutEvent {

    private final Player player;

    public AuthMeVelocityLogoutEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
