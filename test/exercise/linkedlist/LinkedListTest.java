package exercise.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList();
    }

    @AfterEach
    void tearDown() {
        linkedList = null;
    }

    @Test
    void addValue() {
        int expected = 105;
        linkedList.addValue(105);
        assertEquals(expected, linkedList.getValue(0));
    }

    @Test
    void addToEmptyLinkedList() {
        Node expectedNode = new Node(303, null);
        linkedList.add(expectedNode);
        assertEquals(expectedNode, linkedList.get(0));
    }

    @Test
    void addToNonEmptyLinkedList() {
        Node someNode = new Node(101, null);
        linkedList.add(someNode);
        Node expectedNode = new Node(303, null);
        linkedList.add(expectedNode);
        assertEquals(expectedNode, linkedList.get(1));
    }

    @Test
    void addToNonEmptyLinkedListWithMoreThanOneNode() {
        Node firstNode = new Node(909, null);
        linkedList.add(firstNode);
        Node someNode = new Node(101, null);
        linkedList.add(someNode);
        Node expectedNode = new Node(303, null);
        linkedList.add(expectedNode);
        assertEquals(expectedNode, linkedList.get(2));
    }

    @Test
    void getValue() {
        int expected = 202;
        linkedList.addValue(expected);
        assertEquals(expected, linkedList.getValue(0));
    }

    @Test
    void get() {
        Node expectedNode = new Node(303, null);
        linkedList.add(expectedNode);
        assertEquals(expectedNode, linkedList.get(0));
    }

    @Test
    void positiveIndexOutOfBoundException() {
        Node newNode = new Node(303, null);
        linkedList.add(newNode);
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.getValue(1));
    }

    @Test
    void negativeIndexOutOfBoundException() {
        Node newNode = new Node(303, null);
        linkedList.add(newNode);
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.getValue(-1));
    }
}
