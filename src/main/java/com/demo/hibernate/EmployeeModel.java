package com.demo.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String empName;
    private String empQualification;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empId")
    private List<Address> address;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpQualification() {
        return empQualification;
    }

    public void setEmpQualification(String empQualification) {
        this.empQualification = empQualification;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
