package com.example.hrsystem.Service;

import com.example.hrsystem.DAO.SalaryReportRepository;
import com.example.hrsystem.Entity.SalaryReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryReportService {
    @Autowired
    SalaryReportRepository repo;

    public SalaryReport getSalaryReportById(String job, String department) {
        return repo.findByJobAndDepartment(job, department);
    }

    public List<SalaryReport> getSalaryReports() {
        return repo.findAll();
    }
}
