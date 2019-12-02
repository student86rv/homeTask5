package ua.epam.homeTask5;

import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        int[] inputArr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength = 5;

        int[] inputArr2 = {1, 1, 2};
        int expectedLength2 = 2;

        RemoveDuplicates remove = new RemoveDuplicates();

        assertEquals(remove.removeDuplicates(inputArr), expectedLength);
        assertEquals(remove.removeDuplicates(inputArr2), expectedLength2);
    }
}
