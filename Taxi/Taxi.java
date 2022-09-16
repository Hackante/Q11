public class Taxi
{
    String kennzeichen;
    String fahrername;
    
    public Taxi(String Kennzeichen, String Fahrername) {
        this.kennzeichen = Kennzeichen;
        this.fahrername = Fahrername;
    }
   
    String getKennzeichen() {
        return this.kennzeichen;
    }
    
    String getFahrername() {
        return this.fahrername;
    }
    
    void setKennzeichen(String k) {
        this.kennzeichen = k;
    }
    
    void setFahrername(String f) {
        this.fahrername = f;
    }
}
