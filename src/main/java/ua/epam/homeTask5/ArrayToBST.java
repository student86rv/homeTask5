package ua.epam.homeTask5;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayToBST {

    public TreeSet<Integer> convert(ArrayList<Integer> list) {

        TreeSet<Integer> set = new TreeSet<Integer>();

        if (list != null && list.size() != 0) {
            set.addAll(list);
        }
        return set;
    }
}
