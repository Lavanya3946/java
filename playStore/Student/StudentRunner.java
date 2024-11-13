package com.xworkz.playStore.Student;

public class StudentRunner {
    public static void main(String[] args) {
       StudentDto studentDto1=new StudentDto();
       studentDto1.setName("lavanya");
       studentDto1.setAge(21);
       studentDto1.setEmail("lavanya@gmail.com");
       studentDto1.setHeight(5.3);
        studentDto1.setWeight(54);
        studentDto1.setAddress("arsikere");

        StudentSaveDetails studentSaveDetails=new StudentSaveDetails();
        String msg1=studentSaveDetails.studentDetailsSave(studentDto1);
        System.out.println(msg1);


        StudentDto studentDto2=new StudentDto();
        studentDto2.setName("Monika");
        studentDto2.setAge(19);
        studentDto2.setEmail("monika@gmail.com");
        studentDto2.setHeight(5);
        studentDto2.setWeight(54);
        studentDto2.setAddress("Tiptur");


        String msg2=studentSaveDetails.studentDetailsSave(studentDto2);
        System.out.println(msg2);

        StudentDto studentDto3=new StudentDto();
        studentDto3.setName("Yashuu");
        studentDto3.setAge(21);
        studentDto3.setEmail("monika@gmail.com");
        studentDto3.setHeight(5.2);
        studentDto3.setWeight(50);
        studentDto3.setAddress("Hosadurga");


        String msg3=studentSaveDetails.studentDetailsSave(studentDto3);
        System.out.println(msg3);


        StudentDto studentDto4=new StudentDto();
        studentDto4.setName("Kishore");
        studentDto4.setAge(21);
        studentDto4.setEmail("kishore@gmail.com");
        studentDto4.setHeight(5.4);
        studentDto4.setWeight(60);
        studentDto4.setAddress("Banglore");


        String msg4=studentSaveDetails.studentDetailsSave(studentDto4);
        System.out.println(msg4);

        StudentDto studentDto5=new StudentDto();
        studentDto5.setName("Nandan");
        studentDto5.setAge(21);
        studentDto5.setEmail("nandan@gmail.com");
        studentDto5.setHeight(5.2);
        studentDto5.setWeight(58);
        studentDto5.setAddress("ChitraDurga");

        String msg5=studentSaveDetails.studentDetailsSave(studentDto5);
        System.out.println(msg5);
        studentSaveDetails.read();
        System.out.println("___________________");
        studentSaveDetails.findStudentByAge(21);
        studentSaveDetails.findStudentByEmail("nandan@gmail.com");
        studentSaveDetails.findStudentByheight(5);
        studentSaveDetails.findStudentByWeight(50);
        studentSaveDetails.findStudentByName("Monika");


    }
}
