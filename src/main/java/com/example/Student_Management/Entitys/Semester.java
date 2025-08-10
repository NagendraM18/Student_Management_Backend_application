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


     private long slno;
     @Id
      private String semesterid;
     private  String semester;
     @ManyToOne
     @JoinColumn(name = "department_id")
     private Department departmnetobject;


}
