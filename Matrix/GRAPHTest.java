

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse GRAPHTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GRAPHTest
{
    /**
     * Konstruktor fuer die Test-Klasse GRAPHTest
     */
    public GRAPHTest()
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
    
    @Test
    public void nikolaus() {
        GRAPH graph = new GRAPH(5);
        
        // Knoten einfügen
        graph.knotenEinfügen("a");
        graph.knotenEinfügen("b");
        graph.knotenEinfügen("c");
        graph.knotenEinfügen("d");
        graph.knotenEinfügen("e");
        
        // Kanten erstellen
        graph.kantenEinfügen(1, 2, 1);
        graph.kantenEinfügen(1, 3, 1);
        graph.kantenEinfügen(1, 4, 1);
        graph.kantenEinfügen(1, 5, 1);
        
        graph.kantenEinfügen(2, 3, 1);
        graph.kantenEinfügen(2, 4, 1);
        graph.kantenEinfügen(2, 5, 1);
        
        graph.kantenEinfügen(3, 4, 1);
        
        assertEquals(graph.istEulersch(), false);
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
}
