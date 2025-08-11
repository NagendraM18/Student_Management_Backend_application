package com.example.Student_Management.Controller;

import com.example.Student_Management.DTO.MarksDTO;
import com.example.Student_Management.DTO.MarksOutputDto;
import com.example.Student_Management.DTO.SPGA_And_Result;
import com.example.Student_Management.Entitys.Marks;
import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Entitys.Subject;
import com.example.Student_Management.Service.MarksService;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AddMarks")
public class MarksController
{

    private MarksService marksservice;

    MarksController(){

    }
    @Autowired
    public MarksController(MarksService marksservice)
    {
        this.marksservice=marksservice;
    }

    @PostMapping("/postdata")
    public MarksDTO postdata(@RequestBody MarksDTO marksobject)
    {
        marksservice.adddata(marksobject);
        return marksobject;
    }

    @GetMapping("/Getdata/{studentid}")
    public ResponseEntity<SPGA_And_Result> getdata(@PathVariable(value = "studentid") String id)
    {
        SPGA_And_Result object= marksservice.getlist(id);
        return ResponseEntity.ok()
                .body(object);
    }


}
