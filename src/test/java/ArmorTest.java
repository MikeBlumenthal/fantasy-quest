import Items.Armor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmorTest {

    Armor armor;

    @Before
    public void before() {
        armor = new Armor("Chestplate", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Chestplate", armor.getName());
    }

    @Test
    public void hasHitpoints() {
        assertEquals(20, armor.getHitpoints());
    }

    @Test
    public void takesHit() {
        armor.takeHit(10);
        assertEquals(10, armor.getHitpoints());
    }
}
