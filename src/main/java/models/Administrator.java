package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {

    private Manager manager;

    public Administrator() { }

    public Administrator(String name, int nI, int salary, Manager manager) {
        super(name, nI, salary);
        this.manager = manager;
    }

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
