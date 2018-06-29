package plm.beans;

import java.util.Date;

public class Sports {
    private Integer id;

    private Integer sportsManagerId;

    private Integer spaceId;

    private Integer sportsOrganzationCommitteeId;

    private String name;

    private String location;

    private String hostUnit;

    private String organizeUnit;

    private Date startDate;

    private Date endDate;

    private String sportsManagerName;

    private String sportsManagerPhone;

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

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public Integer getSportsOrganzationCommitteeId() {
        return sportsOrganzationCommitteeId;
    }

    public void setSportsOrganzationCommitteeId(Integer sportsOrganzationCommitteeId) {
        this.sportsOrganzationCommitteeId = sportsOrganzationCommitteeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHostUnit() {
        return hostUnit;
    }

    public void setHostUnit(String hostUnit) {
        this.hostUnit = hostUnit;
    }

    public String getOrganizeUnit() {
        return organizeUnit;
    }

    public void setOrganizeUnit(String organizeUnit) {
        this.organizeUnit = organizeUnit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSportsManagerName() {
        return sportsManagerName;
    }

    public void setSportsManagerName(String sportsManagerName) {
        this.sportsManagerName = sportsManagerName;
    }

    public String getSportsManagerPhone() {
        return sportsManagerPhone;
    }

    public void setSportsManagerPhone(String sportsManagerPhone) {
        this.sportsManagerPhone = sportsManagerPhone;
    }
}