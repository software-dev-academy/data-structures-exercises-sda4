package exercise;

public class Main {

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
