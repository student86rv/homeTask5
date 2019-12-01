package ua.epam.homeTask5;

public class RemoveDuplicates {
    public int removeDuplicates(int[] arr) {

        int newIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[newIndex]) {
                newIndex++;
                arr[newIndex] = arr[i];
            }
        }
        return newIndex + 1;
    }
}
