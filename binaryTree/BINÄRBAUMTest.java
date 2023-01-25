

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class BINÄRBAUMTest
{
    /**
     * Konstruktor fuer die Test-Klasse BINÄRBAUMTest
     */
    public BINÄRBAUMTest()
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
    public void suchen()
    {
        WÖRTERBUCHEINTRAG wÖRTERBU1 = new WÖRTERBUCHEINTRAG("apple", "Apfel");
        WÖRTERBUCHEINTRAG wÖRTERBU2 = new WÖRTERBUCHEINTRAG("future", "Zukunft");
        WÖRTERBUCHEINTRAG wÖRTERBU3 = new WÖRTERBUCHEINTRAG("kick", "Tritt");
        WÖRTERBUCHEINTRAG wÖRTERBU4 = new WÖRTERBUCHEINTRAG("open", "offen");
        WÖRTERBUCHEINTRAG wÖRTERBU5 = new WÖRTERBUCHEINTRAG("real", "echt");
        WÖRTERBUCHEINTRAG wÖRTERBU6 = new WÖRTERBUCHEINTRAG("table", "Tisch");
        WÖRTERBUCHEINTRAG wÖRTERBU7 = new WÖRTERBUCHEINTRAG("waddle", "watscheln");
        BINÄRBAUM bINÄRBAU1 = new BINÄRBAUM();
        bINÄRBAU1.einfügen(wÖRTERBU4);
        bINÄRBAU1.einfügen(wÖRTERBU2);
        bINÄRBAU1.einfügen(wÖRTERBU1);
        bINÄRBAU1.einfügen(wÖRTERBU3);
        bINÄRBAU1.einfügen(wÖRTERBU6);
        bINÄRBAU1.einfügen(wÖRTERBU5);
        bINÄRBAU1.einfügen(wÖRTERBU7);
        assertNotNull(bINÄRBAU1.suchen("apple"));
        assertNotNull(bINÄRBAU1.suchen("future"));
        assertNotNull(bINÄRBAU1.suchen("kick"));
        assertNotNull(bINÄRBAU1.suchen("open"));
        assertNotNull(bINÄRBAU1.suchen("real"));
        assertNotNull(bINÄRBAU1.suchen("table"));
        assertNotNull(bINÄRBAU1.suchen("waddle"));
        assertEquals(null, bINÄRBAU1.suchen("mercy"));
    }
}

