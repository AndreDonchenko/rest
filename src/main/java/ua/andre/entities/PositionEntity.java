package ua.andre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by andre on 05.03.17.
 */
@Entity
@Table(name = "position")
public class PositionEntity {
    private String positionName;

    @Id
    @Column(name = "position_name")
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionEntity that = (PositionEntity) o;

        if (positionName != null ? !positionName.equals(that.positionName) : that.positionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return positionName != null ? positionName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return positionName;
    }
}
