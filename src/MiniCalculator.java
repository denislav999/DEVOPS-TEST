import java.util.Scanner;

public class MiniCalculator {

    public static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return Double.NaN;
                }
                return a / b;
            case '%': return a % b;
            case '^': return Math.pow(a, b);
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MINI CALCULATOR ---");
            System.out.println("Enter: number operator number");
            // changed Example
            System.out.println("Example: 6 + 4");
            System.out.println("Operators: +  -  *  /  %  ^");
            //change for add-form branch
            System.out.println("Type 'exit' to quit");

            if (sc.hasNextDouble()) {
                double a = sc.nextDouble();
                char op = sc.next().charAt(0);
                double b = sc.nextDouble();

                double result = calculate(a, b, op);

                if (!Double.isNaN(result)) {
                    System.out.println("Result = " + result);
                }
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    running = false;
                } else {
                    System.out.println("Invalid input!");
                }
            }
        }

        System.out.println("Calculator closed.");
        sc.close();
    }
}
