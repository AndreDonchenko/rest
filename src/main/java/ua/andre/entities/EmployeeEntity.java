package ua.andre.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by andre on 05.03.17.
 */
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private String phone;
    private Double salary;
    private String photoFileName;
    private PositionEntity positionId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "salary")
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "photo_fn")
    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (photoFileName != null ? !photoFileName.equals(that.photoFileName) : that.photoFileName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (photoFileName != null ? photoFileName.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "position_id", referencedColumnName = "position_name")
    public PositionEntity getPositionId() {
        return positionId;
    }

    public void setPositionId(PositionEntity positionId) {
        this.positionId = positionId;
    }
}
