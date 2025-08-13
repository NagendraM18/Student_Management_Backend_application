package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Semester
{


     @Column(name = "slno")
     private long slno;
     @Id
     @Column(name = "semesterId")
      private String semesterId;
     @Column(name = "semesterName")
     private  String semesterName;
     @ManyToOne
     @JoinColumn(name = "departmentId")
     private Department departmnetobject;


}
