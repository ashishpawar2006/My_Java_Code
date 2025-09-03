import java.util.Scanner;

public class OperatorExample {
    double num1, num2;

    OperatorExample(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter your second number: ");
        double n2 = sc.nextDouble();

        OperatorExample obj = new OperatorExample(n1, n2);

        int choice;
        do {
            System.out.println("\n\t### Menu ###\n");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n0. Exit");

            System.out.print("Enter your choice of operation to perform (0-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    obj.sub();
                    break;
                case 3:
                    obj.mul();
                    break;
                case 4:
                    obj.div();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
            }
        } while (choice != 0);

        sc.close();
    }

    void add() {
        double result = num1 + num2;
        System.out.println("Addition = " + result);
    }

    void sub() {
        double result = num1 - num2;
        System.out.println("Subtraction = " + result);
    }

    void mul() {
        double result = num1 * num2;
        System.out.println("Multiplication = " + result);
    }

    void div() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double result = num1 / num2;
        System.out.println("Division = " + result);
    }
}

