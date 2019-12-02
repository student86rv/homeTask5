package ua.epam.homeTask5;

import java.util.LinkedList;

public class RotateLinkedList {

    public LinkedList<Integer> rotateList(LinkedList<Integer> list, int index) {
        if (list != null && index <  list.size()) {
            for (int i = index; i < list.size(); i++) {
                Integer temp = list.getLast();
                list.removeLast();
                list.addFirst(temp);
            }
        }
        return list;
    }
}
