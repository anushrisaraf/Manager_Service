package com.employee.employee_service.Services;

import com.employee.employee_service.Model.Employee;
import com.employee.employee_service.Model.Manager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class managerImpl implements managerInterface{

    List<Manager> ManagerList = List.of(
            new Manager(1361L, "Prashant Tiwari"),
             new Manager(1161L, "Krishnana P"),
              new Manager(1881L, "Jayesh Mahajan"),
               new Manager(4444L, "Anushree Saraf")

    );
    @Override
    public Manager getMangerDetails(Long managerId) {

        return ManagerList.stream().filter(user->user.getMangerId()==(managerId)).findAny().orElse(null);

    }


    public List<Manager> getAllManagerList() {
       return ManagerList;
    }

    public Manager getBymanagerName(StringBuilder Mname)
    {
        return ManagerList.stream().filter(user->user.getMname().equals(String.valueOf(Mname))).findAny().orElse(null);
    }





}
