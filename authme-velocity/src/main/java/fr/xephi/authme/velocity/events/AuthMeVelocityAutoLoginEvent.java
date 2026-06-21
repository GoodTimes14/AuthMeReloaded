package fr.xephi.authme.velocity.events;

import com.velocitypowered.api.event.ResultedEvent;
import com.velocitypowered.api.proxy.Player;

public class AuthMeVelocityAutoLoginEvent implements ResultedEvent<ResultedEvent.GenericResult> {

    private final Player player;

    private GenericResult result = GenericResult.allowed();

    public AuthMeVelocityAutoLoginEvent(Player player) {
        this.player = player;
    }


    public Player getPlayer() {
        return player;
    }

    @Override
    public GenericResult getResult() {
        return result;
    }

    @Override
    public void setResult(GenericResult result) {
        this.result = result;
    }
}
