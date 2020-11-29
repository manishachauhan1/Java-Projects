package com.example.webAPP.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Employee {

    @ManyToOne
    @JoinColumn(name="employeetypeid", insertable=false, updatable=false)
    private EmployeeType employeeType;
    private Integer employeetypeid;
    private String photo;
    private String username;
}
