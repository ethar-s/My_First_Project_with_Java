import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();
        firstNumber--;
        secondNumber--;
        thirdNumber--;
        fourthNumber--;
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber);
    }
}