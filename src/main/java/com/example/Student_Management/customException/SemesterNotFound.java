package com.example.Student_Management.customException;

public class SemesterNotFound extends RuntimeException
{
        public SemesterNotFound(String message)
        {
            super(message);
        }

}
