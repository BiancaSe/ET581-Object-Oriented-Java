import java.util.Scanner;

public class ReverseStringAndVowels {       //declaring public class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating scanner for user input 

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();   //Stores the full line of text in the variable 'input'.

        // Print original string
        System.out.println("Original string: " + input);

        // Reverse the string using a for loop and charAt()
        String reversed = "";                               /*  Initializes an empty string 'reversed' that will 
                                                              be used to store the reversed version of the input.*/          
        for (int i = input.length() - 1; i >= 0; i--) {      //for loop goes through the original string from the last character to the first.
            reversed += input.charAt(i);                    //gets the character at index i.
        }

        // Print reversed string
        System.out.println("Reversed (for loop): " + reversed);

        // Optional: Count vowels (a, e, i, o, u)
        int vowelCount = 0;                     //initialize a counter to keep track of the vowels in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i)); //converts the character to lowercase
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;  //checks if the character is a vowel, if so it increses 'vowelCount' by 1
            }
        }

        // Print number of vowels
        System.out.println("Number of vowels: " + vowelCount);

        sc.close(); // Close scanner
    }
}
