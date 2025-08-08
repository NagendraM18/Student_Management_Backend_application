package com.example.Student_Management.Repository;

import com.example.Student_Management.Entitys.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department,String>
{

    Department findByDepartmentId(String id);

    @Transactional
    void deleteByDepartmentId(String id);
}
