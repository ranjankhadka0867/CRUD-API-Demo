package com.crudApi.CrudApi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String age;

}
