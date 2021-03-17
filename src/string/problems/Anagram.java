package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter second string: ");
        String s2 = in.nextLine();

        boolean areAnagrams = false;
        if (s1.length() == s2.length()) {
            areAnagrams = true;
            for (int i = 0; i < s1.length(); i++) {
                int count1 = 0, count2 = 0;
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j))
                        ++count1;
                }
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j))
                        ++count2;
                }
                if (count1 != count2) {
                    areAnagrams = false;
                }
            }
        }

        if (areAnagrams) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}


