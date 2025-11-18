// ET581 Homework 10 Problem 1 Word Frequency Counter.     Student: Bianca Serpe Date: 11/17/2025


package problem1;

import java.util.*;



public class WordFrequencyMain {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Example sentence (you could also ask user input) 
        String sentence = "apple banana apple orange banana apple";

        // StringTokenizer breaks words based on spaces by default 
        StringTokenizer st = new StringTokenizer(sentence);

        // HashMap to store word counts 
        HashMap<String, Integer> map = new HashMap<>();

        // Process each token (word)
        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            // If word is already in map  then increase count
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                // Otherwise start at 1
                map.put(word, 1);
            }
        }

        // Print the results
        System.out.println("Word Frequencies:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
