import org.junit.Test;
import sn.groupeisi.Factoriel;

import static org.junit.Assert.assertEquals;

public class TestFactoriel {
    @Test
    public void testFactoriel() {
        assertEquals(1, Factoriel.factoriel(0));
        assertEquals(1, Factoriel.factoriel(1));
        assertEquals(720, Factoriel.factoriel(6));
        assertEquals(120, Factoriel.factoriel(5));
        assertEquals(24, Factoriel.factoriel(4));
        assertEquals(6, Factoriel.factoriel(3));
        assertEquals(2, Factoriel.factoriel(2));
        assertEquals(1, Factoriel.factoriel(1));
    }
}
