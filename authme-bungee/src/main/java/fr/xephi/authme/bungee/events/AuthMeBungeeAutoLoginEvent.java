package fr.xephi.authme.bungee.events;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Event;

public class AuthMeBungeeAutoLoginEvent extends Event implements Cancellable {

    private final ProxiedPlayer player;

    private boolean cancel;

    public AuthMeBungeeAutoLoginEvent(ProxiedPlayer player) {
        this.player = player;
    }

    public ProxiedPlayer getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
