package Backend;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private List<Profile> players;
    private List<Profile> priority;
    
    public Position(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.priority = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Profile> getPlayers() {
        return players;
    }

    public List<Profile> getPriority() {
        return priority;
    }

    public List<Profile> getPriorityPlayers() {
        return priority;
    }

    public void addPlayer(Profile player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    public void addPriorityPlayer(Profile player) {
        addPlayer(player);
        if (!priority.contains(player)) {
            priority.add(player);
        }
    }
    
}
