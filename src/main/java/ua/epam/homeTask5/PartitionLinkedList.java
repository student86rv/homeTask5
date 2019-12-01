package ua.epam.homeTask5;

import java.util.LinkedList;

public class PartitionLinkedList {

    public LinkedList<Integer> partitionList(LinkedList<Integer> list, int value) {
        LinkedList<Integer> smaller = new LinkedList<Integer>();

        if (list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < value) {
                    smaller.add(list.get(i));
                    list.remove(i);
                }
                smaller.addAll(list);
            }
        }
        return smaller;
    }
}
