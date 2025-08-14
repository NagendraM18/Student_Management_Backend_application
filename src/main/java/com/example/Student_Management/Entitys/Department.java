package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department
{


    @Column(name = "slno")
    private long slno;
    @Column(name = "departmentid")
    private String departmentId;
    @Id
    @Column(name="departmentname")
    private String departmentName;


}
