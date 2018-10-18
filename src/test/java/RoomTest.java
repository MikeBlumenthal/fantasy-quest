import Items.Item;
import Items.Treasure;
import Players.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy;
    Item treasure;

    @Before
    public void before(){
        treasure = new Treasure("gem", 5);
        enemy = new Enemy("Enemy1", 10);
        room = new Room(enemy);
    }

    @Test
    public void hasEnemy(){
        assertEquals(enemy, room.getEnemy());
    }

    @Test
    public void hasNoRewards(){
        assertEquals(0, room.getRewards().size());
    }

    @Test
    public void canAddRewards(){
        room.addRewards(treasure);
        assertEquals(1, room.getRewards().size());
    }

}
