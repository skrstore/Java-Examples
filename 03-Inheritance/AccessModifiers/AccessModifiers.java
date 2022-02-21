import User.User;

class AccessModifiers {
    public static void main(String[] args) {
        User u1 = new User();

        System.out.println("Value of variables of User");
        // System.out.println("a : " + u1.a); // ERROR because u1.a is private
        System.out.println("b : " + u1.b);
        // System.out.println("c : " + u1.c); // ERROR because u1.c is protected
        // System.out.println("d : " + u1.d); // ERROR because u1.a is default
    }
}