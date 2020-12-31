package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Data {
    private static ObservableList<Timecard> timecards = FXCollections.observableArrayList();
    private static ObservableList<Task> tasks = FXCollections.observableArrayList();

    public static void addTimecard(Timecard timecard) {

        timecards.add(timecard);
    }

    public static void saveTask(String taskName, String taskNumber, String taskDescription) {
        Task newTask = new Task(taskName, taskNumber, taskDescription);
        tasks.add(newTask);
    }


    public static void deleteTimecard(Timecard timecard) {

        timecards.remove(timecard);
    }

    public static void deleteTask(Task task) {

        tasks.remove(task);
    }

    public ObservableList<Timecard> getAllTimecards() {

        return Data.timecards;
    }

    public static ObservableList<Task> getAllTasks() {

        return Data.tasks;
    }

    public static void modify(int row, String taskName, String taskNumber, String taskDescription) {
        Task modifiedTask = new Task(taskName, taskNumber, taskDescription);
        tasks.set(row, modifiedTask);
    }

    public void search(String searchTxt) {

    }
}
