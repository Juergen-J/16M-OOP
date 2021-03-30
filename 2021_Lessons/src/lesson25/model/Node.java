package lesson25.model;

public class Node {
    Object element;
    Node prev;
    Node next;

    public Node(Node prev, Object element, Node next) {
        this.prev = prev;
        this.element = element;
        this.next = next;
    }
}
