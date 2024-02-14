import java.util.Scanner;

public class Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static double logarithm(double num) {
        return Math.log(num);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers is undefined");
        }
        double result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Logarithm (base e)");
            System.out.println("6. Square Root");
            System.out.println("7. Factorial");
            System.out.println("8. Power");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            if (choice == 9) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            if (choice != 5 && choice != 6 && choice != 7) {
                System.out.print("Enter second number: ");
            }
            double num2 = 0;

            double result = 0;

            switch (choice) {
                case 1:
                    num2 = scanner.nextDouble();
                    result = add(num1, num2);
                    break;
                case 2:
                    num2 = scanner.nextDouble();
                    result = subtract(num1, num2);
                    break;
                case 3:
                    num2 = scanner.nextDouble();
                    result = multiply(num1, num2);
                    break;
                case 4:
                    num2 = scanner.nextDouble();
                    try {
                        result = divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    break;
                case 5:
                    result = logarithm(num1);
                    break;
                case 6:
                    result = squareRoot(num1);
                    break;
                case 7:
                    result = factorial((int)num1);
                    break;
                case 8:
                    num2 = scanner.nextDouble();
                    result = power(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
