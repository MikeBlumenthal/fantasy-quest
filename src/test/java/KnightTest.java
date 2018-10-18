import Items.Weapon;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Weapon weapon;

    @Before
    public void before(){
        knight = new Knight("Knight1", 10);
        weapon = new Weapon("Longsword", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Knight1", knight.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(10, knight.getHitPoints());
    }

    @Test
    public void hasEmptyBag(){
        assertEquals(0, knight.getBag().size());
    }

    @Test
    public void hasNoWeapon(){
        assertEquals(null, knight.getInHand());
    }

    @Test
    public void weildsWeapon() {
        knight.changeWeapon(weapon);
        assertEquals("Longsword", knight.getInHand().getName());
    }

    @Test
    public void hasArmour() {
        assertEquals(100, knight.getArmourHitPoints());
    }
}
