import Players.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Enemy1", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Enemy1", enemy.getName());
    }

    @Test
    public void hasEmptyBag(){
        assertEquals(0, enemy.getBag().size());
    }
}
