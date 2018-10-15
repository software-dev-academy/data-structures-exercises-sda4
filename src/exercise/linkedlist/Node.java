package exercise.linkedlist;

public class Node {

    private int elem;
    private Node next;

    public Node(int i, Node n) {
        elem = i;
        next = n;
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
