import java.util.*;

class HashMapDemo {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("rajat", 100);
		h.put("abhishek", 100);
		h.put("aditya", 100);
		System.out.println(h);

		Map.

		// Set s = h.keySet();
		// System.out.println(s);

		// Collection c = h.values();
		// System.out.println(c);

				Set s1 = h.entrySet();
		System.out.println(s1);

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "------" + m1.getValue());
			if (m1.getKey().equals("rajat")) {
				m1.setValue("rohit TeamLead");
			}
		}
		System.out.println(s1);
	}
}
