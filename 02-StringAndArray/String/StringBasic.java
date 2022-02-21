class StringBasic {
    public static void main(String[] args) {
        System.out.println("Basic of Strings");

        String s1 = "This ";
        String s2 = "is text";
        String s = "This is text";
        String text = s1 + s2;

        int a = 10;

        System.out.println("String Concatenation with Integer type");
        System.out.println(s + " " + a);
        System.out.println(text);

        String nullText = null;
        System.out.println(nullText);
    }
}