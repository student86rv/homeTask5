package ua.epam.homeTask5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToBSTTest {

    @Test
    public void testConvert() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 1, 2, 2, 3, 3, 4));
        TreeSet<Integer> result = new TreeSet<Integer>(Arrays.asList(0, 1, 2, 3, 4));

        ArrayToBST converter = new ArrayToBST();

        assertEquals(converter.convert(list), result);
    }

    @Test
    public void testConvertNull() {
        TreeSet<Integer> emptySet = new TreeSet<Integer>();

        ArrayToBST converter = new ArrayToBST();

        assertEquals(converter.convert(null), emptySet);
    }
}
