import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // created a scanner object "sc"
        System.out.println("Please input a sentence:"); // prompt user for input 
        String sentence = sc.nextLine();    // it reads a full line of input from the user and stores it in the variable sentence

        // 1. Print sentence length using .length()
        System.out.println("Sentence length: " + sentence.length());  //Uses .length() to print the total # of char in the sentance (also spaces and punctuation).

        // 2. Find index of "Java"
        int index = sentence.indexOf("Java"); // it looks to find the first word "Java" in the sentence.
        System.out.println("index is: " + index); // prints the index found in the previous step

        // 3. If the index is equal to -1 end main method
        if (index == -1) {
            System.out.println("terminate main method...");   //If "Java" is not found, it prints a message and exits the program using return.
            return; // exit main method and terminate program.
        }

        String subString = sentence.substring(index);  //it extracts the part of the sentence starting from "Java" to the end.
        System.out.println("Substring: " + subString);   // it prints the extracted substring.

        // 4. Tokenize substring
        StringTokenizer st = new StringTokenizer(subString);   
        String firstWord = st.nextToken();              // it extracts the first two words from the subString.
        String secondWord = st.nextToken();

        System.out.println("firstWord: " + firstWord);
        System.out.println("secondWord: " + secondWord);

        // 5. Word lengths and difference
        int len1 = firstWord.length();
        int len2 = secondWord.length();                     // it calculates the length of the first and second words using .length().
        System.out.println("first word length: " + len1);
        System.out.println("second word length: " + len2);

        // Compare lengths
        if (len1 > len2) {
            System.out.println("firstWord.length() > secondWord.length()");   
        } else {
            System.out.println("firstWord.length() <= secondWord.length()");     //it compares the lengths and prints which word is longer (or if they are equal).
        }

        // 6. Concatenated string
        String concatenated = firstWord.concat(secondWord);
        System.out.println("concatenated words: " + concatenated);   // it joins the two words together using .concat() and stores the result.

        // 7. Check if any word equals "Java"
        if (firstWord.equals("Java") || secondWord.equals("Java")) {
            System.out.println("One of the words is Java.");            // Checks if either word is exactly "Java" using .equals(); if yes, it prints a message

        }

        // 8. Switch statement on first word
        switch (firstWord) {                        //  switch statement that checks the value of firstWord
            case "Java":
                System.out.println("You like Java!");          // if it's "Java", it prints "You like Java!"
                break;
            case "Python":
                System.out.println("You like Python!");
                break;                                              // if it's "Phyton", it prints "You like Phyton"
            default:
                System.out.println("Other language detected");   // otherwise it prints this
        } 

        sc.close(); 
    }
}
