package com.example.Student_Management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SPGA_And_Result
{
    private List<MarksOutputDto> marks;
    private Double Sgpa;
}
