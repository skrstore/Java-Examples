import java.util.Locale;

class Main {
    public static void main(String[] args) {
        String name = "Admin";
        System.out.printf("Name : %s%n", name);
        System.out.printf("Name : %-30s'%n", name);
        System.out.printf("Name : %15.10s%n", name);
        System.out.printf("Name : %.10s%n", name);
        System.out.printf("Name : %.10S", name);

        System.out.printf(Locale.US, "%n%,d %n", 10000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000);
        System.out.printf("%07d%n", 12345);

        System.out.printf("'%-15.2f'", 12345.12345);
    }
}

// %d for decimal Integers
// %f for floating Points
// %s for string
// %b for boolean
// %t for date/time values

// RESOURCES:
// https://www.baeldung.com/java-printstream-printf
// https://www.geeksforgeeks.org/java-string-format-examples/
