/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tick.tack.toe.client.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import tick.tack.toe.client.models.Player;

/**
 *
 * @author wwwmo
 */
public class RejectInvitationRequest extends Request {
    Player player;

    public RejectInvitationRequest() {
        super(ACTION_REJECT_INVITATION);
    }

    public RejectInvitationRequest(Player player) {
        super(ACTION_REJECT_INVITATION);
        this.player = player;
    }

    public RejectInvitationRequest(@JsonProperty("action") String action, @JsonProperty("player") Player player) {
        super(action);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
