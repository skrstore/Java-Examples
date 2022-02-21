class ThrowsExample {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        int a = 12;
        if (a == 12) {
            throw new IllegalAccessException("demo");
        }
    }

    static void Check() throws IllegalAccessException {
        System.out.println("Inside the Check Method");
        try{
            throw IllegalAccessException("Check Excepton");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        try {
            // Check();
            throwOne();
        } catch (Exception e) {
            System.out.println("Exception Error" + e);
        }
    }
}