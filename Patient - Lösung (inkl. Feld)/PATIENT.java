public class PATIENT implements DatenElement {
    private String name;
    private String krankheit;

    public PATIENT(String n, String k) {
        this.name = n;
        this.krankheit = k;
    }

    // Getter- und Setter-Methoden
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setKrankheit(String k) {
        krankheit = k;
    }

    public String getKrankheit() {
        return krankheit;
    }

    // Interface Stuff

    @Override
    public String ausgeben() {
        return String.format("%s, %s", this.name, this.krankheit);
    }
}