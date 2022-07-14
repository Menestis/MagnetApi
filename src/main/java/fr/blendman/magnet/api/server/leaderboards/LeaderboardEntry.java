package fr.blendman.magnet.api.server.leaderboards;

/**
 * @author Blendman974
 */
public class LeaderboardEntry {
    private final String username;
    private final Integer score;

    public LeaderboardEntry(String username, Integer score) {
        this.username = username;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public String getUsername() {
        return username;
    }
}
