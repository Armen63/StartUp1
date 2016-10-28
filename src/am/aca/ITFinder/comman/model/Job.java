package am.aca.ITFinder.comman.model;

import java.util.Date;

/**
 * Created by Armen on 10/18/2016.
 */
public class Job {
    private Integer ID;
    private String company;
    private String profession;
    private String description;
    private String requiredSkills;
    private String requiredLanguages;
    private Date deadLine;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getRequiredLanguages() {
        return requiredLanguages;
    }

    public void setRequiredLanguages(String requiredLanguages) {
        this.requiredLanguages = requiredLanguages;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (!ID.equals(job.ID)) return false;
        if (!company.equals(job.company)) return false;
        if (!profession.equals(job.profession)) return false;
        if (!description.equals(job.description)) return false;
        if (!requiredSkills.equals(job.requiredSkills)) return false;
        if (!requiredLanguages.equals(job.requiredLanguages)) return false;
        return deadLine.equals(job.deadLine);

    }

    @Override
    public int hashCode() {
        int result = ID.hashCode();
        result = 31 * result + company.hashCode();
        result = 31 * result + profession.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + requiredSkills.hashCode();
        result = 31 * result + requiredLanguages.hashCode();
        result = 31 * result + deadLine.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Job{" +
                "ID=" + ID +
                ", company='" + company + '\'' +
                ", profession='" + profession + '\'' +
                ", description='" + description + '\'' +
                ", requiredSkills='" + requiredSkills + '\'' +
                ", requiredLanguages='" + requiredLanguages + '\'' +
                ", deadLine=" + deadLine +
                '}';
    }
}
