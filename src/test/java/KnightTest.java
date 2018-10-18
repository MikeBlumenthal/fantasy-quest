import Items.Item;
import Items.Weapon;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Item weapon;

    @Before
    public void before(){
        knight = new Knight("Knight1", 10);
//        weapon = new Weapon(sword);
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

//    @Test
//    public void hasWeapon()



}
