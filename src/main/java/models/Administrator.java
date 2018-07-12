package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {

    private Manager manager;

    public Administrator() { }

    public Administrator(String name, int nI, int salary, Manager manager) {
        super(name, nI, salary);
        this.manager = manager;
    }

    @Column(name = "manager")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
