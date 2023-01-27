package codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{

    public static void main(String [] args) {

        String test = "It is a far, far better thing that I do, than I have eer done; it is a far, far...";

        wordProcessor wp = new wordProcessor();

        System.out.println("Before removal> " + test);

        test = wp.removePunct(test);
        System.out.println("After removal > " + test);

        String[] array1 = test.split(" ");
        List<String> wordList = Arrays.asList(array1);
        System.out.println(wordList);


        Set<String> set = new HashSet<>();

        set.addAll(wordList);
        System.out.println("Below is after conversion to set.");
        System.out.println(set);


    }




}