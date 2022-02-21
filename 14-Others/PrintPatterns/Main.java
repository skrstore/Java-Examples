import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        takeChoice();
    }

    static void takeChoice() {
        Pattern pat = new Pattern();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your choice of Pattern");
        System.out.println("1 - Pattern 1");
        System.out.println("2 - Pattern 2");
        System.out.println("3 - Pattern 3");
        System.out.println("4 - Pattern 4");
        System.out.println("5 - Pattern 5");
        System.out.println("Any other digit to Exit");

        int choice = input.nextInt();

        switch (choice) {
        case 1:
            pat.pattern1();
            takeChoice();
            break;
        case 2:
            pat.pattern2();
            takeChoice();
            break;
        case 3:
            pat.pattern3();
            takeChoice();
            break;
        case 4:
            pat.pattern4();
            takeChoice();
            break;
        case 5:
            pat.pattern5();
            takeChoice();
            break;
        default:
            System.out.println("Exitting...");
        }
        input.close();
    }
}
