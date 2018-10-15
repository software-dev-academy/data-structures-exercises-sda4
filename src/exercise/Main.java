package exercise;

import exercise.linkedlist.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.addValue(5);
		
		int res = l.getValue(0);
		System.out.println("res: " + res);
		
		l.addValue(7);
		
		int res2 = l.getValue(1);
		System.out.println("res2: " + res2);
		
		l.printAll();
	}

}
