/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tick.tack.toe.client.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import tick.tack.toe.client.models.Match;
import tick.tack.toe.client.models.Player;

/**
 *
 * @author wwwmo
 */
public class AcceptToResumeRequest extends Request {

    private Player player;
    private Match match;

    public AcceptToResumeRequest() {
        super(ACTION_ACCEPT_TO_RESUME);
    }

    public AcceptToResumeRequest(Player player, Match match) {
        super(ACTION_ACCEPT_TO_RESUME);
        this.player = player;
        this.match = match;
    }

    public AcceptToResumeRequest(@JsonProperty("action") String action,
                             @JsonProperty("player") Player player,
                             @JsonProperty("match") Match match) {
        super(action);
        this.player = player;
        this.match = match;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
