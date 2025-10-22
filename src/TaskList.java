import java.util.ArrayList;
import java.util.List;

public class TaskList {
    public List<Task> items;

    public TaskList() {
        this.items = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        this.items.add(new Task(title, description));
    }
}