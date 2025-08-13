package com.example.Student_Management.Service;

import com.example.Student_Management.DTO.StudentDto;
import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Entitys.Student;
import com.example.Student_Management.Repository.DepartmentRepository;
import com.example.Student_Management.Repository.SemesterRepository;
import com.example.Student_Management.Repository.StudentRepository;
import com.example.Student_Management.customException.SemesterNotFound;
import com.example.Student_Management.customException.studentNotfound;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{

    private StudentRepository stdRepo;
    private SemesterRepository semeRepo;
    private ModelMapper model;

    StudentService(){}
    @Autowired
    public StudentService(StudentRepository stdRepo, SemesterRepository semeRepo,ModelMapper model)
    {
        this.stdRepo=stdRepo;
        this.semeRepo=semeRepo;
        this.model=model;
    }
   public void addDataToStudent(StudentDto std)
    {
       Student stdobject=model.map(std, Student.class);
       String semesterId=std.getSemesterid();
        if(semesterId!=null)
        {
          Optional<Semester> semester=semeRepo.findById(semesterId);
          if(semester.isPresent()){
              stdobject.setSemester(semester.get());
              stdRepo.save(stdobject);
           }
          else {
              throw new SemesterNotFound("semester NOt found");
          }
        }
        stdRepo.save(stdobject);
   }

    public Student GetSingleData(String StudentId)
    {
       return  stdRepo.findById(StudentId)
               .orElseThrow(()->new studentNotfound("StudentNotFound"));
    }

    public List<Student> getdata()
    {
        return  stdRepo.findAll();
    }

    public void updateData(StudentDto student)
    {
        Student stdobject=model.map(student, Student.class);

        Semester semeobjects=semeRepo.findById(student.getSemesterid()).get();

        stdobject.setSemester(semeobjects);
        stdRepo.save(stdobject);

    }

    public void deletDepartment(String Studentid)
    {
        if(!stdRepo.existsById(Studentid))
        {
            throw  new studentNotfound("Student Not found");
        }
        stdRepo.deleteById(Studentid);

    }
}
