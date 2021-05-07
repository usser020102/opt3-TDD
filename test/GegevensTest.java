import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GegevensTest {


    @Test
    public void spelerGegevensTest(){
    Gegevens a = new Gegevens();
    assertTrue(a.spelerMagSpelen("Ken", 123456));
    assertTrue(a.spelerMagSpelen("Ken", null));
    assertFalse(a.spelerMagSpelen(null, null));
    assertTrue(a.spelerMagSpelen(null,456789));

    }

}
