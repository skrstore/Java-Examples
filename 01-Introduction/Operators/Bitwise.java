class Bitwise {
    public static void main(String args[]) {
        // 2. Bitwise Operators

        byte a = 10; // 00001010
        byte b = 20; // 00010100
        byte c = -10;
        byte d = -20;
        System.out.println("\nValue of a, b, c, d are : " + a + ", " + b + ", " + c + ", " + d);

        // 2.1 Basic Bitwise Operators (~, &, |, ^)
        System.out.println("\nBasic bitwise operatos");
        System.out.println("~a : " + ~a + " a ^ b : " + (a ^ b));
        System.out.println("~c : " + ~c + " c ^ d : " + (c ^ d));

        // 2.2 Bitwise Shifting operators(<<, >>, >>>)
        System.out.println("\nBitwise Shifting Operators");
        System.out.println("c >> 3 : " + (c >> 3));

        // 2.3 Bitwise Compound Assignment Operators(&=, |=, ^=, <<=, >>=, >>>=)
        System.out.println("\nBitwise Compound Assignment Operators");
        a |= b; // a = a | b;
        System.out.println("New a after a|= b : " + a);
    }
}