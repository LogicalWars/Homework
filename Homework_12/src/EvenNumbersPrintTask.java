public class EvenNumbersPrintTask extends AbstractNumbersPrintTask{
    public EvenNumbersPrintTask(int from, int to) {
        super(from, to);
    }

    @Override
    public void complete() {
        System.out.print("Четные числа в диапозоне от " + from + " до " + to + ":");
        for (int i = from; i - from < (to - from + 1); i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println("");
    }
}
