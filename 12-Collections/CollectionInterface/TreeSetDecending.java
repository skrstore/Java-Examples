import java.util.Comparator;
import java.util.TreeSet;

class TreeSetDecending{
    public static void main(String[] args) {
        System.out.println("Main Word");
        TreeSet<String> ts1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        ts1.add("Hello");
        ts1.add("World");
        System.out.println(ts1);
    }
}