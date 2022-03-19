package com.vtec.departmentmicroService.service;

import com.vtec.departmentmicroService.entity.Department;
import com.vtec.departmentmicroService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Department Saving Service");
        return departmentRepository.save(department);
    }
}
