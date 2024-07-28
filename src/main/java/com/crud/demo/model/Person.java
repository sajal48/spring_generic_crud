package com.crud.demo.model;

import com.crud.demo.generics.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table (name = "person")
public  class Person extends BaseEntity implements Serializable {
    private String name;
    private String lastName;
    private Integer age;
    private String city;
    private String address;
}
