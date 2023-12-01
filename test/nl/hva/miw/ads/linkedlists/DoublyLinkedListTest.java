package nl.hva.miw.ads.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListTest {

    @Test
    public void add() {
        DoublyLinkedList l = new DoublyLinkedList();
        System.out.println(l);

        l.add(0, 400);
        l.add(0, 100);
        l.add(1, 200);
        l.add(2, 300);
        l.add(4, 500);

        String expected = "DoublyLinkedList{size=5} 100 200 300 400 500";
        String actual = l.toString();
        assertEquals(expected, actual);
    }
}