package codes;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

    public static void main(String [] args) throws IOException {

        String content, fileName = args[0] ;
        wordProcessor wp = new wordProcessor();

        content = wp.read(fileName);

        List<String> wordList = wp.removePunctToList(content);
        List<wordFreq> wordFreq1 = wp.wordFreqList(wordList);
        List<wordFreq> sortedList = wordFreq1.stream().sorted(Comparator.comparing(wordFreq::getCount).reversed())
                                            .collect(Collectors.toList());

        System.out.printf("\nTotal amount of words in the file is %d.\n", wordList.size());
        float amount = wordList.size(); 

        System.out.println("\nTop 10 words are below:");
        System.out.println("Word         Term Frequency Value");
        for(int i= 0; i<10; i++) {
            System.out.printf("%s,                  %.4f\n",
                              sortedList.get(i).getWord(), (sortedList.get(i).getCount())/amount );
            // System.out.printf("Word: %s, Term Frequency Value: %.4f\n",sortedList.get(i).getWord(), (sortedList.get(i).getCount())/amount );

        }


    }




}