package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {


    @Test
    void getNaziv() {
        Artikl art = new Artikl("Helikopter",1234,"1");
        assertEquals("Helikopter",art.getNaziv());

    }

    @Test
    void getCijena() {
        Artikl art = new Artikl("Avion",3456,"5");
        assertEquals(3456,art.getCijena());
    }

    @Test
    void getKod() {
        Artikl art = new Artikl("Neko ime",3531,"3");
        assertEquals("3",art.getKod());
    }

}