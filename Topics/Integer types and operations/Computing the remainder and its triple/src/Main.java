import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int remain = input % 2;
        System.out.println(remain);
        // The second operation goes here
        System.out.println(remain * 3);
        scanner.close();
    }
}