package com.xworkz.playStore.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setId(1);
        employeeDto1.setName("lavanya");
        employeeDto1.setCompanyName("wipro");
        employeeDto1.setSalary(24000);
        employeeDto1.setNoOfExperience(3);
        EmployeeSaveDetails employeeSaveDetails = new EmployeeSaveDetails();
        String msg1 = employeeSaveDetails.employeeSaveDetails(employeeDto1);
        System.out.println(msg1);


        EmployeeDto employeeDto2 = new EmployeeDto();
        employeeDto2.setId(2);
        employeeDto2.setName("Monika");
        employeeDto2.setCompanyName("IBM");
        employeeDto2.setSalary(24000);
        employeeDto2.setNoOfExperience(3);
        String msg2 = employeeSaveDetails.employeeSaveDetails(employeeDto2);
        System.out.println(msg2);


        EmployeeDto employeeDto3 = new EmployeeDto();
        employeeDto3.setId(3);
        employeeDto3.setName("Meghana");
        employeeDto3.setCompanyName("Infosys");
        employeeDto3.setSalary(27000);
        employeeDto3.setNoOfExperience(2);

        String msg3 = employeeSaveDetails.employeeSaveDetails(employeeDto3);
        System.out.println(msg3);


        EmployeeDto employeeDto4 = new EmployeeDto();
        employeeDto4.setId(1);
        employeeDto4.setName("Sanju");
        employeeDto4.setCompanyName("Coldman");
        employeeDto4.setSalary(24000);
        employeeDto4.setNoOfExperience(3);

        String msg4 = employeeSaveDetails.employeeSaveDetails(employeeDto4);
        System.out.println(msg4);


        EmployeeDto employeeDto5 = new EmployeeDto();
        employeeDto5.setId(5);
        employeeDto5.setName("Harshan");
        employeeDto5.setCompanyName("Proman");
        employeeDto5.setSalary(29000);
        employeeDto5.setNoOfExperience(5);

        String msg5 = employeeSaveDetails.employeeSaveDetails(employeeDto5);
        System.out.println(msg5);



        employeeSaveDetails.read();
        System.out.println("_________________");
        employeeSaveDetails.findEmployeeById(5);
        employeeSaveDetails.findEmployeeByName("lavanya");
        employeeSaveDetails.findEmployeeByNoOfExperience(5);
        employeeSaveDetails.findEmployeeBySalary(24000);
    }
}
