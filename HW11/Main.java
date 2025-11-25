// ET581 Homework 11 - Student: Bianca Serpe Date 11/25/2025


import java.util.*;
import java.util.stream.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // -----------------------------
        // Task 1: Filter Even Numbers + Skip First Two
        // -----------------------------
        System.out.println("=== Task 1: Filter Even Numbers + Skip First Two ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Filter even numbers, skip first two, then print
        numbers.stream()
               .filter(n -> n % 2 == 0)   // keep only even numbers
               .skip(2)                   // skip the first 2 even numbers
               .forEach(n -> System.out.println(n)); // print each

        // -----------------------------
        // Task 2: Sum Using reduce()
        // -----------------------------
        System.out.println("\n=== Task 2: Sum Using reduce() ===");
        List<Integer> nums2 = Arrays.asList(10, 20, 30, 40);

        // Use reduce to sum all numbers
        int sum = nums2.stream()
                       .reduce(0, (a, b) -> a + b); // add numbers together
        System.out.println("Sum: " + sum);

        // -----------------------------
        // Task 3: Count Words Containing "a"
        // -----------------------------
        System.out.println("\n=== Task 3: Count Words Containing 'a' ===");
        List<String> words = Arrays.asList("apple", "banana", "dog", "cat", "hello");

        // Filter words that contain 'a' and count them
        long count = words.stream()
                          .filter(w -> w.contains("a"))  // keep words with 'a'
                          .count();
        System.out.println("Count: " + count);

        // -----------------------------
        // Task 4-7: Streams + Custom Class
        // -----------------------------
        System.out.println("\n=== Task 4-7: Person Stream Operations ===");

        List<Person> people = Arrays.asList(
            new Person("Alice", 20),
            new Person("Bob", 17),
            new Person("Charlie", 22),
            new Person("David", 17),
            new Person("Anna", 30)
        );

        // Task 4: Filter adults (age >= 18)
        System.out.println("\nAdults:");
        people.stream()
              .filter(p -> p.getAge() >= 18) // age check
              .forEach(p -> System.out.println(p)); // print adult persons

        // Task 5: Extract names
        System.out.println("\nNames only:");
        people.stream()
              .map(p -> p.getName()) // get only names
              .forEach(n -> System.out.println(n)); // print names

        // Task 6: Group people by age
        Map<Integer, List<Person>> groups = people.stream()
                .collect(Collectors.groupingBy(Person::getAge)); // group by age
        System.out.println("\nGrouped by age:");
        System.out.println(groups);
    }
}
