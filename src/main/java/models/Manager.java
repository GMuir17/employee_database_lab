package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private int budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager() {}

    public Manager(String name, int nI, int salary, int budget, Department department) {
        super(name, nI, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Column(name = "department")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column(name = "administrators")
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }
}
