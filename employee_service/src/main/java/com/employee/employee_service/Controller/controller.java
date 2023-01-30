package com.employee.employee_service.Controller;

import com.employee.employee_service.Model.Manager;
import com.employee.employee_service.Services.managerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/Manager")
public class controller {

    @Autowired
    private managerInterface managerinterface;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{managerId}")
    public Manager getManager(@PathVariable("managerId") Long managerId) {

        Manager manager = this.managerinterface.getMangerDetails(managerId);
        List Employee = this.restTemplate.getForObject("http://localhost:9002/Emp/Manager/" + managerId, List.class);
        manager.setEmpList(Employee);
        return manager;

    }

    @GetMapping("/Allmanager")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Manager> getManager() { //todo-done

        return this.managerinterface.getAllManagerList();
    }




}
