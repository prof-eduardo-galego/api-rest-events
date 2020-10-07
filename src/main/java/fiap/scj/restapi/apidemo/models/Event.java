package fiap.scj.restapi.apidemo.models;

import java.util.Date;

public class Event {

    private Integer id;
    private String description;
    private Date startIn;
    private Date endId;
    private Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartIn() {
        return startIn;
    }

    public void setStartIn(Date startIn) {
        this.startIn = startIn;
    }

    public Date getEndId() {
        return endId;
    }

    public void setEndId(Date endId) {
        this.endId = endId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
