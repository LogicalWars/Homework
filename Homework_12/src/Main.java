public class Main {
    public static void main(String[] args) {
        EvenNumbersPrintTask evenNumbersPrintTask = new EvenNumbersPrintTask(2, 10);
        OddNumbersPrintTask oddNumbersPrintTask = new OddNumbersPrintTask(2, 10);
        Task[] tasks = {evenNumbersPrintTask, oddNumbersPrintTask};

        completeAllTasks(tasks);
    }

    public static void completeAllTasks(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].complete();
        }
    }
}
