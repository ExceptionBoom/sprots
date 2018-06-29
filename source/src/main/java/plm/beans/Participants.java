package plm.beans;

import java.util.Date;

public class Participants {
    private Integer id;

    private String account;

    private String password;

    private Date registrationTime;

    private String name;

    private String sex;

    private String qq;

    private Integer identificationTag;

    private Integer sportsGroupUnitId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getIdentificationTag() {
        return identificationTag;
    }

    public void setIdentificationTag(Integer identificationTag) {
        this.identificationTag = identificationTag;
    }

    public Integer getSportsGroupUnitId() {
        return sportsGroupUnitId;
    }

    public void setSportsGroupUnitId(Integer sportsGroupUnitId) {
        this.sportsGroupUnitId = sportsGroupUnitId;
    }
}