public abstract class ELEMENT
{
    abstract DATENELEMENT suchen(String gesuchtesWort);
    
    abstract ELEMENT einfügen(DATENELEMENT d); 
    
    abstract int getGröße();
    
    abstract int getTiefe(DATENELEMENT d);
}
