package am.aca.ITFinder.comman.model;

import java.util.Date;

/**
 * Created by Armen on 10/18/2016.
 */
public class Event {
    private Integer ID;
    private String location;
    private Date date;
    private String about;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

        Event event = (Event) o;

        if (!ID.equals(event.ID)) return false;
        if (!location.equals(event.location)) return false;
        if (!date.equals(event.date)) return false;
        return about.equals(event.about);

    }

    @Override
    public int hashCode() {
        int result = ID.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + about.hashCode();
        return result;
    }

    public Event(Integer ID, String location, Date date, String about) {
        this.ID = ID;
        this.location = location;
        this.date = date;
        this.about = about;
    }
}
