package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigDecimal balance;

}
