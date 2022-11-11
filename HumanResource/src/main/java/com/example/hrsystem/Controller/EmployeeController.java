package com.example.hrsystem.Controller;

import com.example.hrsystem.Entity.Employee;
import com.example.hrsystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return service.getAllEmployee();
    }

    @PostMapping("/add")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return service.newEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmploy(employee);
    }

    @DeleteMapping("delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
    }

}
