import java.util.*;

class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push(10);
		s.push("aaa");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search("A"));
	}
}
