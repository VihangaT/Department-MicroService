package com.vtec.departmentmicroService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long departmentId;
    private String departmentName;
    private  String departmentAddress;
    private String departmentCode;


}
