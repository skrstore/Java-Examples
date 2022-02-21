class DivideByZeroException {
    public static void main(String[] args) {
        System.out.println("Divide by Zero Exception");
        int a = 12;

        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
                //OR 
            //  } catch (Exception e) {
            System.out.println("number / 0\n" + e);
        } finally {
            System.out.println("After catch block");
        }
    }
}