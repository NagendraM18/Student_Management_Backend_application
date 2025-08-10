package com.example.Student_Management.customException;

public class studentNotfound extends  RuntimeException
{
    public studentNotfound(String meassage)
    {
        super(meassage);//
    }
}
