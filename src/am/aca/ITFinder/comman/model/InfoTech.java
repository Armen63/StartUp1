package am.aca.ITFinder.comman.model;

/**
 * Created by Armen on 10/18/2016.
 */
public class InfoTech {
    private Integer ID;
    private String headline;
    private String text;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfoTech infoTech = (InfoTech) o;

        if (!ID.equals(infoTech.ID)) return false;
        if (!headline.equals(infoTech.headline)) return false;
        return text.equals(infoTech.text);

    }

    @Override
    public int hashCode() {
        int result = ID.hashCode();
        result = 31 * result + headline.hashCode();
        result = 31 * result + text.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "InfoTech{" +
                "ID=" + ID +
                ", headline='" + headline + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
