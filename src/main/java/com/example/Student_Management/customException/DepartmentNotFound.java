package com.example.Student_Management.customException;

public class DepartmentNotFound extends RuntimeException
{
    public DepartmentNotFound(String message)
    {
        super(message);
    }
}
