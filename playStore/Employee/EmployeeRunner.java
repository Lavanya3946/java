package com.xworkz.playStore.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDto[] employeeDto=new EmployeeDto[5];
        employeeDto[0]=new EmployeeDto("lavanya","wipro",40000,34,1);
        employeeDto[1]=new EmployeeDto("monika","IBM",15000,340,1);
        employeeDto[2]=new EmployeeDto("yashu","Tcs",42000,341,1);
        employeeDto[3]=new EmployeeDto("sanju","proman",20000,13,2);

        employeeDto[4]=new EmployeeDto("harshan","coldman",20000,32,3);

        System.out.println("Employess:");
        for (EmployeeDto employeeDto1:employeeDto){
            System.out.println(employeeDto1.toString());
            employeeDto1.checkSalary();
        }


    }
}
