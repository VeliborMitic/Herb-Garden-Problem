import java.util.Scanner;

public class Util {

    public static int indexOfMaxArrayElement(int[] array) {
        int indexOfMaxElement = 0;
        int j = array.length - 1;
        for (int i = 0; i <= j;) {
            int tempIndex = array[i] >= array[j] ? i : j;
            indexOfMaxElement = array[tempIndex] > array[indexOfMaxElement] ? tempIndex : indexOfMaxElement;
            i++; j--;
        }
        return indexOfMaxElement;
    }

    public static boolean isValidArrayLenght(int [] plants) {
        return ((plants.length >= 1 && plants.length <= 10));
    }

    public static boolean isValidNumOfDays(int daysNum){
        return (daysNum >= 1 && daysNum <= 100);
    }

    public static boolean isValidNumberOfLeaves(int [] plants){
        for (int i = 0; i < plants.length; i++)
            if (!(plants[i] >= 0 && plants[i] <= 10000)) {
                return false;
            }
        return true;
    }

}
