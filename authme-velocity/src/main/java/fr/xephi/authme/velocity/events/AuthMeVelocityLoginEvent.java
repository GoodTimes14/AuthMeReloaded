package fr.xephi.authme.velocity.events;

import com.velocitypowered.api.proxy.Player;

public class AuthMeVelocityLoginEvent {


    private final Player player;
    private final boolean premium;

    public AuthMeVelocityLoginEvent(Player player, boolean premium) {
        this.player = player;
        this.premium = premium;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isPremium() {
        return premium;
    }
}
