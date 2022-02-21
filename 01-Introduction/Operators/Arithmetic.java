class Arithmetic {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators");
        // 1.1 Basic Arithmetic Operators
        // 1.2 Modulus Operator
        // 1.3 Compound Assignment Operators
        // 1.4 Increment And Decrement Operators

        basicArithmetic();
        modulus();
        compoundAssignment();
        incrementAndDecrement();
    }

    public static void basicArithmetic() {
        // Arithmetic using integers
        System.out.println("\nInteger Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.print("a = " + a);
        System.out.print("\tb = " + b);
        System.out.print("\tc = " + c);
        System.out.print("\td = " + d);
        System.out.print("\te = " + e);
        // arithmetic using doubles
        System.out.println("\n\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.print("da = " + da);
        System.out.print("\tdb = " + db);
        System.out.print("\tdc = " + dc);
        System.out.print("\tdd = " + dd);
        System.out.print("\tde = " + de);
    }

    public static void modulus() {
        System.out.println("\n\nModulus Operator ");
        int x = 42;
        double y = 42.25;
        System.out.print("x mod 10 = " + x % 10);
        System.out.print("\ty mod 10 = " + y % 10);
    }

    public static void compoundAssignment() {
        System.out.println("\n\nCompound Assignment Operators");
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.print("a = " + a);
        System.out.print("\tb = " + b);
        System.out.print("\tc = " + c);
    }

    public static void incrementAndDecrement() {
        System.out.println("\n\nIncrement And Decrement Operators");
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        System.out.print("a = " + a);
        System.out.print("\ta++ = " + a++);
        System.out.print("\tb = " + b);
        System.out.print("\t++b = " + ++b);
        System.out.print("\tc = " + c);
        System.out.print("\tc-- = " + c--);
        System.out.print("\td = " + d);
        System.out.print("\t--d = " + --d);
    }
}