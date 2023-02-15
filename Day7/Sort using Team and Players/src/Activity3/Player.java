package Activity3;

public class Player implements Comparable<Player> {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Player other) {
        return this.name.compareTo(other.name);
    }
}