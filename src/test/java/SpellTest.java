import Items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell spell;

    @Before
    public void before() {
        spell = new Spell("Lightning Blast", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Lightning Blast", spell.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, spell.getDamage());
    }
}
