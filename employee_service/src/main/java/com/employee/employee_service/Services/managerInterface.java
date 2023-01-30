package com.employee.employee_service.Services;

import com.employee.employee_service.Model.Manager;

import java.util.List;

public interface managerInterface {

    public Manager getMangerDetails(Long ManagerId);
    public List<Manager> getAllManagerList();
    public Manager getBymanagerName(StringBuilder Mname);
}
