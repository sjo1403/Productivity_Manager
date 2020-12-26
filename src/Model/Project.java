package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Project {
    private String projectName;
    private String projectNumber;
    private String projectDescription;
    private ObservableList<Task> associatedTasks = FXCollections.observableArrayList();

    public Project(String projectName, String projectNumber, String projectDescription) {
        setProjectName(projectName);
        setProjectNumber(projectNumber);
        setProjectDescription(projectDescription);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void addAssociatedTasks(ObservableList<Task> addedTasks) {

        associatedTasks.setAll(addedTasks);
    }

    public ObservableList<Task> getAssociatedTasks() {

        return associatedTasks;
    }
}
