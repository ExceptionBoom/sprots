package plm.beans;

import java.util.Date;

public class SportsCompetitionSchedule {
    private Integer id;

    private Integer sportsId;

    private Integer competitionUnitId;

    private String sportsGroupItemId;

    private Date sportsItemStartTime;

    private Date sportsItemEndTime;

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

    public Integer getCompetitionUnitId() {
        return competitionUnitId;
    }

    public void setCompetitionUnitId(Integer competitionUnitId) {
        this.competitionUnitId = competitionUnitId;
    }

    public String getSportsGroupItemId() {
        return sportsGroupItemId;
    }

    public void setSportsGroupItemId(String sportsGroupItemId) {
        this.sportsGroupItemId = sportsGroupItemId;
    }

    public Date getSportsItemStartTime() {
        return sportsItemStartTime;
    }

    public void setSportsItemStartTime(Date sportsItemStartTime) {
        this.sportsItemStartTime = sportsItemStartTime;
    }

    public Date getSportsItemEndTime() {
        return sportsItemEndTime;
    }

    public void setSportsItemEndTime(Date sportsItemEndTime) {
        this.sportsItemEndTime = sportsItemEndTime;
    }
}