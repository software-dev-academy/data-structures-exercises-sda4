package exercise.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {

    public static final int VALUE = 123;
    private Node node;
    private Node nextNode;

    @BeforeEach
    void setUp() {
        nextNode = new Node(400, null);
        node = new Node(VALUE, nextNode);
    }

    @AfterEach
    void tearDown() {
        node = null;
        nextNode = null;
    }

    @Test
    void getElem() {
        assertEquals(VALUE, node.getElem());
    }

    @Test
    void setElem() {
        int expected = 109;
        node.setElem(expected);
        assertEquals(expected, node.getElem());
    }

    @Test
    void getNext() {
        assertEquals(nextNode,node.getNext());
    }

    @Test
    void setNext() {
        nextNode = new Node(300,null);
        node.setNext(nextNode);
        assertEquals(nextNode,node.getNext());
    }
}
