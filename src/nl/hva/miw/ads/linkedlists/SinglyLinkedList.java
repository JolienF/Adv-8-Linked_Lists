package nl.hva.miw.ads.linkedlists;

/**
 * Singly linked list.
 *
 * @author michel
 */
public class SinglyLinkedList {

    private class Node {
        int value;

        Node next = null;      // Link to next node

        public Node(int value) {
            this.value = value;
        }
    }

    private int size = 0;           // Length of list
    private Node head = null;      // Link to first node

    public SinglyLinkedList() {
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
        if (index < 0 || index > (size - 1)) {
            return Integer.MIN_VALUE;
        }

        Node node1 = head;
        for (int node = 0; node < index; node++) {
            node1 = node1.next;
        }

        return node1.value;
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
            n.next = head;
            head = n;
            return;
        }

        Node current = head;
        for (int count = 0; count < (index -1); count++) {
            current = current.next;
        }

        n.next = current.next;
        current.next = n;
    }

    /**
     * Remove an element from the list at position index, if it exists.
     *
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index > (size - 1)) {
            System.err.println("Index is outside of list range");
            return;
        }

        size--;

        if (index == 0) {
            head = head.next;
        }

        Node current = head;
        if (index == size - 1) {
            for (int count = 0; count < index - 1; count++) {
                current = current.next;
            }

            current.next = null;
        }

        Node next = head.next;
        for (int count = 0; count < (index -1); count++) {
            current = current.next;
            next = head.next;
        }

        current.next = next.next;


        // Implement, remove the corresponding node from the linked list.
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("SinglyLinkedList{size=").append(size).append("}");

        Node current = this.head;
        while ( current != null ) {
            sb.append(" ");
            sb.append(current.value);
            current = current.next;
        }

        return sb.toString();
    }
}
