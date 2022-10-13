import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest {
    //@Test
    public void testPrepend() {
        LinkedList root1 = new LinkedList();

        root1.prepend(2);
        root1.prepend(5);
        root1.prepend(8);
        System.out.println(root1.toString());

        assertEquals("8 5 2 ", root1.toString());
    }

    //@Test
    public void testAppend() {
        LinkedList root1 = new LinkedList();
        
        root1.append(2);
        root1.append(5);
        root1.append(8);
        root1.append(12);
        root1.append(15);

        assertEquals("2 5 8 12 15 ", root1.toString());
    }

    //@Test
    public void testFirst() {
        LinkedList root1 = new LinkedList();

        root1.append(2);
        root1.append(5);
        root1.append(8);

        assertEquals(2, root1.first());
    }

    //@Test
    public void testLast() {
        LinkedList root1 = new LinkedList();

        root1.append(2);
        root1.append(5);
        root1.append(8);

        assertEquals(8, root1.last());
    }

    //@Test
    public void testToString() {
        LinkedList root1 = new LinkedList();

        root1.append(2);
        root1.append(5);
        root1.append(8);

        assertEquals("2 5 8 ", root1.toString());
    }

    @Test
    public void testLength() {
        LinkedList root1 = new LinkedList();

        root1.append(2);
        root1.append(5);
        root1.append(8);

        assertEquals(3, root1.length());
    }
}