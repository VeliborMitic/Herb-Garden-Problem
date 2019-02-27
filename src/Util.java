import java.util.Scanner;

public class Util {

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
