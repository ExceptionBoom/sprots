package plm.beans;

public class Announcement {
    private Integer id;

    private Integer sportsId;

    private String title;

    private String localed;

    private Boolean state;

    private Integer sportsManagerId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSportsId() {
        return sportsId;
    }

    public void setSportsId(Integer sportsId) {
        this.sportsId = sportsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocaled() {
        return localed;
    }

    public void setLocaled(String localed) {
        this.localed = localed;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getSportsManagerId() {
        return sportsManagerId;
    }

    public void setSportsManagerId(Integer sportsManagerId) {
        this.sportsManagerId = sportsManagerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}