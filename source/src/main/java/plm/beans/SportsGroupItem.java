package plm.beans;

public class SportsGroupItem {
    private String id;

    private Integer sportsId;

    private Integer sportsGroupId;

    private Integer sportsItemId;

    private Integer unitLimitedItemNumber;

    private Integer competitionTimes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSportsId() {
        return sportsId;
    }

    public void setSportsId(Integer sportsId) {
        this.sportsId = sportsId;
    }

    public Integer getSportsGroupId() {
        return sportsGroupId;
    }

    public void setSportsGroupId(Integer sportsGroupId) {
        this.sportsGroupId = sportsGroupId;
    }

    public Integer getSportsItemId() {
        return sportsItemId;
    }

    public void setSportsItemId(Integer sportsItemId) {
        this.sportsItemId = sportsItemId;
    }

    public Integer getUnitLimitedItemNumber() {
        return unitLimitedItemNumber;
    }

    public void setUnitLimitedItemNumber(Integer unitLimitedItemNumber) {
        this.unitLimitedItemNumber = unitLimitedItemNumber;
    }

    public Integer getCompetitionTimes() {
        return competitionTimes;
    }

    public void setCompetitionTimes(Integer competitionTimes) {
        this.competitionTimes = competitionTimes;
    }
}