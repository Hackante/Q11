/**
 * Abstrakte Klasse BAUMELEMENT - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class BAUMELEMENT
{
    public abstract DATENELEMENT suchen(String gesuchtesWort);
    
    public abstract BAUMELEMENT einfügen(DATENELEMENT neu);
}
