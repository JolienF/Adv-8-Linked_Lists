package nl.hva.miw.ads.linkedlists;

/**
 * Doubly linked list.
 *
 * @author michel
 */
public class DoublyLinkedList {

    private class Node {
        int value;

        Node next = null;      // Link to next node
        Node prev = null;      // Link to previous node

        public Node(int value) {
            this.value = value;
        }
    }

    private int size = 0;           // Length of list
    private Node head = null;      // Link to first node

    public DoublyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    /**
     * Return the value in the list at position index.
     *
     * @param index
     * @return
     */
    public int get( int index ) {
        if (index < 0 || index >= size) {
            return Integer.MIN_VALUE;
        }

        Node current = head;
        for (int count = 0; count <= index; count++) {
            current = current.next;
        }

        return current.value;
    }

    /**
     * Add an element to the list at position index.
     *
     * @param index
     * @param value
     */
    public void add(int index, int value) {
        if (index < 0 || index > (size)) {
            System.err.println("Index is outside of list range");
            return;
        }

        Node n = new Node(value);
        size++;

        if (index == 0) {
            if (head != null) {
                head.prev = n;
            }
            n.next = head;

            head = n;
            return;
        }

        Node current = head;
        for (int count = 0; count < index - 1; count++) {
            current = current.next;
        }

        n.next = current.next;
        n.prev = current;
        current.next = n;
        if (current.next != null) {
            current.next.prev = n;
        }
    }

    /**
     * Remove an elmeent from the list at position index, if it exists.
     *
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index >= (size)) {
            System.err.println("Index is outside of list range");
        }

        size--;

        if (index == 0) {
            head.next.prev = null;
            head = head.next;
        }

        Node current = head;
        for (int count = 0; count < (index -1); count++) {
            current = current.next;
        }

        current.next = current.next.next;
        current.next.next.prev = current;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("DoublyLinkedList{size=").append(size).append("}");

        Node current = this.head;
        while ( current != null ) {
            sb.append(" ");
            sb.append( current.value );
            current = current.next;
        }

        return sb.toString();
    }
}
