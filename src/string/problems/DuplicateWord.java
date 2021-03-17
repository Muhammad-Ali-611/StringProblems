package string.problems;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        public static void findDuplicates(String s)
        {
            StringTokenizer st = new StringTokenizer(s);
            HashMap<String,Integer> map = new HashMap<String, Integer>();

            while(st.hasMoreElements())
            {

                String item = st.nextToken();
                if(map.containsKey(item))
                {
                    map.put(item , map.get(item) + 1);
                }
                else
                {
                    map.put(item,1);
                }
            }
            map.forEach((key,value) -> {
                if(value > 1)
                {
                    System.out.println(key + "  " + value);
                }
            });
        }

        static  public float findAverageLength(String s)
        {
            StringTokenizer st = new StringTokenizer(s);
            int n  = 0;
            int len = 0;
            while(st.hasMoreElements())
            {
                len = len + st.nextToken().length();
                n++;
            }
            return len/n;
        }
        public static void main(String[] args)
        {
            String st = "java is a programming Language. java is also an Island of Indonesia. java is widely used language.";
            findDuplicates(st);
            System.out.println("Average Length is : " + findAverageLength(st));
        }

    }





