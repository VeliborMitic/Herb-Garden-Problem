public class InputValidation {

    public static boolean isValidArrayLenght(int [] plants) {
        return ((plants.length >= 1 && plants.length <= 10));
    }

    public static boolean isValidNumberOfLeaves(int [] plants){
        for (int i = 0; i < plants.length; i++)
            if (!(plants[i] >= 0 && plants[i] <= 10000)) {
                return false;
            }
        return true;
    }

    public static boolean isValidNumOfDays(int daysNum){
        return (daysNum >= 1 && daysNum <= 100);
    }
}
