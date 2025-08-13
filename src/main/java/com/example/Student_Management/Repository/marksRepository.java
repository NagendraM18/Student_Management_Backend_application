package com.example.Student_Management.Repository;

import com.example.Student_Management.Entitys.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.error.Mark;

import java.util.List;

@Repository
public interface marksRepository extends JpaRepository<Marks,String>
{


    List<Marks> findByStudentStudentId(String id);
}
