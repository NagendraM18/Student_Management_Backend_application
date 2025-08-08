package com.example.Student_Management.Service;

import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Repository.DepartmentRepository;
import com.example.Student_Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService
{

    private StudentRepository stdRepo;
    private DepartmentRepository departmentobject;
    @Autowired
    public StudentService(StudentRepository stdRepo, DepartmentRepository departmentobject)
    {
        this.stdRepo=stdRepo;
        this.departmentobject=departmentobject;
    }
//    public void addDataToStudent(Student std)
//    {
//        Department dept=std.getDepartment();
//        if(dept!=null)
//        {
//           Optional<Department> dept1=departmentobject.findById(dept.getSlno());
//           if(dept1.isPresent()){
//               std.setDepartment(dept1.get());
//           }
//           else
//           {
//               departmentobject.save(dept);
//               std.setDepartment(dept);
//           }
//        }
//        stdRepo.save(std);
//    }
}
