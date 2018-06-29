package plm.beans;

public class AthletesResult {
    private Integer id;

    private Integer athletesEnrollId;

    private Integer sportsId;

    private Integer itemId;

    private String result;

    private String competitionTimeNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAthletesEnrollId() {
        return athletesEnrollId;
    }

    public void setAthletesEnrollId(Integer athletesEnrollId) {
        this.athletesEnrollId = athletesEnrollId;
    }

    public Integer getSportsId() {
        return sportsId;
    }

    public void setSportsId(Integer sportsId) {
        this.sportsId = sportsId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCompetitionTimeNumber() {
        return competitionTimeNumber;
    }

    public void setCompetitionTimeNumber(String competitionTimeNumber) {
        this.competitionTimeNumber = competitionTimeNumber;
    }
}