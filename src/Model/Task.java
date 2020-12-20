package Model;

public class Task {
    private String taskName;
    private String taskNumber;
    private String taskDescription;

    Task(String taskName, String taskNumber, String taskDescription) {
        setTaskName(taskName);
        setTaskNumber(taskNumber);
        setTaskDescription(taskDescription);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
