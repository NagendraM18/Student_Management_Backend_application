package com.example.Student_Management.customException;

public class SubjectNotFound extends RuntimeException
{
    public SubjectNotFound(String message)
    {
        super(message);
    }
}
