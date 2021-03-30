package lesson25.model;

import lesson25.interfaces.IList;

public class MyLinkedList implements IList {
    private Node first;
    private Node last;
    private int size;

    @Override
    public boolean add(Object obj) {
        Node newNode = new Node(last, obj, null);
        if (last != null)
            last.next = newNode;
        else
            first = newNode;
        last = newNode;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        Node node = getNodeByIndex(index);
        return node == null ? null : node.element;
    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public Object remove(int index) {
        Node node = getNodeByIndex(index);
        if (node == null)
            return null;

        return unlink(node);
    }

    private Object unlink(Node node) {
        size--;
        if (node.next == null) {
            last.prev.next = null;
            last = last.prev;
            return node.element;
        }
        if (node.prev == null) {
            first.next.prev = null;
            first = first.next;
            return node.element;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node.element;
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index < 0)
            return false;
        remove(index);
        return true;
    }

    @Override
    public int indexOf(Object obj) {
        int index = 0;
        if (obj == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.element == obj)
                    return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int index = size - 1;
        if (obj == null) {
            for (Node x = last; x != null; x = x.prev) {
                if (x.element == obj)
                    return index;
                index--;
            }
        } else {
            for (Node x = last; x != null; x = x.prev) {
                if (obj.equals(x.element))
                    return index;
                index--;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.element == obj)
                    return true;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.element))
                    return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        Node x = first;
        for (int i = 0; i < result.length; i++) {
            result[i] = x.element;
            x = x.next;
        }
        return result;
    }

    @Override
    public void clear() {

    }
}

