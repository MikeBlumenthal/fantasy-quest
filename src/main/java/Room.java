import Items.Item;
import Players.Enemy;

import java.util.ArrayList;

public class Room {

    private ArrayList<Item> rewards;
    private Enemy enemy;

    public Room(Enemy enemy){
        this.enemy = enemy;
        this.rewards = new ArrayList<>();
    }

    public ArrayList<Item> getRewards() {
        return rewards;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void addRewards(Item item) {
        this.rewards.add(item);
    }
}
