// ET 581 Homework 4,  2D array & nested loops. Part 3:  Student: Bianca Serpe

import java.util.StringTokenizer; //Importing the StringTokenizer class which is used in the code to split the string Hello World

public class ReverseWords { //Defining the public class, the main container for the code
    public static void main(String[] args) {
        String sentence = "Hello World";
        StringTokenizer tokenizer = new StringTokenizer(sentence); //using a ST to split string into words/tokens

        while (tokenizer.hasMoreTokens()) { //
            String word = tokenizer.nextToken();
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}

    

