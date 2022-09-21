public class WARTEZIMMER
{
    private int anzahl;
    private PATIENT[] warteschlange;
    
    public WARTEZIMMER() {
        anzahl = 0;
        warteschlange = new PATIENT[10];
    }
    
    public void hinsetzen(PATIENT p) {
        // alle Plätze durchgehen bis ein freier Platz da ist
        int i = 0;
        while(warteschlange[i] != null && i < warteschlange.length) {
            i++;
        }
        warteschlange[i] = p;
        anzahl++;
    }
    
    public PATIENT drankommen() {
        // nächster Patient kommt dran
        PATIENT erster = warteschlange[0];
        warteschlange[0] = null;
        // und anderer Taxis rücken auf
        for(int i = 0; i < warteschlange.length - 1; i++) {
            warteschlange[i] = warteschlange[i+1];
        }       
        anzahl--;
        return erster;
    }
    
    public int getAnzahl() {
        return anzahl;        
    }
}