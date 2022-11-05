

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse WARTESCHLANGETest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WARTESCHLANGETest
{
    /**
     * Konstruktor fuer die Test-Klasse WARTESCHLANGETest
     */
    public WARTESCHLANGETest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void rekursiveMethoden()
    {
        SONG sONG1 = new SONG("BigBillBroonzy", "BabyPleaseDontGo", 180.0, 2.5, 1980, 0.0);
        SONG sONG2 = new SONG("BlindBlake", "EarlyMorningBlues", 250, 5, 1930, 35);
        KNOTEN kNOTEN1 = new KNOTEN(sONG1);
        KNOTEN kNOTEN2 = new KNOTEN(sONG2);
        WARTESCHLANGE wARTESCH1 = new WARTESCHLANGE();
        wARTESCH1.einfügen(kNOTEN1);
        wARTESCH1.einfügen(kNOTEN2);
        assertEquals(2, wARTESCH1.getLänge());
        assertEquals(3.75, wARTESCH1.getDurchschnittsbewertung(), 0.1);
    }
}

