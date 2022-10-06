public class KNOTEN {
    private DatenElement patient;
    private KNOTEN nachfolger;

    public KNOTEN(DatenElement patient)
    {
        this.patient = patient;
    }

    public KNOTEN(DatenElement patient, DatenElement nachfolger)
    {
        this.patient = patient;
        this.nachfolger = new KNOTEN(nachfolger);
    }

    public DatenElement getPatient() {
        return this.patient;
    }

    public KNOTEN getNachfolger() {
        return this.nachfolger;
    }

    public void setNachfolger(DatenElement nachfolger) {
        this.nachfolger = new KNOTEN(nachfolger);
    }

    public void setNachfolger(KNOTEN nachfolger) {
        this.nachfolger = nachfolger;
    }

    public String ausgeben() {
        return patient.ausgeben();
    }
}
