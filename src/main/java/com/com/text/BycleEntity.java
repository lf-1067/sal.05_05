package com.com.text;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bycle", schema = "sal", catalog = "")
public class BycleEntity {
    private int id;
    private String name;
    private Set<PersonEntity> bye;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BycleEntity that = (BycleEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "per")
    public Set<PersonEntity> getBye() {
        return bye;
    }

    public void setBye(Set<PersonEntity> bye) {
        this.bye = bye;
    }
}
