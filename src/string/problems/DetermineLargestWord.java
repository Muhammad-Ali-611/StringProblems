package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    private static String WordGiven;

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findLargestWord(s);
        //implement
        int max = 0;
        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            if (entry.getKey() > max) {
                max = entry.getKey();
            }
        }
        System.out.println("Maximum length word is: " + wordNLength.get(max));

    }


    public static Map<Integer, String> findLargestWord  (String WordGiven){
                Map<Integer, String> wordNLength = new HashMap<Integer, String>();
                String st = "";
        String[] words = WordGiven.split(" ");
        for (String word : words) {
            wordNLength.put(word.length(), word);
        }
        return wordNLength;

    }
        }
