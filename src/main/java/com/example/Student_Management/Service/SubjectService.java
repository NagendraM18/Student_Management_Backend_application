package com.example.Student_Management.Service;

import com.example.Student_Management.DTO.SubjectDto;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Entitys.Subject;
import com.example.Student_Management.Repository.SemesterRepository;
import com.example.Student_Management.Repository.SubjectRepository;
import com.example.Student_Management.customException.SemesterNotFound;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService
{

    private SubjectRepository subjectRepo;
    private SemesterRepository semeRepo;
    private ModelMapper model;
    @Autowired
    public SubjectService(SubjectRepository subjectRepo,SemesterRepository semeRepo,ModelMapper model)
    {
        this.subjectRepo=subjectRepo;
        this.semeRepo=semeRepo;
        this.model=model;
    }


    public void addData(SubjectDto subjectobject)
    {
        Subject subobject=model.map(subjectobject,Subject.class);
        Semester semeobject=semeRepo.findById(subjectobject.getSemesterid())
                 .orElseThrow(()->new SemesterNotFound("Semester Not Found"));
        subobject.setSemester(semeobject);
        subjectRepo.save(subobject);
    }

    public List<Subject> getdata()
    {
        return subjectRepo.findAll();
    }
}
