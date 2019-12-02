package ua.epam.homeTask5;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class PartitionLinkedListTest {

    @Test
    public void testPartitionList() {

        LinkedList<Integer> input = new LinkedList<Integer>(Arrays.asList(1, 4, 3, 2, 5, 2));
        int value = 3;

        PartitionLinkedList partitionLinkedList = new PartitionLinkedList();


        LinkedList<Integer> expected = new LinkedList<Integer>(Arrays.asList(1, 2, 2, 4, 3, 5));
        assertEquals(partitionLinkedList.partitionList(input, value), expected);
    }
}
