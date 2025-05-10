import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations(){
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation){
        translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
        System.out.println("Contenu du dictionnaire après ajout : " + translations);
    }

    public ArrayList<String> translate(String word){
        if(translations.containsKey(word) && !translations.get(word).isEmpty()){
            return translations.get(word);
        } else {
            ArrayList<String> empty = new ArrayList<String>();
            return empty;
        }
    }

    public void remove(String word){
        if (translations.containsKey(word)){
            translations.remove(word); 
        }
        System.out.println("Contenu du dictionnaire après suppression : " + translations);
    }
}
