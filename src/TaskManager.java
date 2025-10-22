import java.util.ArrayList;
import java.util.List;

class TaskManager {

    private TaskList tasklist;

    public TaskManager() {
        this.tasklist = new TaskList();
    }

    public void addTask(String title, String description) {
        tasklist.addTask(title, description);
    }

    public TaskList getTasklist() {
        return tasklist;
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasklist.size()) {
            tasklist.get(index).setCompleted(true);
        }
    }
}