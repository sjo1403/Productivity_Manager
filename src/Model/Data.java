package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Data {
    private static ObservableList<Timecard> timecards = FXCollections.observableArrayList();
    private static ObservableList<Project> projects = FXCollections.observableArrayList();

    public static void addTimecard(Timecard timecard) {

        timecards.add(timecard);
    }

    public static void addProject(Project project) {

        projects.add(project);
    }


    public void deleteTimecard(Timecard timecard) {

        timecards.remove(timecard);
    }

    public void deleteProject(Project project) {

        projects.remove(project);
    }

    public ObservableList<Timecard> getAllTimecards() {

        return Data.timecards;
    }

    public static ObservableList<Project> getAllProjects() {

        return Data.projects;
    }

    public void search(String searchTxt) {

    }
}
