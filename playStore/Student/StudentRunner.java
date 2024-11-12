package com.xworkz.playStore.Student;

public class StudentRunner {
    public static void main(String[] args) {
        StudentInfo[] studentInfo=new StudentInfo[5];
        studentInfo[0]=new StudentInfo("lavanya","lavanya@gmail.com",21,54,5,"ask");
        studentInfo[1]=new StudentInfo("monika","monika@gmail.com",21,59,5,"blgore");
        studentInfo[2]=new StudentInfo("nandini","nandini@gmail.com",21,54,5,"tumkur");
        studentInfo[3]=new StudentInfo("shaku","shaku@gmail.com",20,54,4,"smg");
        studentInfo[4]=new StudentInfo("vidya","vidya@gmail.com",20,54,5,"udupi");

        System.out.println("students:");
        for(StudentInfo studentInfo1:studentInfo){
            System.out.println(studentInfo1);
            studentInfo1.checkAge();

        }
    }
}
