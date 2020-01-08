package com.ujy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name",length = 100,nullable = true)
    private String name;

    @Column(name = "age",nullable = false,length = 4)
    private Integer age;
}
