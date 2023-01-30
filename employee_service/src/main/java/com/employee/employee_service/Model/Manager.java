package com.employee.employee_service.Model;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private Long MangerId;
    private String Mname;

    List<Employee> empList = new ArrayList<Employee>();

    public Manager()
    {

    }

    public Manager(long mangerId, String mname) {
        MangerId = mangerId;
        Mname = mname;
    }



    public Manager(long mangerId, String mname, List<Employee> empList) {
        MangerId = mangerId;
        Mname = mname;
        this.empList = empList;
    }

    public long getMangerId() {
        return MangerId;
    }

    public void setMangerId(long mangerId) {
        MangerId = mangerId;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }






}
