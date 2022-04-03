package com.vtec.departmentmicroService.service;

import com.vtec.departmentmicroService.entity.Department;
import com.vtec.departmentmicroService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findDepartmentById(Long departmentId) {
        log.info("Executing findDepartmentByIDService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public Department saveDepartment(Department department) {
        log.info("Department Saving Service");
        return departmentRepository.save(department);
    }


}
