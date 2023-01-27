package codes;

import java.util.Arrays;
import java.util.List;

public class wordProcessor {
    
    public List<String> removePunctToList(String sentence) {

        sentence = sentence.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] array1 = sentence.split(" ");
        List<String> wordList = Arrays.asList(array1);

        return wordList;
    }



}
