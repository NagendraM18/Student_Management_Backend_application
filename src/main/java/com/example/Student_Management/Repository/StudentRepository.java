package com.example.Student_Management.Repository;

import com.example.Student_Management.Entitys.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{

}
