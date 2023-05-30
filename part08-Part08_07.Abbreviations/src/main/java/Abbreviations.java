import java.util.HashMap;
public class Abbreviations {

    private HashMap<String, String> mapping;

    public Abbreviations(){
        this.mapping = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        mapping.put(sanitizedString(abbreviation), explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return mapping.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        abbreviation = sanitizedString(abbreviation);
        return this.mapping.get(abbreviation);
    }

    public static String sanitizedString(String string){
        if (string == null){
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
    public void printKeys() {

        for (String e : this.mapping.keySet()) {
            System.out.println(e);
        }
    }
}
