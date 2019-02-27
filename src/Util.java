import java.util.Scanner;

public class Util {

    // Find the max element of array
    /*public static int indexOfMaxArrayElement(int[] array) {
        int indexOfMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            indexOfMaxElement = array[i] > array[indexOfMaxElement] ? i : indexOfMaxElement;
        }
        return indexOfMaxElement;
    }*/

    public static int indexOfMaxArrayElement(int[] array) {
        int indexOfMaxElement = 0;
        int j = array.length - 1;
        for (int i = 0; i <= j;) {
            indexOfMaxElement = array[i] >= array[j] ? i : j;
            i++; j--;
        }
        return indexOfMaxElement;
    }
}
