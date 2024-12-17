import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        // Write your code for receiving user's name and age here.
        String greeting = "Hello, I am " +  sc.next() + "! I am " + sc.next() +" years old.";
        // Print the message using the user's name and age.
        System.out.println(greeting);
        sc.close();
    }
}