import Items.Armour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {

    Armour armour;

    @Before
    public void before() {
        armour = new Armour("Chestplate", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Chestplate", armour.getName());
    }

    @Test

    public void hasHitPoints() {
        assertEquals(20, armour.getArmourPoints());
    }

}
