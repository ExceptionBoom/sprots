package plm.beans;

import java.util.Date;

public class SportsManager {
    private Integer id;

    private String account;

    private String password;

    private Date registrationTime;

    private Integer cloudManagerId;

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

    public Integer getCloudManagerId() {
        return cloudManagerId;
    }

    public void setCloudManagerId(Integer cloudManagerId) {
        this.cloudManagerId = cloudManagerId;
    }
}