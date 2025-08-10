package com.example.Student_Management.ExceptionController;

import com.example.Student_Management.customException.DepartmentNotFound;
import com.example.Student_Management.customException.SemesterNOtFoundAddSemesterFirst;
import com.example.Student_Management.customException.SemesterNotFound;
import com.example.Student_Management.customException.studentNotfound;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Component
public class ControllerException
{
    @ExceptionHandler(SemesterNotFound.class)
    public String SemesterNotFoundExceptionMethod(SemesterNotFound ex)
    {
        return ex.getMessage();
    }
    @ExceptionHandler(DepartmentNotFound.class)
    public String DepartmnetNotFoundExceptionMethod(DepartmentNotFound ex)
    {
        return ex.getMessage();
    }

    @ExceptionHandler(SemesterNOtFoundAddSemesterFirst.class)
    public String SEmesterNOtFoundException(SemesterNOtFoundAddSemesterFirst ex)
    {
        return ex.getMessage();
    }

    @ExceptionHandler(studentNotfound.class)
    public String StudentNotFoundEXception( studentNotfound  ex)
    {
        return ex.getMessage();
    }
}
