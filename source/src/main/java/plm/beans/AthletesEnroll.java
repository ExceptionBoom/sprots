package plm.beans;

public class AthletesEnroll {
    private Integer id;

    private Integer participantsId;

    private Integer competitionUnitManagerId;

    private Integer sportsGroupUnitId;

    private String name;

    private String sex;

    private Boolean judgeState;

    private String sportsGroupItemId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(Integer participantsId) {
        this.participantsId = participantsId;
    }

    public Integer getCompetitionUnitManagerId() {
        return competitionUnitManagerId;
    }

    public void setCompetitionUnitManagerId(Integer competitionUnitManagerId) {
        this.competitionUnitManagerId = competitionUnitManagerId;
    }

    public Integer getSportsGroupUnitId() {
        return sportsGroupUnitId;
    }

    public void setSportsGroupUnitId(Integer sportsGroupUnitId) {
        this.sportsGroupUnitId = sportsGroupUnitId;
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

    public Boolean getJudgeState() {
        return judgeState;
    }

    public void setJudgeState(Boolean judgeState) {
        this.judgeState = judgeState;
    }

    public String getSportsGroupItemId() {
        return sportsGroupItemId;
    }

    public void setSportsGroupItemId(String sportsGroupItemId) {
        this.sportsGroupItemId = sportsGroupItemId;
    }
}