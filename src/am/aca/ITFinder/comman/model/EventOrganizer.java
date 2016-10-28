package am.aca.ITFinder.comman.model;

/**
 * Created by Armen on 10/18/2016.
 */
public class EventOrganizer {
    private Integer ID;
    private String firstName;
    private String lastName;
    private String about;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

        EventOrganizer that = (EventOrganizer) o;

        if (!ID.equals(that.ID)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;
        return about.equals(that.about);

    }

    @Override
    public int hashCode() {
        int result = ID.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + about.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EventOrganizer{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", about='" + about + '\'' +
                '}';
    }

    public EventOrganizer(Integer ID, String firstName, String lastName, String about) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.about = about;
    }
}
