
/**
 * Beschreiben Sie hier die Klasse FAKULTÄT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FAKULTÄT
{
    public FAKULTÄT() {
        
    }
    
    public int berechneFakultätRekursiv(int n) {
        if(n < 2) {
            return 1;
        }
        else {
            return n * berechneFakultätRekursiv(n - 1);
        }
    }
    
    public int berechneFakultätIterativ(int n) {
        int res = 1;
        for(int i = n; i > 1; i--) {
            res *= i;
        }
        return res;
    }
}
