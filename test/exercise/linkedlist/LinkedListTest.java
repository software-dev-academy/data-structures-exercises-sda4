package exercise.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

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
    void add() {
        Node expectedNode = new Node(303, null);
        linkedList.add(expectedNode);
        assertEquals(expectedNode, linkedList.get(0));
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
    void outOfBoundException() {
        Node newNode = new Node(303, null);
        linkedList.add(newNode);
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.getValue(1));
    }
}
