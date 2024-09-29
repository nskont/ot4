package ot4_1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KirjahyllyTest {

    private Kirjahylly kirjahylly;

    @Before
    public void setUp() {
        kirjahylly = new Kirjahylly();
    }

    @Test
    public void lisaaKirja() {
        kirjahylly.lisaaKirja("Hyva kirja");
        assertEquals("Hyva kirja", kirjahylly.viimeksiLisatty());
    }

    @Test
    public void onkoKirjaHyllyssa() {
        kirjahylly.lisaaKirja("tosi hyva kirja");
        assertTrue(kirjahylly.onkoKirjaHyllyssa("tosi hyva kirja"));
        assertFalse(kirjahylly.onkoKirjaHyllyssa("huono kirja"));
    }
}