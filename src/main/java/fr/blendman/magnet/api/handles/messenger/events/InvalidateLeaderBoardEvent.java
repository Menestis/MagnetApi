package fr.blendman.magnet.api.handles.messenger.events;

import fr.blendman.magnet.api.handles.messenger.MagnetNetworkEvent;

import java.util.List;
import java.util.UUID;

/**
 * @author Blendman974
 */
public class InvalidateLeaderBoardEvent extends MagnetNetworkEvent {

    private final String name;
    private final String label;
    private final List<String> leaderboard;

    public InvalidateLeaderBoardEvent(String name, String label, List<String> leaderboard) {
        super(Target.EVENTS, "leaderboard.invalidate."+name);
        this.name = name;
        this.label = label;
        this.leaderboard = leaderboard;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public List<String> getLeaderboard() {
        return leaderboard;
    }
}
