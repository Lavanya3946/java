package com.xworkz.playStore.Employee;

public class EmployeeSaveDetails {
    EmployeeDto employeeDto[]=new EmployeeDto[5];
    int index=0;

    public  String employeeSaveDetails(EmployeeDto dto){
        if (dto!=null){
           employeeDto[index]=dto;
           index++;
           return "Employee data is saved..";
        }
        else {
            return "Employee data is not saved..";
        }
    }

     public  void read(){
         for (int index = 0; index <employeeDto.length; index++) {
             System.out.println(employeeDto[index]);
         }
     }
    public  void findEmployeeByName(String name){
        for (int i = 0; i <employeeDto.length ; i++) {
            if (employeeDto[i].getName()==name){
                System.out.println("Employee data by name:"+employeeDto[i]);
            }
        }
    }
     public  void findEmployeeBySalary(int salary){
         for (int i = 0; i <employeeDto.length ; i++) {
             if (employeeDto[i].getSalary()==salary){
                 System.out.println("Employee data by Salary:"+employeeDto[i]);
             }
         }
     }

     public  void findEmployeeById(int id){
         for (int i = 0; i < employeeDto.length; i++) {
             if (employeeDto[i].getId()==id){
                 System.out.println("Employee data by Id:"+employeeDto[i]);
             }
         }
     }
     public  void findEmployeeByNoOfExperience(int NoOfExperience){
         for (int i = 0; i <employeeDto.length ; i++) {
             if (employeeDto[i].getNoOfExperience()==NoOfExperience){
                 System.out.println("Employee data by NoofExperience:"+employeeDto[i]);
             }

         }
     }
}
