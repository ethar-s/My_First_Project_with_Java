import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHour = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSecond = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSecond = scanner.nextInt();
        int different = (secondHour * 3600 + secondMinutes * 60 + secondSecond) - (firstHour * 3600 + firstMinutes * 60 + firstSecond);
        System.out.println(different);
    }
}