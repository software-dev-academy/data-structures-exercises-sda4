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
		
		table.put(tom, new Address("Sveavagen"));
		table.put(jim, new Address("Lindstedtsvagen"));
		
		// it's possible that:
		// tom.hashCode() == jim.hashCode()
		
	}

	public static void main(String[] args) {
		
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

}
