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
    public void add( int index, int value ) {
        // Implement, create a new Node for this entry.

        Node n = new Node( value );

        // Implement the rest
    }

    /**
     * Remove an elmeent from the list at position index, if it exists.
     *
     * @param index
     */
    public void remove( int index ) {
        // Implement, remove the corresponding node from the linked list.
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("SinglyLinkedList{size=").append(size).append("}");

        Node current = this.head;
        while ( current != null ) {
            sb.append(" ");
            sb.append( current.value );
            current = current.next;
        }

        return sb.toString();
    }
}
