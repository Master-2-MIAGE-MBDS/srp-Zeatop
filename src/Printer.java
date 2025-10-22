public class Printer {

    public void printCompletedTasks(TaskList tasklist) {
        System.out.println("Taches terminees :");
        for (Task task : tasklist.items) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks(TaskList tasklist) {
        System.out.println("Taches non terminees :");
        for (Task task : tasklist.items) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}