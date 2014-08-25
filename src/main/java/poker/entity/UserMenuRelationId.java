package poker.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Timestamp;

/**
 * TUserMenuRelationId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class UserMenuRelationId implements java.io.Serializable {

    // Fields

    private Long uid;
    private Long mid;
    private Timestamp lastUpdate;

    // Constructors

    /**
     * default constructor
     */
    public UserMenuRelationId() {
    }

    /**
     * full constructor
     */
    public UserMenuRelationId(Long uid, Long mid, Timestamp lastUpdate) {
        this.uid = uid;
        this.mid = mid;
        this.lastUpdate = lastUpdate;
    }

    // Property accessors

    @Column(name = "uid")
    public Long getUid() {
        return this.uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Column(name = "mid")
    public Long getMid() {
        return this.mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    @Column(name = "last_update", length = 19)
    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof UserMenuRelationId))
            return false;
        UserMenuRelationId castOther = (UserMenuRelationId) other;

        return ((this.getUid() == castOther.getUid()) || (this.getUid() != null
                && castOther.getUid() != null && this.getUid().equals(
                castOther.getUid())))
                && ((this.getMid() == castOther.getMid()) || (this.getMid() != null
                && castOther.getMid() != null && this.getMid().equals(
                castOther.getMid())))
                && ((this.getLastUpdate() == castOther.getLastUpdate()) || (this
                .getLastUpdate() != null
                && castOther.getLastUpdate() != null && this
                .getLastUpdate().equals(castOther.getLastUpdate())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getUid() == null ? 0 : this.getUid().hashCode());
        result = 37 * result
                + (getMid() == null ? 0 : this.getMid().hashCode());
        result = 37
                * result
                + (getLastUpdate() == null ? 0 : this.getLastUpdate()
                .hashCode());
        return result;
    }

}