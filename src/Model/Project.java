package Model;

public class Project {
    private String projectName;
    private String projectNumber;
    private String projectDescription;

    Project(String projectName, String projectNumber, String projectDescription) {
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
}
