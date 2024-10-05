import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumIntRange(10, 10));
        int[] array = {2, 5, 1, 4, 7, 5};
        printEvenInArray(array);
        System.out.println(toInt(array));
    }

    public static int sumIntRange(int from, int to) {
        int sum = 0;
        if (to >= from) {
            for (int i = from; i <= to; i++) {
                sum += i;
            }
        } else {
            return -1;
        }
        return sum;
    }

    public static void printEvenInArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
    }

    public static int toInt(int[] a) {
        int number = 0;
        String num = "";
        for (int i = 0; i < a.length; i++) {
            num = num.concat(String.valueOf(a[i]));
        }
        number = Integer.valueOf(num);
        return number;
    }
}
