package com.example.Student_Management.Controller;

import com.example.Student_Management.DTO.StudentDto;
import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController
{

  private StudentService stdservice;
  StudentController(){}
  @Autowired
    public StudentController(StudentService stdservice)
    {
        this.stdservice=stdservice;
    }
    @PostMapping("/postData")
    public  Object  postDataToStudent(@RequestBody StudentDto std)
    {
        stdservice.addDataToStudent(std);
        return std;
    }


  @GetMapping("/GetDataFromStudentid/{studentid}")
  public Student specifyData(@PathVariable(value = "studentid") String studentId)
   {
       return stdservice.GetSingleData(studentId);
   }

   @GetMapping("/GetData")
  public List<Student> getdatafromStudent()
    {
       return stdservice.getdata();
   }


   @PutMapping("/updateData")
   public String update(@RequestBody StudentDto dept)
   {
        stdservice.updateData(dept);
        return "updated";
   }


    @DeleteMapping("/deletStudentBySemesterId/{Studentid}")
       public String deletedData(@PathVariable(value = "Studentid") String studentid)
       {
          stdservice.deletDepartment(studentid);
          return "deleted";
       }
}
