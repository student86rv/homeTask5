package ua.epam.homeTask5;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotateLinkedListTest {

    @Test
    public void testRotateList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }

        LinkedList<Integer> expectedResult = new LinkedList<Integer>(Arrays.asList(4, 5, 1, 2, 3));

        RotateLinkedList rotateLinkedList = new RotateLinkedList();
        LinkedList<Integer> result = rotateLinkedList.rotateList(list, 3);

        assertEquals(result, expectedResult);
    }
}
