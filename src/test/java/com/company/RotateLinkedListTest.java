package com.company;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class RotateLinkedListTest {

    @Test
    public void testRotateLinkedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }

        int[] expectedResult = {4, 5, 1, 2, 3};
        RotateLinkedList rotateLinkedList = new RotateLinkedList();

        LinkedList<Integer> result = rotateLinkedList.rotateList(list, 3);

        //assertArrayEquals(result.toArray(), expectedResult);
    }
}
