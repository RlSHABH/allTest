package com.example.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

@Service
public class HibernateExample<T> {


    /*adds the row to employee table
    *
    **/


    @Autowired
    private EntityManagerFactory entityManagerFactory;


    public SessionFactory getSessionFactory() {
        return entityManagerFactory.unwrap(SessionFactory.class);
    }

    public void  addEntity()
    {
        // create address object
        Address address=new Address();
        address.setLocation("Noida");
        address.setPinCode("201014");
        List<Address> addressList=new ArrayList();
        addressList.add(address);
        // create employee table
        EmployeeModel employeeModel=new EmployeeModel();
        employeeModel.setEmpName("rishabh");
        employeeModel.setAddress(addressList);

        Session session=getSessionFactory().openSession();
        Transaction t=session.beginTransaction();

        session.save(employeeModel);
        t.commit();
        session.close();


        // save without transaction
        EmployeeModel employeeModel1=new EmployeeModel();
        employeeModel1.setEmpName("rishabh1");
        employeeModel1.setAddress(addressList);

        Session session1 = getSessionFactory().openSession();

        Integer id = (Integer) session1.save(employeeModel1);
        System.out.println("1. Employee save called without transaction, id="+id);
        //session1.flush(); //address will not get saved without this
        System.out.println("*****");



    }
}
