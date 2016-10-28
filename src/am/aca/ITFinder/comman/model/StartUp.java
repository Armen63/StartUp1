package am.aca.ITFinder.comman.model;

/**
 * Created by Armen on 10/21/2016.
 */
public class StartUp {
    private Integer ID;
    private String name;
    private String developers;
    private String deadline;
    private String about;

    public StartUp(Integer ID, String name, String developers, String deadline, String about) {
        this.ID = ID;
        this.name = name;
        this.developers = developers;
        this.deadline = deadline;
        this.about = about;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StartUp startUp = (StartUp) o;

        if (!ID.equals(startUp.ID)) return false;
        if (!name.equals(startUp.name)) return false;
        if (!developers.equals(startUp.developers)) return false;
        if (!deadline.equals(startUp.deadline)) return false;
        return about.equals(startUp.about);

    }

    @Override
    public int hashCode() {
        int result = ID.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + developers.hashCode();
        result = 31 * result + deadline.hashCode();
        result = 31 * result + about.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StartUp{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", developers='" + developers + '\'' +
                ", deadline='" + deadline + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
