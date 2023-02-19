package com.example.case_study.model;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "datetime")
    private String startDate;
    @Column(columnDefinition = "datetime")
    private String endDate;

    private double deposit;

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;

    



}
