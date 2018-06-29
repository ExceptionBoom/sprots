package plm.beans;

public class SportsDevideGroup {
    private Integer id;

    private Integer sportsId;

    private Integer athletesEnrollId;

    private String sportsGroupItemId;

    private Integer trackNumber;

    private Integer itemGroupNumber;

    private Integer competitionNumber;

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

    public Integer getAthletesEnrollId() {
        return athletesEnrollId;
    }

    public void setAthletesEnrollId(Integer athletesEnrollId) {
        this.athletesEnrollId = athletesEnrollId;
    }

    public String getSportsGroupItemId() {
        return sportsGroupItemId;
    }

    public void setSportsGroupItemId(String sportsGroupItemId) {
        this.sportsGroupItemId = sportsGroupItemId;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Integer getItemGroupNumber() {
        return itemGroupNumber;
    }

    public void setItemGroupNumber(Integer itemGroupNumber) {
        this.itemGroupNumber = itemGroupNumber;
    }

    public Integer getCompetitionNumber() {
        return competitionNumber;
    }

    public void setCompetitionNumber(Integer competitionNumber) {
        this.competitionNumber = competitionNumber;
    }
}