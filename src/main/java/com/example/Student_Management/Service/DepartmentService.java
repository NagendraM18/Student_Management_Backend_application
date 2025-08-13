package com.example.Student_Management.Service;

import com.example.Student_Management.Entitys.Department;
import com.example.Student_Management.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository deptrepo;

    DepartmentService(){}
    @Autowired
    public DepartmentService(DepartmentRepository deptrepo) {
        this.deptrepo = deptrepo;
    }

    public void addDataToDepartment( Department dept)
    {
        deptrepo.save(dept);
    }

    public void updateData(Department dept)
    {
        deptrepo.save(dept);
    }

    public Department GetSingleData(String id)
    {
       return deptrepo.findByDepartmentId(id);
    }

    public void deletDepartment(String id)
    {
        deptrepo.deleteByDepartmentId(id);
    }

    public List<Department> getdata()
    {
        return deptrepo.findAll();
    }
}
