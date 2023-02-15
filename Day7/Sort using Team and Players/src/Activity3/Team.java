package Activity3;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team> {
    private String name;
    private List<Player> playerList;

    public Team(String name) {
        this.name = name;
        this.playerList = new ArrayList<>();
    }

    public void addPlayer(String playerName) {
        Player newPlayer = new Player(playerName);
        playerList.add(newPlayer);
        Collections.sort(playerList);
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public int compareTo(Team other) {
        return this.name.compareTo(other.name);
    }
}