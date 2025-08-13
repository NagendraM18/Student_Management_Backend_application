package com.example.Student_Management.Service;

import com.example.Student_Management.DTO.MarksDTO;
import com.example.Student_Management.DTO.MarksOutputDto;
import com.example.Student_Management.DTO.SPGA_And_Result;
import com.example.Student_Management.Entitys.Marks;
import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Entitys.Subject;
import com.example.Student_Management.Repository.StudentRepository;
import com.example.Student_Management.Repository.SubjectRepository;
import com.example.Student_Management.Repository.marksRepository;
import com.example.Student_Management.customException.SubjectNotFound;
import com.example.Student_Management.customException.studentNotfound;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarksService
{

    private marksRepository marksrepo;
    private ModelMapper model;
    private SubjectRepository subjectobject;
    private StudentRepository studentobject;
    MarksService(){}

    @Autowired
    public MarksService(marksRepository marksrepo,ModelMapper model,StudentRepository studnetobject,SubjectRepository subjectobject)
    {
        this.marksrepo=marksrepo;
        this.model=model;
        this.studentobject=studnetobject;
        this.subjectobject=subjectobject;
    }

    public void adddata(MarksDTO marksobject)
    {
        Marks mar=model.map(marksobject, Marks.class);
        Subject sub=subjectobject.findById(marksobject.getSubjectid())
                .orElseThrow(()->new SubjectNotFound("SubjectNotFound"));
        Student std=studentobject.findById(marksobject.getStudentid())
                .orElseThrow(()->new studentNotfound("Student Not found"));

        mar.setStudent(std);
        mar.setSubject(sub);
       marksrepo.save(mar);
    }

    public SPGA_And_Result getlist(String id)
    {
       List<Marks> mark=marksrepo.findByStudentStudentId(id);
       List<MarksOutputDto> output=mark.stream()
               .map(marks->model.map(marks, MarksOutputDto.class))
               .collect(Collectors.toList());
       List<Double> marks=output.stream()
               .map(dto->dto.getMarks())
               .collect(Collectors.toList());
           Double sum=0.0;
         for(Double result:marks)
         {
           sum+=result;
         }
         Double Sgpa=sum/marks.size();

       return new SPGA_And_Result(output,Sgpa);

    }

}
