package plm.beans;

public class Judgement {
    private Integer id;

    private Integer sportsManagerId;

    private String name;

    private Boolean sex;

    private String unit;

    private String phone;

    private String position;

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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}