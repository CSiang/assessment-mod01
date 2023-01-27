package codes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main{

    public static void main(String [] args) throws IOException {

        String content;
        wordProcessor wp = new wordProcessor();

        content = wp.read("road_not_taken.txt");

        List<String> wordList = wp.removePunctToList(content);
        System.out.println(wordList);
        System.out.printf("Size of wordList is %d.\n",wordList.size());

        List<wordFreq> wordFreq1 = wp.wordFreqList(wordList);
    
        System.out.println(wordFreq1);

        List<wordFreq> sortedList = wordFreq1.stream().sorted(Comparator.comparing(wordFreq::getCount).reversed()).collect(Collectors.toList());

        System.out.println("Below is the sorted list");
        System.out.println(sortedList);

        System.out.println("Top 10 words are below:");
        for(int i= 0; i<10; i++) {
            System.out.printf("Word: %s, count: %d\n",sortedList.get(i).getWord(), sortedList.get(i).getCount() );

        }


    }




}