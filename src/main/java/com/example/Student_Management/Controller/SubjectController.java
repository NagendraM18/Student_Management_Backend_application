package com.example.Student_Management.Controller;

import com.example.Student_Management.DTO.SubjectDto;
import com.example.Student_Management.Entitys.Subject;
import com.example.Student_Management.Repository.SubjectRepository;
import com.example.Student_Management.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Subject")
public class SubjectController
{

    private SubjectService subjectservice;


    @Autowired
    public SubjectController(SubjectService subjectservice)
    {
        this.subjectservice=subjectservice;
    }


    @PostMapping("/postData")
    public SubjectDto Postdata(@RequestBody SubjectDto subjectobject)
    {
        subjectservice.addData(subjectobject);
        return subjectobject;
    }

    @GetMapping("/Getdata")
    public List<Subject> GetData()
    {
        return subjectservice.getdata();

    }
}
