import java.util.*;

class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.size());
		ll.add("a");
		ll.add(10);
		ll.add(10.6);
		ll.addFirst("rajat");
		ll.addLast("anu");
		System.out.println("original content :" + ll);
		System.out.println(ll.size());
		ll.remove(10.6);
		ll.remove(0);
		System.out.println("after deletion content :" + ll);
		System.out.println(ll.size());
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deletion of first and last :" + ll);
		int a = (Integer) ll.get(0);
		ll.set(0, a + "rajat");
		System.out.println("ll after change:" + ll);
	}
};
