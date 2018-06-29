package plm.beans;

public class Item {
    private Integer id;

    private Integer sportsManagerId;

    private String name;

    private String sex;

    private String property;

    private String category;

    private Boolean spiltTrack;

    private Integer useTrackNumber;

    private Integer groupParticipantsNumber;

    private String resultFormat;

    private String sort;

    private String groupTime;

    private Boolean save;

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

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getSpiltTrack() {
        return spiltTrack;
    }

    public void setSpiltTrack(Boolean spiltTrack) {
        this.spiltTrack = spiltTrack;
    }

    public Integer getUseTrackNumber() {
        return useTrackNumber;
    }

    public void setUseTrackNumber(Integer useTrackNumber) {
        this.useTrackNumber = useTrackNumber;
    }

    public Integer getGroupParticipantsNumber() {
        return groupParticipantsNumber;
    }

    public void setGroupParticipantsNumber(Integer groupParticipantsNumber) {
        this.groupParticipantsNumber = groupParticipantsNumber;
    }

    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getGroupTime() {
        return groupTime;
    }

    public void setGroupTime(String groupTime) {
        this.groupTime = groupTime;
    }

    public Boolean getSave() {
        return save;
    }

    public void setSave(Boolean save) {
        this.save = save;
    }
}