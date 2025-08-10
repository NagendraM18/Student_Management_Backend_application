package com.example.Student_Management.Controller;

import com.example.Student_Management.DTO.SemesterDto;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester")
public class SemesterController
{

    private SemesterService semeservice;
    @Autowired
    public SemesterController(SemesterService semeservice)
    {
        this.semeservice=semeservice;
    }

    @PostMapping("/addsemester")
    public Semester addData(@RequestBody Semester seme)
    {
        semeservice.addDataToSemester(seme);
        return seme;
    }

    @GetMapping("/getData")
    public List<Semester> getdata()
    {
       return semeservice.getdatafromSemester();
    }

    @GetMapping("/GetDataFromID/{semesterid}")
    public Semester getDataFromID(@PathVariable(value = "semesterid") String semesterid)
    {
        return semeservice.getfromfromid(semesterid);

    }

    @PutMapping("/updateData")
    public SemesterDto updateData(@RequestBody SemesterDto semeDto)
    {
        semeservice.updateData(semeDto);
                return semeDto;
    }


}
