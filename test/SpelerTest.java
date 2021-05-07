import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SpelerTest {

    @Test
    public void testSpelers(){
    Speler speler = new Speler();
    assertEquals(0, speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(1,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(2,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(3,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(4,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(5,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(6,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(7,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(8,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(9,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(10,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(11,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(12,speler.totalSpeler());
    speler.addSpeler(1);
    assertEquals(12,speler.totalSpeler());
    }
}
