package com.example.Student_Management.Service;

import com.example.Student_Management.DTO.SemesterDto;
import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Entitys.Semester;
import com.example.Student_Management.Repository.DepartmentRepository;
import com.example.Student_Management.Repository.SemesterRepository;
import org.modelmapper.ModelMapper;
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
}
