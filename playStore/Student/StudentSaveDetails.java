package com.xworkz.playStore.Student;

public class StudentSaveDetails {
    StudentDto studentDto[]=new  StudentDto[5];
     int index=0;

     public  String studentDetailsSave(StudentDto dto){
         if(dto!=null) {
             studentDto[index] = dto;
             index++;
             return "Student data is saved..";
         }
             else{
                 return"Student data is not saved";

             }
         }
           public  void read(){
               for (int index = 0; index <studentDto.length; index++) {
                   System.out.println(studentDto[index]);
               }
           }
           public void findStudentByAge(int age){
               for (int i = 0; i < studentDto.length; i++) {
                   if (studentDto[i].getAge()<age){
                       System.out.println("Student data by Age:"+studentDto[i]);
                   }
               }
           }

            public  void findStudentByName(String name){
                for (int i = 0; i <studentDto.length ; i++) {
                    if (studentDto[i].getName()==name){
                        System.out.println("Student data by Name:"+studentDto[i]);
                    }
                }
            }
            public void findStudentByEmail(String email){
                for (int i = 0; i <studentDto.length ; i++) {
                    if (studentDto[i].getEmail()==email){
                        System.out.println("Student data by Email:"+studentDto[i]);
                    }
                }
            }
    public void findStudentByheight(int height){
        for (int i = 0; i <studentDto.length ; i++) {
            if (studentDto[i].getHeight()==height){
                System.out.println("Student data by Height:"+studentDto[i]);
            }
        }
    }
    public void findStudentByWeight(int weight){
        for (int i = 0; i <studentDto.length ; i++) {
            if (studentDto[i].getWeight()==weight){
                System.out.println("Student data by Weight:"+studentDto[i]);
            }
        }
    }

}
