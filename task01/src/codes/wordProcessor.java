package codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordProcessor {
    
    public String read(String fileName) throws IOException {
        FileReader r = new FileReader("./" + fileName); 
        BufferedReader br = new BufferedReader(r);

        String line, result="";

        while((line = br.readLine()) != null) {
            result += line + " ";
        }
        return result;
    }
    
    public List<String> removePunctToList(String sentence) {

        sentence = sentence.replaceAll("\\p{Punct}", "").toLowerCase();
        sentence = sentence.replace("—", "").toLowerCase();
        String[] array1 = sentence.split(" ");
        List<String> wordList = Arrays.asList(array1);
        List<String> wordList2 = new ArrayList<> ();

        for (String s: wordList) {
            if (!(s.equals(" ") || s.equals("")  )) {
                wordList2.add(s);
            } else {continue;}
        }

        return wordList2;
    }

    public List<wordFreq> wordFreqList(List<String> list1) {
        
        List<wordFreq> wordFreq1 = new ArrayList<>();
        Integer count;

        Set<String> set = new HashSet<>(list1);
        List<String> uniqueList = new ArrayList<>(set);

        int listLength = list1.size(), setLength = uniqueList.size();

        for (int i =0; i < setLength; i++) {
            count = 0;
            String word = uniqueList.get(i);
           for (int j=0; j< listLength; j++) {
            if (word.equals(list1.get(j))) {
                count +=1;
            }
           }
           wordFreq1.add(new wordFreq(word, count));
        }

        return wordFreq1;
    }




}
