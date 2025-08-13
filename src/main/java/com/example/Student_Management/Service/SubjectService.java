package com.example.Student_Management.Service;

import com.example.Student_Management.DTO.SubjectDto;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Entitys.Subject;
import com.example.Student_Management.Repository.SemesterRepository;
import com.example.Student_Management.Repository.SubjectRepository;
import com.example.Student_Management.customException.SemesterNotFound;
import com.example.Student_Management.customException.SubjectNotFound;
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
    SubjectService(){}
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

    public Subject getsingledata(String id)
    {
         return subjectRepo.findById(id)
                .orElseThrow(()->new SubjectNotFound("subject not found"));
    }

    public void upatedata(SubjectDto subjectDtoObject)
    {
        Subject subjectobject=model.map(subjectDtoObject,Subject.class);
        Semester semeobject=semeRepo.findById(subjectDtoObject.getSemesterid()).
                orElseThrow(()-> new SemesterNotFound("semester Not found"));
        subjectobject.setSemester(semeobject);
        subjectRepo.save(subjectobject);
    }

    public void deletDataBasedOnSubjectId(String id)
    {
        if(!subjectRepo.existsById(id))
        {
            throw  new SubjectNotFound("Subject not found");
        }
        else {
            subjectRepo.deleteById(id);
        }
    }
}
