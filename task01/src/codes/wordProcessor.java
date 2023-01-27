package codes;

public class wordProcessor {
    
    public String removePunct(String sentence) {

        return sentence.replaceAll("\\p{Punct}", "");
    }

}
