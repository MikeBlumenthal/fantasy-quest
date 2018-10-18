import Items.Companion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CompanionTest {

    Companion companion;

    @Before
    public void before() {
        companion = new Companion("Fluffy", 200);
    }

    @Test
    public void hasName() {
        assertEquals("Fluffy", companion.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(200, companion.getHitPoints());
    }
}
