package fr.blendman.magnet.api.server.leaderboards;

import java.util.List;

/**
 * @author Blendman974
 */
public class Leaderboard {
    private final String label;
    private final List<LeaderboardEntry> leaderboard;

    public Leaderboard(String label, List<LeaderboardEntry> leaderboard) {
        this.label = label;
        this.leaderboard = leaderboard;
    }

    public String getLabel() {
        return label;
    }

    public List<LeaderboardEntry> getLeaderboard() {
        return leaderboard;
    }
}
