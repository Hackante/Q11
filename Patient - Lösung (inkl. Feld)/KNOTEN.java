public class KNOTEN {
    private PATIENT patient;
    private KNOTEN nachfolger;

    public KNOTEN(PATIENT patient)
    {
        this.patient = patient;
    }

    public KNOTEN(PATIENT patient, PATIENT nachfolger)
    {
        this.patient = patient;
        this.nachfolger = new KNOTEN(nachfolger);
    }

    public PATIENT getPatient() {
        return this.patient;
    }

    public KNOTEN getNachfolger() {
        return this.nachfolger;
    }

    public void setNachfolger(PATIENT nachfolger) {
        this.nachfolger = new KNOTEN(nachfolger);
    }

    public void setNachfolger(KNOTEN nachfolger) {
        this.nachfolger = nachfolger;
    }
}
