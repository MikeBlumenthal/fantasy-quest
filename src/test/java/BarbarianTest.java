import Items.Weapon;
import Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;

    @Before
    public void before() {
        barbarian = new Barbarian("Bobby the Barbaric", 900);
        weapon = new Weapon("Longsword", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Bobby the Barbaric", barbarian.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(900, barbarian.getHitPoints());
    }

    @Test
    public void startWithNoWeapon() {
        assertEquals(null, barbarian.getInHand());
    }

    @Test
    public void weildsWeapon() {
        barbarian.changeWeapon(weapon);
        assertEquals("Longsword", barbarian.getInHand().getName());
    }
}
