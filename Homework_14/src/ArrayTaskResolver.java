import java.util.Arrays;

public class ArrayTaskResolver {
    public static void resolveTask(int[] array, ArrayTask[] task, int from, int to){
        if (from < array.length && to < array.length && from < to) {
            System.out.println(Arrays.toString(array));
            System.out.println("from = "+from+", to = "+to);
            for (ArrayTask arrayTask : task) {
                System.out.println(arrayTask.resolve(array, from, to));
            }
        } else {
            System.out.println("Некорректные значения from и to");
        }
    }
}
