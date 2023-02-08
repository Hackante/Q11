import java.util.ArrayList;

public class ORDNER extends VERZEICHNISELEMENT {
    private String name;
    private ArrayList<VERZEICHNISELEMENT> nachfolger;
    
    public ORDNER(String name) {
        this.name = name;
        this.nachfolger = new ArrayList<VERZEICHNISELEMENT>();
    }
    
    public void add(VERZEICHNISELEMENT v) {
        nachfolger.add(v);
    }
}
