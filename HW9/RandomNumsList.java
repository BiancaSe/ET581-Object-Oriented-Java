
// ET 581 HW9 Problem 1 Student : Bianca Serpe Date: 11/08/2025


// For simoplicity all code is in one file. I was not sure if you wanted separate files for each class.
// I hope this is acceptable.

import java.util.*;  // import List, ArrayList, Iterator, Random


// This creates a list of 20 random integers between 1 and 100

public class RandomNumsList {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();

        // making a list of 20 random numbers between 1 and 100
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }

        System.out.println("Original List: " + list);

        // making even and odd lists from the original list
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        //using a for loop to separate even and odd numbers
        for (int n : list) {
            if (n % 2 == 0)
                evens.add(n);
            else
                odds.add(n);
        }

        System.out.println("Even Numbers: " + evens);
        System.out.println("Odd Numbers: " + odds);

        //  remove numbers less than 10 from the original list
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() < 10)
                it.remove();
        }
// this prints the modified original list
        System.out.println("After removing numbers < 10: " + list);
    }
}

