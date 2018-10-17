package exercise;

class Person {
	String name;
	Person(String n) {
		name = n;
	}
}

class Address {
	String streetName;
	Address(String s) {
		streetName = s;
	}
}

public class Main {

	public static void hashTableExamples() {
		
		HashTable table = new HashTable();
		
		Person tom = new Person("Tom");
		Person jim = new Person("Jim");
		
		table.put(jim, new Address("Lindstedtsvagen"));
		table.put(tom, new Address("Sveavagen"));
		
		// it's possible that:
		// tom.hashCode() == jim.hashCode()
		
		// test 1
		Address a = (Address) table.get(tom);
		System.out.println("a: " + a.streetName);

		table.put(tom, new Address("Nygatan"));
		Address a2 = (Address) table.get(tom);
		System.out.println("a2: " + a2.streetName);
	}

	public static void linkedListTests() {
		LinkedList l = new LinkedList();
		l.add(5);
		
		int res = l.get(0);
		System.out.println("res: " + res);
		
		l.add(7);
		
		int res2 = l.get(1);
		System.out.println("res2: " + res2);
		
		l.printAll();

		System.out.println("\nsize: " + l.size());

		System.out.println();
		l.printAll2();
	}

	public static void main(String[] args) {
		hashTableExamples();
	}

}
