package exercise.linkedlist;

public class LinkedList {

	// storage for elements
	Node first;
	
	public LinkedList() {
		first = null;
	}
	
	/**
	 * Adds an integer to the end of this list.
	 *
	 * @param i the integer to addValue
	 */
	public void addValue(int i) {
		Node newNode = new Node(i, null);
		add(newNode);
	}

	/**
	 * Add a node to the list
	 *
	 * @param node Node to be added
	 */
	public void add(Node node) {

		if (first == null) { // list is empty
			first = node;
		} else { // list is not empty
			// 1. step find the last node
			Node current = first;

			while (current.next != null) {
				// current is not the last node!
				current = current.next;
			}
			// current.next == null
			// that means that current is the last node! YAY! :-)

			// 2. step insert new node
			current.next = node;
		}
	}

	/**
	 * Return element at given index.
	 * 
	 * @param index
	 * @return element at index
	 * @throws {@link IndexOutOfBoundsException} if index is negative
	 */
	public int getValue(int index) {
		return get(index).elem;
	}

    /**
     * Get Node at index
     * @param index Index of Node

     * @return {@link Node} at the given index
     */
    public Node get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node current = first;

        while (index != i && current.next != null) {
            i++;
            current = current.next;
        }

        if (index <= i) {
            // here, we are at the right place!
            return current;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
	
	public void printAll() {
		if (first == null) { // list is empty
			System.out.print("<empty>");
		} else {
			// we know that first is not null!
			System.out.print("[");
		
			Node current = first;
			while (current.next != null) {
				System.out.print(current.elem + ",");
				current = current.next;
			}
			// print last element
			System.out.print(current.elem);
		
			System.out.print("]");
		}
	}
}
