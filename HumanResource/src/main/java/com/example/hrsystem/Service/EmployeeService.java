package com.example.hrsystem.Service;

import com.example.hrsystem.DAO.EmployeeRepository;
import com.example.hrsystem.Entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    public Employee newEmployee(Employee employee) {
        return repo.save(employee);
    }

    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }

    public Employee updateEmploy(Employee employee) {
        Employee temp = repo.findById(employee.getEmpid()).orElse(null);
        temp.setName(employee.getName());
        temp.setJob(employee.getJob());
        temp.setManager(employee.getManager());
        temp.setDeptid(employee.getDeptid());
        temp.setHiredate(employee.getHiredate());
        temp.setSalary(employee.getSalary());
        return repo.save(temp);
    }
}
