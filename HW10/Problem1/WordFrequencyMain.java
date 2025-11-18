// ET581 Homework 10 Problem 1 - Word Frequency Counter , Student : Bianca Serpe, Date: 11/17/2025

package problem1;

import java.util.*;


public class WordFrequencyMain {
    public static void main(String[] args) {

        // Example sentence (you could also ask user input) 
        String sentence = "apple banana apple orange banana apple";

        // StringTokenizer that breaks words based on spaces by default 
        StringTokenizer st = new StringTokenizer(sentence);

        // HashMap to store word counts 
        HashMap<String, Integer> map = new HashMap<>();

        // While loop process each token 
        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            // If the word is already in map, it increases count
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                // Otherwise it starts at 1
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





