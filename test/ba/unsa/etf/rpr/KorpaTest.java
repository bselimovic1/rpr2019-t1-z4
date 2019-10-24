package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    Artikl[] art = new Artikl[50];
    Korpa korpa = new Korpa();
    @Test
    void getArtikli() {
        Artikl[] artikli = new Artikl[50];
        artikli[0]= new Artikl("jabuka",123,"1");
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(artikli[0]);
        assertArrayEquals(korpa.getArtikli(),artikli);

    }

    @Test
    void izbaciArtiklSaKodom() {

    }

    @Test
    void dodajArtikl() {
        Artikl a= new Artikl("mis",25,"6");
//        korpa.dodajArtikl(a);
        assertEquals(true,korpa.dodajArtikl(a));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        korpa.dodajArtikl( new Artikl("monitor",2000,"1"));
        korpa.dodajArtikl( new Artikl("centralna",1000,"2"));
        assertEquals(3000,korpa.dajUkupnuCijenuArtikala());
    }
}