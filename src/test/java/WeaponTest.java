import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Longsword", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Longsword", weapon.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(20, weapon.getDamage());
    }

}
