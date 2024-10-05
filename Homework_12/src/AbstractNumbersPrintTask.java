public abstract class AbstractNumbersPrintTask implements Task {
    protected int from;
    protected int to;

    public AbstractNumbersPrintTask(int from, int to) {
        if (to > from && to >= 0 && from >= 0) {
            this.from = from;
            this.to = to;
        } else {
            this.from = 0;
            this.to = 0;
        }
    }

    @Override
    public abstract void complete();
}
