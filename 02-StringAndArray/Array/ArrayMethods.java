import java.util.Arrays;

class ArrayMethods {
    public static void main(String[] args) {
        int a[];
        // = { 34, 23, 12, 2, 5, 3, 7 };

        if (true) {
            a = new int[5];
            a[0] = 34;
            a[1] = 23;
            a[2] = 12;
            a[3] = 2;
            a[4] = 5;
        }

        Arrays.sort(a);

        System.out.println(a[0]);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}