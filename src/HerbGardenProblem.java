import java.util.stream.IntStream;

public class HerbGardenProblem {
    private int maxNumberOfLeavesHarvested = 0;

    public int calculateMaxLeaves(int[] plants, int days) {
        while (true) {
            if (InputValidation.isValidArrayLenght(plants)
                    && InputValidation.isValidNumberOfLeaves(plants)
                    && InputValidation.isValidNumOfDays(days)) {

                int maxIndex = Util.indexOfMaxArrayElement(plants);
                maxNumberOfLeavesHarvested += plants[maxIndex] / 2;
                plants[Util.indexOfMaxArrayElement(plants)] =
                        plants[maxIndex] - (plants[maxIndex] / 2);

                IntStream.range(0, plants.length).forEach(i -> plants[i] += 2);
                days--;
                if (days == 0) {
                    return maxNumberOfLeavesHarvested;
                }
                continue;
            }
            System.out.println("Constraints violation!");
            return 0;
        }
    }

    public static void main(String[] args) {

        int[] plants = {2, 7, 5, 3};
        int days = 3;

        HerbGardenProblem gardenProblem = new HerbGardenProblem();
        System.out.println(gardenProblem.calculateMaxLeaves(plants, days));
    }
}
