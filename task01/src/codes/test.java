package codes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String [] args) {

        String test = "It is a far, far better thing that I do, than I have ever done;";
        String test2 = "It is a far, far better rest that I go to that I have ever known.";

        wordProcessor wp = new wordProcessor();

        List<String> wordList = wp.removePunctToList(test);
        System.out.println(wordList);
        System.out.printf("Size of wordList is %d.\n",wordList.size());
        List<String> wordList2 = wp.removePunctToList(test2);
        System.out.println(wordList2);
        System.out.printf("Size of wordList2 is %d.\n",wordList2.size());

        Set<String> set = new HashSet<>();

        set.addAll(wordList);
        System.out.println("Below is after conversion to set.");
        System.out.println(set);
        System.out.printf("Size of set is %d.\n",set.size());

        set.addAll(wordList2);
        System.out.println("Below set after adding wordList2.");
        System.out.println(set);
        System.out.printf("Size of set is %d.\n",set.size());

    }
}
