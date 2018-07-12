import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Gazza", 3729, 45000, 1000000);
        DBHelper.save(manager1);

        Department department1 = new Department("Session Factory", manager1);
        DBHelper.save(department1);

        Administrator administrator1 = new Administrator("Gremlin", 1234, 17000, manager1);
        Administrator administrator2 = new Administrator("Gizmo", 1235, 17500, manager1);
        DBHelper.save(administrator1);
        DBHelper.save(administrator2);

        List<Administrator> administratorsOfManager1 = DBManager.findAdministratorsPerManager(manager1);

        Department departmentOfManager = DBManager.findDepartmentForManager(manager1);

    }
}
