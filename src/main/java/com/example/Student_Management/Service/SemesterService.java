package com.example.Student_Management.Service;

import com.example.Student_Management.DTO.SemesterDto;
import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Repository.DepartmentRepository;
import com.example.Student_Management.Repository.SemesterRepository;
import com.example.Student_Management.customException.DepartmentNotFound;
import com.example.Student_Management.customException.SemesterNOtFoundAddSemesterFirst;
import com.example.Student_Management.customException.SemesterNotFound;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterService
{
   private SemesterRepository semeRepo;
   private ModelMapper model;
   private DepartmentRepository deptrepoobject;

   SemesterService(){}

   @Autowired
   public SemesterService(SemesterRepository semeRepo,ModelMapper model,DepartmentRepository deptrepoobject)
   {
       this.semeRepo=semeRepo;
       this.model=model;
       this.deptrepoobject=deptrepoobject;
   }

    public void addDataToSemester(Semester seme)
    {
        Department object=seme.getDepartmnetobject();
        Optional<Department> deptobject=deptrepoobject.findById(object.getDepartmentName());
        if(deptobject.isPresent())
        {
            seme.setDepartmnetobject(deptobject.get());
        }
        else{
           deptrepoobject.save(object);
           seme.setDepartmnetobject(object);

        }
        semeRepo.save(seme);
    }

    public List<Semester> getdatafromSemester()
    {
        return semeRepo.findAll();
    }

    public Semester getfromfromid(String id) {
        return semeRepo.findById(id)
                .orElseThrow(()->new SemesterNotFound("semester not present"));
    }

    public void updateData(SemesterDto semeDto)
    {
        Semester semeobject=model.map(semeDto, Semester.class);
        Semester semesterobject=semeRepo.findById(semeobject.getSemesterid())
                .orElseThrow(()->new SemesterNOtFoundAddSemesterFirst("SemesterNOtFoundAddSemesterFirst"));
        Optional<Department> deptobject1=deptrepoobject.findById(semeDto.getDepartmentname());
        if(semesterobject.getDepartmnetobject().getDepartmentName().equals(semeDto.getDepartmentname()))
        {
            semeobject.setDepartmnetobject(deptobject1.get());
            semeRepo.save(semeobject);
        }
        else {
            throw new DepartmentNotFound("departent Not Found");
        }
    }
}
