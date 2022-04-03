package com.vtec.departmentmicroService.controller;

import com.vtec.departmentmicroService.entity.Department;
import com.vtec.departmentmicroService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Department Saving Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/test")
    public String getText(){
        log.info("checker");
        return "vihanga";
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Searching for a department by ID");
        return departmentService.findDepartmentById(departmentId);
    }
}
