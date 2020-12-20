package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Data {
    private ObservableList<Timecard> timecards = FXCollections.observableArrayList();
    private ObservableList<Project> projects = FXCollections.observableArrayList();
    private ObservableList<Task> tasks = FXCollections.observableArrayList();

    public void newTimecard(Timecard timecard) {
        timecards.add(timecard);
    }

    public void newProject(Project project) {
        projects.add(project);
    }

    public void newTask(Task task) {
        tasks.add(task);
    }

    public void deleteTimecard(Timecard timecard) {
        timecards.remove(timecard);
    }

    public void deleteProject(Project project) {
        projects.remove(project);
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
    }

    public void search(String searchTxt) {

    }
}
