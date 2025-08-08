package com.example.Student_Management.Controller;

import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class StudentController
{

//    private StudentService stdservice;
//    @Autowired
//    public StudentController(StudentService stdservice)
//    {
//        this.stdservice=stdservice;
//    }
//    @PostMapping("/postData")
//    public  Object  postDataToStudent(@RequestBody Student std)
//    {
//        stdservice.addDataToStudent(std);
//        return std;
//    }


//    @GetMapping("/GetDataFromDepartmentId/{departmentId}")
//    public Department specifyData(@PathVariable(value = "departmentId") String departmentId)
//    {
//        return stdservice.GetSingleData(departmentId);
//    }
//
//    @GetMapping("/GetData")
//    public List<Department> getdatafromdepartment()
//    {
//        return stdservice.getdata();
//    }
//
//
//    @PutMapping("/updateData")
//    public String update(@RequestBody Department dept)
//    {
//        deptservice.updateData(dept);
//        return "updated";
//    }
//
//    @DeleteMapping("/deletDepartment/{departmentid}")
//    public String deletedData(@PathVariable(value = "departmentid") String id)
//    {
//        stdservice.deletDepartment(id);
//        return "deleted";
//    }
}
