import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Knight1", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Knight1", knight.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(10, knight.getHitPoints());
    }

}
