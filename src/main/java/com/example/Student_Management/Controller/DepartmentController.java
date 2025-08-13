package com.example.Student_Management.Controller;

import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmentController
{
    private DepartmentService deptservice;

    DepartmentController(){}
    @Autowired
   public DepartmentController(DepartmentService deptservice)
   {
       this.deptservice=deptservice;
   }
    @PostMapping("/postData")
    public  Object  postData(@RequestBody Department dept)
    {
        deptservice.addDataToDepartment(dept);
        return dept;
    }


    @GetMapping("/GetDataFromDepartmentId/{departmentId}")
    public Department specifyData(@PathVariable(value = "departmentId") String departmentId)
    {
        return deptservice.GetSingleData(departmentId);
    }

    @GetMapping("/GetData")
    public List<Department> getdatafromdepartment()
    {
        return deptservice.getdata();
    }


    @PutMapping("/updateData")
    public String update(@RequestBody Department dept)
    {
        deptservice.updateData(dept);
        return "updated";
    }

    @DeleteMapping("/deletDepartment/{departmentid}")
    public String deletedData(@PathVariable(value = "departmentid") String id)
    {
        deptservice.deletDepartment(id);
        return "deleted";
    }

}
