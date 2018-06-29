package plm.beans;

import java.util.Date;

public class SportsUnit extends SportsUnitKey {
    private String name;

    private Date startData;

    private Date endData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(Date endData) {
        this.endData = endData;
    }
}