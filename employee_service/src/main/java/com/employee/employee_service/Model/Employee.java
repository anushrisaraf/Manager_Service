package com.employee.employee_service.Model;

public class Employee {

    private Long EmpId;
    private String EmpName;

    private Long MangerId;

    public Employee(Long empId, String empName, Long mangerId) {
        EmpId = empId;
        EmpName = empName;
        MangerId = mangerId;
    }

    public Employee()
    {

    }

    public long getEmpId() {
        return EmpId;
    }

    public void setEmpId(long empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public long getMangerId() {
        return MangerId;
    }

    public void setMangerId(long mangerId) {
        MangerId = mangerId;
    }
}
