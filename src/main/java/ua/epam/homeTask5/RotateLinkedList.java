package ua.epam.homeTask5;

import java.util.LinkedList;

public class RotateLinkedList {

    public static void main(String[] args) {
        RotateLinkedList rotateLinkedList = new RotateLinkedList();

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 5 ; i++) {
            list.add(i);
        }

        LinkedList<Integer> result = rotateLinkedList.rotateList(list, 3);

        System.out.println(result);
    }

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
