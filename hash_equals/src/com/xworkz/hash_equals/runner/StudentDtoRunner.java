package com.xworkz.hash_equals.runner;

import com.xworkz.hash_equals.Dto.StudentDto;

import java.time.LocalDate;

public class StudentDtoRunner {
    public static void main(String[] args) {
        StudentDto studentDto1=new StudentDto("lavanya",7760213946l,"arsikere", LocalDate.of(2003,12,10));
        StudentDto studentDto2=new StudentDto("Lavanya",7760213946l,"arsikere", LocalDate.of(2003,12,10));

        System.out.println("StudentDto1 is equals to Studentdto2:"+studentDto1.equals(studentDto2));
        System.out.println("Student1 hashcode:"+studentDto1.hashCode());
        System.out.println("Student2 hashcode:"+studentDto2.hashCode());
    }
}
