import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 4, 52, 24, 12, 553, 2};

        ArrayTask sumFromTo = (array1, from, to) -> {
            int count = 0;
            for (int i = from; i <= to; i++) {
                count += array1[i];
            }
            return count;
        };

        ArrayTask sumMaxDigitElementFromTo = (array2, from, to) -> {
            int max = 0;
            int[] array3 = new int[to - from + 1];
            for (int i = from; i <= to; i++) {
                array3[i - from] = array2[i];
            }
            for (int j : array3) {
                if (max < j) {
                    max = j;
                }
            }
            int sum = 0;
            while (max % 10 != 0) {
                sum += max % 10;
                max /= 10;
            }
            return sum;
        };

        ArrayTask[] arrayTasks = {sumFromTo, sumMaxDigitElementFromTo};

        ArrayTaskResolver.resolveTask(array, arrayTasks, 4, 6);
    }
}
