package db;

import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBManager {

    private static Session session;

    public static List<Administrator> findAdministratorsPerManager(Manager manager) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Administrator> administrators = null;

        try {
            Criteria cr = session.createCriteria(Administrator.class);
            cr.add(Restrictions.eq("manager", manager));
            administrators = cr.list();
        }
        catch(HibernateException e) {
            e.printStackTrace();
        }
        finally {
            session.close();
        }

        return administrators;
    }

    public static Department findDepartmentForManager(Manager manager){
        session = HibernateUtil.getSessionFactory().openSession();
        Department department = null;

        try {
            Criteria cr = session.createCriteria(Department.class);
            cr.add(Restrictions.eq("manager", manager));
            department = (Department) cr.uniqueResult();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return department;
    }

}
