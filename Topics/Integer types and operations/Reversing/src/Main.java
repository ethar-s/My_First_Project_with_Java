import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int thirdNumber = number % 10;
        int secondNumber = (number % 100) / 10;
        int firstNumber = (number / 100) ;
        System.out.println(firstNumber+ (secondNumber * 10) + thirdNumber * 100);
    }
}