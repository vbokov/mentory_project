import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first, second, action, result, a;

        System.out.println("Enter first number: ");
        first = sc.nextDouble();
        System.out.println("Enter second number: ");
        second = sc.nextDouble();
        System.out.println("Select operation (1 - Divide, 2 - Multiple, 3 - Add, 4 - Subtraction ): ");
        action = sc.nextDouble();

        if (action == 1) {
            result = first / second;
            System.out.println(result);
        }
        if (action == 2) {
            result = first * second;
            System.out.println(result);
        }
        if (action == 3) {
            result = first + second;
            System.out.println(result);
        }
        if (action == 4) {
            result = first - second;
            System.out.println(result);

        }
    }
}