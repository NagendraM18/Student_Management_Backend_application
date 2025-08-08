package com.example.Student_Management.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass
{
    @Bean
    public ModelMapper Configuration()
    {
        return new ModelMapper();
    }
}
