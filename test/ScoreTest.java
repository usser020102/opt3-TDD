import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void scoreMetVrijeworpErbij() {
        Score s = new Score();
        assertTrue(s.vrijeWorp(2,true));
        assertFalse(s.vrijeWorp(2,false));
        assertFalse(s.vrijeWorp(3,false));
        assertTrue(s.vrijeWorp(3,true));

    }
}

