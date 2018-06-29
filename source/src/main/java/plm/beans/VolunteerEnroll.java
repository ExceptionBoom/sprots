package plm.beans;

public class VolunteerEnroll {
    private Integer id;

    private Integer participantsId;

    private Integer organizationManagerId;

    private Integer volunteerPositionId;

    private Integer sportsId;

    private Boolean judgeState;

    private String describetion;

    private String note;

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

    public Integer getOrganizationManagerId() {
        return organizationManagerId;
    }

    public void setOrganizationManagerId(Integer organizationManagerId) {
        this.organizationManagerId = organizationManagerId;
    }

    public Integer getVolunteerPositionId() {
        return volunteerPositionId;
    }

    public void setVolunteerPositionId(Integer volunteerPositionId) {
        this.volunteerPositionId = volunteerPositionId;
    }

    public Integer getSportsId() {
        return sportsId;
    }

    public void setSportsId(Integer sportsId) {
        this.sportsId = sportsId;
    }

    public Boolean getJudgeState() {
        return judgeState;
    }

    public void setJudgeState(Boolean judgeState) {
        this.judgeState = judgeState;
    }

    public String getDescribetion() {
        return describetion;
    }

    public void setDescribetion(String describetion) {
        this.describetion = describetion;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}