package com.example.Student_Management.customException;

public class SemesterNOtFoundAddSemesterFirst extends RuntimeException
{
    public SemesterNOtFoundAddSemesterFirst(String message)
    {
        super(message);
    }
}
