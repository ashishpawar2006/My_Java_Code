import java.util.Scanner;

public class LoopOperation {
    int number;

    // Constructor
    LoopOperation(int n) {
        number = n;
    }

    void setNumber(int n) {
        number = n;
    }

    void forloopmethod() {
        int last = number + 10;
        int sum = 0;
        for (int i = number; i <= last; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of next 10 numbers from " + number + " to " + last + " :- " + sum);
    }

    void whileloopmethod() {
        int last = number + 10;
        int sum = 0;
        int i = number;
        while (i <= last) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of next 10 numbers from " + number + " to " + last + " :- " + sum);
    }

    void dowhileloopmethod() {
        int last = number + 10;
        int sum = 0;
        int i = number;
        do {
            sum = sum + i;
            i++;
        } while (i <= last);
        System.out.println("Sum of next 10 numbers from " + number + " to " + last + " :- " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LoopOperation obj1 = new LoopOperation(0); // Initialize with default value
        String next = "yes";

        while (next.equalsIgnoreCase("yes")) {
            System.out.println("\t### LOOP OPERATION ###\t");
            System.out.println("1) For Loop Operation");
            System.out.println("2) While Loop Operation");
            System.out.println("3) Do While Loop Operation");
            System.out.println("4) Exit");
            System.out.print("Enter your choice operation to perform (1-4):- ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your number :- ");
                    int num1 = sc.nextInt();
                    obj1.setNumber(num1);
                    obj1.forloopmethod();
                    break;

                case 2:
                    System.out.print("Enter your number :- ");
                    int num2 = sc.nextInt();
                    obj1.setNumber(num2);
                    obj1.whileloopmethod();
                    break;

                case 3:
                    System.out.print("Enter your number :- ");
                    int num3 = sc.nextInt();
                    obj1.setNumber(num3);
                    obj1.dowhileloopmethod();
                    break;

                case 4:
                    System.out.println("You Are Exited");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid Choice! Please enter 1-4.");
            }

            System.out.print("Do you want to continue? (yes/no) :- ");
            next = sc.next();
        }

        System.out.println("Thank you For Performing Operation");
        sc.close();
    }
}

