package plm.beans;

public class VolunteerPosition {
    private Integer id;

    private Integer sportsManagerId;

    private String name;

    private String description;

    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSportsManagerId() {
        return sportsManagerId;
    }

    public void setSportsManagerId(Integer sportsManagerId) {
        this.sportsManagerId = sportsManagerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}