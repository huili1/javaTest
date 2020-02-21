package api;

public class Show {

    private int showId;

    private String showName;

    public Show(int showId, String showName) {
        this.showId = showId;
        this.showName = showName;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
}
