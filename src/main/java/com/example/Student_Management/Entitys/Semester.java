package com.example.Student_Management.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Semester
{


     @Column(name = "slno")
     private long slno;
     @Id
     @Column(name = "semesterid")
      private String semesterId;
     @Column(name = "semestername")
     private  String semesterName;
     @ManyToOne
     @JoinColumn(name = "departmentid")
     private Department departmentObject;


}
