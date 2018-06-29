package plm.beans;

import java.util.Date;

public class CompetitionUnit extends CompetitionUnitKey {
    private Integer sportsManagerId;

    private String account;

    private String password;

    private Date registrationTime;

    public Integer getSportsManagerId() {
        return sportsManagerId;
    }

    public void setSportsManagerId(Integer sportsManagerId) {
        this.sportsManagerId = sportsManagerId;
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
}