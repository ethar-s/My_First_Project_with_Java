import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        int hour = minutes / 60;
        int reminder = minutes % 60;
        System.out.println(hour + " hours and " + reminder + " minutes");
        scanner.close();
    }
}