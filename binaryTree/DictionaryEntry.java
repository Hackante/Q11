import java.util.ArrayList;

public class DictionaryEntry implements DataElement {
    private String word;
    private ArrayList<String> meanings;

    public DictionaryEntry() {

    }
    
    public DictionaryEntry(String word, ArrayList<String> meanings) {
        this.word = word;
        this.meanings = meanings;
    }

    @Override
    public DataElement getData() {
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<String> getMeanings() {
        return this.meanings;
    }

    public void setMeanings(ArrayList<String> meanings) {
        this.meanings = meanings;
    }
    
    public void addMeaning(String meaning) {
        meanings.add(meaning);
    }
    
    public void removeMeaning(String meaning) {
        meanings.remove(meaning);
    }
    
    @Override
    public boolean istGleich(String vergleich) {
        return this.word.compareTo(vergleich) == 0 ? true : false;
    }
    
    @Override
    public boolean istKleinerAls(String vergleich) {
        return this.word.compareTo(vergleich) < 0 ? true : false;
    }
    
    @Override
    public boolean istGrößerAls(String vergleich) {
        return this.word.compareTo(vergleich) > 0 ? true : false;
    }
}
